package com.vtis.carolinetest.controllers;

import com.vtis.carolinetest.entities.Question;
import com.vtis.carolinetest.repo.QuestionRepo;
import com.vtis.carolinetest.entities.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

    @Autowired
    QuestionRepo repo;

    @PostMapping("/answer")
    public Answer answer(@RequestParam(value="question", defaultValue = "") String question) {
        var questions = repo.findByText("Ciao");
        for(var q : questions)
            return new Answer(q.getText(), Integer.parseInt(q.getAdditionalInfo()));
        if(question.equals("ciao"))
            return new Answer("Ciao anche a te!", 0);
        else return new Answer("Non ti conosco!", 0);
    }

    @PostMapping("/question")
    public Question question(@RequestParam(value="text") String text, @RequestParam(value = "additional_info", defaultValue = "") String additionalInfo) {
        return repo.save(new Question(text, additionalInfo));
    }
}
