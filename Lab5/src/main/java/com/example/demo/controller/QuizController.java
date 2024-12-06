package com.example.demo.controller;

import com.example.demo.model.QuizQuestion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @GetMapping("/questions")
    public List<QuizQuestion> getQuizQuestions() {
        List<QuizQuestion> quizQuestions = new ArrayList<>();

        quizQuestions.add(new QuizQuestion(
                "What is the name of Thor's Hammer?",
                new String[]{"Stormbreaker", "Mjolnir", "Axe of Thunder", "Thunderstrike"},
                "Stormbreaker"));

        quizQuestions.add(new QuizQuestion(
                "Who is Tony Stark's AI assistant",
                new String[]{"JARVIS", "FRIDAY", "HOMER", "SIRI"},
                "JARVIS"));

        quizQuestions.add(new QuizQuestion(
                "Which Infinity Stone is located on Vormir?",
                new String[]{"Soul Stone", "Time Stone", "Mind Stone", "Reality Stone"},
                "Soul Stone"));

        quizQuestions.add(new QuizQuestion(
                "What is Black Widow’s real name?",
                new String[]{"Natasha Romanoff", "Wanda Maximoff", "Maria Hill", "Sharon Carter"},
                "Natasha Romanoff"));

        quizQuestions.add(new QuizQuestion(
                "Which character is known as the 'Winter Soldier'?",
                new String[]{"Steve Rogers", "Bucky Barnes", "Sam Wilson", "Clint Barton"},
                "Bucky Barnes"));

        return quizQuestions;
    }
}
