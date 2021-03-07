import fr.abdel.AppConfig
import fr.abdel.controller.MovieController
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main(args:Array<String>){


    //val context: ApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")
    val context: ApplicationContext = AnnotationConfigApplicationContext(AppConfig::class.java)
    val movieController = context.getBean(MovieController::class.java)
    movieController.addUsingConsole()

    /*
    val movieController = MovieController()
    val movieService = DefaultMovieService()
    movieController.setMovieService(movieService)
    val movieRepository = FileMovieRepository()
    movieService.setMovierepositoryInterface(movieRepository)
    movieController.addUsingConsole()*/

}