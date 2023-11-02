package com.example.spring_cinema.models;

public class Movie {
    private int id;
    private String title;
    private int rating;
    private int duration;

    public Movie(int id, String title, int rating, int duration) {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
