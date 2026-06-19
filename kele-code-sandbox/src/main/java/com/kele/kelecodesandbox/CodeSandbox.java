package com.kele.kelecodesandbox;


import com.kele.kelecodesandbox.model.ExecuteCodeRequest;
import com.kele.kelecodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
