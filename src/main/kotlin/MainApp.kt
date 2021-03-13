import fr.MainApp
import fr.abdel.controller.MovieController
import org.springframework.boot.SpringApplication
import org.springframework.context.ApplicationContext

fun main(args:Array<String>){


    //val context: ApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")
    //val context: ApplicationContext = AnnotationConfigApplicationContext(mainApp::class.java)
    val context: ApplicationContext = SpringApplication.run(MainApp::class.java)
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