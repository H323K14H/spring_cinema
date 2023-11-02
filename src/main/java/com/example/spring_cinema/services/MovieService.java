package com.example.spring_cinema.services;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;


    public MovieService() {
    }


    public Optional<Movie> getMovieById(long id) {
        assert movieRepository != null;
        return movieRepository.findById(id);
    }

    public List<Movie> getAllMovies() {
        assert movieRepository != null;
        return movieRepository.findAll();
    }

    public void addMovies(Movie movie) {
        movieRepository.save(movie);
    }


}
