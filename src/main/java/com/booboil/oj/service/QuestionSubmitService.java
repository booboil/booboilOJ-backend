package com.booboil.oj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.booboil.oj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.booboil.oj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.booboil.oj.model.entity.QuestionSubmit;
import com.booboil.oj.model.entity.User;

/**
* @author booboil
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-01-06 19:38:24
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

}
