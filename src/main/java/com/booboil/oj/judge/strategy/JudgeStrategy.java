package com.booboil.oj.judge.strategy;

import com.booboil.oj.judge.codesandbox.model.JudgeInfo;
import com.booboil.oj.model.enums.JudgeInfoMessageEnum;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);

}
