package com.example.spring_cinema.repositories;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class MovieList {

    private List<String> movies;

    public MovieList(){
        this.movies = Arrays.asList(
                "Avengers: Endgame",
                "The Godfather: Part 1",
                "Toy Story",
                "Sonic the hedgehog 2",
                "Woman King",
                "Anna and the King"
        );
    }

}
