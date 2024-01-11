package com.booboil.oj.judge;

import com.booboil.oj.judge.codesandbox.model.JudgeInfo;
import com.booboil.oj.judge.strategy.DefaultJudgeStrategy;
import com.booboil.oj.judge.strategy.JavaLanguageStrategy;
import com.booboil.oj.judge.strategy.JudgeContext;
import com.booboil.oj.judge.strategy.JudgeStrategy;
import com.booboil.oj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
