package fr.abdel.repository.file

import fr.abdel.entity.Movie
import fr.abdel.repository.MovieRepositoryInterface
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository
import java.io.File
import java.io.FileWriter
import java.io.IOException

@Repository
class FileMovieRepository: MovieRepositoryInterface {

    @Value("\${movies.file.location}")
    lateinit var file: File

    @JvmName("setFile1")
    fun setFile(file: File){
        this.file = file
    }

        override fun addMovie(movie: Movie){
            val writer: FileWriter
            try {
                writer = FileWriter(file, true)
                writer.write(
                    "${movie.title} ; ${movie.genre} \n"
                )
                writer.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
            println("Le film ${movie.title} a été ajouté")
        }
}