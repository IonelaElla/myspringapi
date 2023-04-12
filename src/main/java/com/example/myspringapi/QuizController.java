package com.example.myspringapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/quiz")
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    public QuizController(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }
//endpoint care permite salvarea quiz-ului
    @PostMapping(path = "/save")
    public Quiz saveQuiz(@RequestBody Quiz quiz) {
        return quizRepository.save(quiz);
    }
//endpoint care permite obtinerea tuturor quiz-urilor

    @GetMapping(path = "/find-all")
    public List<Quiz> findAll() {
        return quizRepository.findAll();

    }


}
