package fr.abdel.repository.memory

import fr.abdel.entity.Movie
import fr.abdel.repository.MovieRepositoryInterface
import org.springframework.stereotype.Repository

private var movies = mutableListOf<Movie>()

@Repository
class MovieRepository: MovieRepositoryInterface {

        override fun addMovie(movie: Movie){
            movies.add(movie)
            println("Le film ${movie.title} a été enregistré")
        }

}