package com.vtis.carolinetest.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Type(type = "pg-uuid")
    private UUID id;
    @Column(name="question_text")
    private String text;
    @Column(name = "additional_info")
    private String additionalInfo;

    protected Question() {}

    public Question(String text, String additionalInfo) {
        this.text = text;
        this.additionalInfo = additionalInfo;
    }

    public UUID getId() {
        return id;
    }


    public String getText() {
        return text;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
