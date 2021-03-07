package fr.abdel.controller

import fr.abdel.entity.Movie
import fr.abdel.service.MovieServiceInterface
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class MovieController {

    @Autowired
    private lateinit var movieService:MovieServiceInterface

    fun setMovieService(movieService: MovieServiceInterface){
        this.movieService = movieService

    }

    fun addUsingConsole(){

        val sc = Scanner(System.`in`)
        val movie = Movie()
        println("Veuillez faire votre séléction.")
        println("Entrez le genre du film")
        val genre = sc.nextLine()
        movie.genre = genre
        println("Entrez le titre du film")
        val title = sc.nextLine()
        movie.title = title

        movieService.registerMovieLive(movie)
    }

}


