package com.codegym.nasahibernateorm.service;

import com.codegym.nasahibernateorm.model.Feedback;

import java.util.List;

public interface FeedbackService {
    void save(Feedback feedback);
    List<Feedback> findToday();
    void like(Long id);
}
