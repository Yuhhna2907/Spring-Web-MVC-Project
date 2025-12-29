package com.codegym.nasahibernateorm.repository;

import com.codegym.nasahibernateorm.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByCreatedDate(LocalDate date);
}
