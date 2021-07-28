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
    private String Color;

    @NotNull
    private float velocity;


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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }
}
