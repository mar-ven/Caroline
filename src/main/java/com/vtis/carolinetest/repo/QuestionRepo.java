package com.vtis.carolinetest.repo;

import com.vtis.carolinetest.entities.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepo extends CrudRepository<Question, Long> {
    List<Question> findByText(String text);
    Question save(Question q);
    Question findById(long id);
}
