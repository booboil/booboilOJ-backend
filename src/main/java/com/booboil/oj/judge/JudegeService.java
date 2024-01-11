package com.booboil.oj.judge;

import com.booboil.oj.model.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudegeService {

    /**
     * 判题服务
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
