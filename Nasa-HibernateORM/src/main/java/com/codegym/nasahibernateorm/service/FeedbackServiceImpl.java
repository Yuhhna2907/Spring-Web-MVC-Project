package com.codegym.nasahibernateorm.service;

import com.codegym.nasahibernateorm.model.Feedback;
import com.codegym.nasahibernateorm.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService {


        @Autowired
        private FeedbackRepository repo;

        @Override
        public void save(Feedback feedback) {
            repo.save(feedback);
        }

        @Override
        public List<Feedback> findToday() {
            return repo.findByCreatedDate(LocalDate.now());
        }

        @Override
        public void like(Long id) {
            Feedback fb = repo.findById(id).orElseThrow();
            fb.setLikes(fb.getLikes() + 1);
        }
    }

