package com.kele.keleoj.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.setting.dialect.Props;
import com.kele.keleoj.common.ErrorCode;
import com.kele.keleoj.exception.BusinessException;
import com.kele.keleoj.judge.codesandbox.CodeSandbox;
import com.kele.keleoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.kele.keleoj.judge.codesandbox.model.ExecuteCodeResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * 远程代码沙箱（实际调用接口的沙箱）
 */
public class RemoteCodeSandbox implements CodeSandbox {

    // 鉴权请求头名称
    private static final String AUTH_REQUEST_HEADER = "auth";

    /**
     * 从配置文件读取沙箱地址和密钥
     * 使用 Hutool Props 直接读 application.yml，不依赖 Spring 注入，
     * 这样工厂 new 出来的实例也能读到配置
     */
    private static final String SANDBOX_URL;
    private static final String AUTH_REQUEST_SECRET;

    static {
        // 支持不同环境的配置文件：application.yml / application-dev.yml 等
        String profile = System.getProperty("spring.profiles.active", "");
        String configFile = "application.yml";
        if (!profile.isEmpty()) {
            configFile = "application-" + profile + ".yml";
        }
        Props props = new Props(configFile);
        SANDBOX_URL = props.getStr("codesandbox.url", "http://localhost:8090");
        AUTH_REQUEST_SECRET = props.getStr("codesandbox.auth.secret", "secretKey");
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = SANDBOX_URL + "/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR, "executeCode remoteSandbox error, message = " + responseStr);
        }
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
