package com.example.askproject.Model.DAO.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.askproject.Model.DAO.AnswerDAO;
import com.example.askproject.Model.Entity.AnswerEntity;
import com.example.askproject.Model.Repository.AnswerRepository;

@Service
public class AnswerDAOImpl implements AnswerDAO{
    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public void deleteByAnswerId(Long answerId) {
        // TODO Auto-generated method stub
        answerRepository.deleteByAnswerId(answerId);   
    }

    @Override
    public List<AnswerEntity> findAllByAnswerFrom(String answerFrom) {
        // TODO Auto-generated method stub
        return answerRepository.findAllByAnswerFrom(answerFrom);
    }

    @Override
    public AnswerEntity findByAnswerQuestionId(Long answerQuestionId) {
        // TODO Auto-generated method stub
        return answerRepository.findByAnswerQuestionId(answerQuestionId);
    }
    
}
