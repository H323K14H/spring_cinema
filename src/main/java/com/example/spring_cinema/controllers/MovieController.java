package com.example.spring_cinema.controllers;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> addMovies(@RequestBody Movie movie) {
        movieService.addMovies(movie);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable long id) {
        Optional<Movie> movie = movieService.getMovieById(id);
        assert movie.isPresent();
        return new ResponseEntity<>(movie.get(), HttpStatus.I_AM_A_TEAPOT);
    }

    @GetMapping
    public ResponseEntity<Movie> getMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return new ResponseEntity<>((Movie) movies, HttpStatus.I_AM_A_TEAPOT);
    }


}
