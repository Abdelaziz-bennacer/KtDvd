package fr.abdel.repository

import fr.abdel.entity.Movie

interface MovieRepositoryInterface {

    fun addMovie(movie: Movie)
}