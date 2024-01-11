package com.booboil.oj.judge;

import com.booboil.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.booboil.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 判题服务
 */
public interface JudegeService {

    /**
     * 判题服务
     * @param questionSubmitId
     * @return
     */
    ExecuteCodeResponse doJudge(long questionSubmitId);
}
