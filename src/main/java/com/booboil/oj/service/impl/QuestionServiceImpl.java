package com.booboil.oj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.booboil.oj.mapper.QuestionMapper;
import com.booboil.oj.model.entity.Question;
import com.booboil.oj.service.QuestionService;
import org.springframework.stereotype.Service;

/**
* @author xinrong3.zhang
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-01-06 19:37:38
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService {

}




