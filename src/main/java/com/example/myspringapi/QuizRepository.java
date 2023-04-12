package com.example.myspringapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//interfata care permite comunicarea cu baza de date
@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
