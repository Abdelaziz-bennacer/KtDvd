package fr.abdel.service

import fr.abdel.entity.Movie

interface MovieServiceInterface {

    fun registerMovieLive(movie: Movie)
    fun registerMovie(movie: Movie)
}