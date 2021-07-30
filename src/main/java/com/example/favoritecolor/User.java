package com.example.favoritecolor;

import javax.validation.constraints.*;

public class User {
    @NotNull
    @Size(min=3, max=30)
    private String Name;

    @NotNull
    @Size(min=10, max=30)
    private String Quest;

    @NotNull
    private String question;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQuest() {
        return Quest;
    }

    public void setQuest(String quest) {
        Quest = quest;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
