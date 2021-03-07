package fr.abdel.service

import fr.abdel.entity.Movie
import fr.abdel.repository.MovieRepositoryInterface
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DefaultMovieService: MovieServiceInterface{

    @Autowired
    lateinit var movieRepository: MovieRepositoryInterface

    @JvmName("getMovieRepository1")
    fun getMovieRepository(): MovieRepositoryInterface {
        return movieRepository
    }

    fun setMovierepositoryInterface(movieRepositoryInterface: MovieRepositoryInterface){
        this.movieRepository = movieRepositoryInterface
    }

    override fun registerMovie(movie: Movie){
        movieRepository.addMovie(movie)
    }

    override fun registerMovieLive(movie: Movie){
        movieRepository.addMovie(movie)
    }
}