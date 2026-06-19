package com.kele.keleoj.judge;

import com.kele.keleoj.judge.strategy.DefaultJudgeStrategy;
import com.kele.keleoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.kele.keleoj.judge.strategy.JudgeContext;
import com.kele.keleoj.judge.strategy.JudgeStrategy;
import com.kele.keleoj.judge.codesandbox.model.JudgeInfo;
import com.kele.keleoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
