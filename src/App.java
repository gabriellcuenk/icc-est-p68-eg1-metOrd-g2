import models.Movie;
import controllers.MovieController;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Evaluación: Ordenamiento de Películas por Título ===\n");
        Movie[] moviesList = new Movie[25];
        moviesList = generateMoviesList();

        System.out.println("Lista sin ordenar: ");
        int i = 0;
        for (Movie m : moviesList) {
            i++;
            System.out.println(i + ". " + m.getName() + " (" + m.getYear() + ")");
        }

        i = 0;
        System.out.println("\nLista ordenada: ");
        MovieController controller = new MovieController();
        controller.sortByTitle(moviesList);
        for (Movie m : moviesList) {
            i++;
            System.out.println(i + ". " + m.getName() + " (" + m.getYear() + ")");
        }

    }

    public static Movie[] generateMoviesList() {
        Movie[] movies = new Movie[25];
        movies[0] = new Movie("Inception", 2010);
        movies[1] = new Movie("avatar", 2009);
        movies[2] = new Movie("The Dark Knight", 2008);
        movies[3] = new Movie("Interstellar", 2014);
        movies[4] = new Movie("AVATAR", 2022);
        movies[5] = new Movie("Avatar", 2016);
        movies[6] = new Movie("The Matrix", 1999);
        movies[7] = new Movie("dune", 2021);
        movies[8] = new Movie("Dune", 1984);
        movies[9] = new Movie("DUNE", 2024);
        movies[10] = new Movie("The Godfather", 1972);
        movies[11] = new Movie("the matrix", 2020);
        movies[12] = new Movie("THE MATRIX", 1998);
        movies[13] = new Movie("Pulp Fiction", 1994);
        movies[14] = new Movie("pulp fiction", 1993);
        movies[15] = new Movie("Forrest Gump", 1994);
        movies[16] = new Movie("Gladiator", 2000);
        movies[17] = new Movie("The Shawshank Redemption", 1994);
        movies[18] = new Movie("the shawshank redemption", 1995);
        movies[19] = new Movie("Titanic", 1997);
        movies[20] = new Movie("TITANIC", 1998);
        movies[21] = new Movie("Jurassic Park", 1993);
        movies[22] = new Movie("The Avengers", 2012);
        movies[23] = new Movie("the avengers", 2013);
        movies[24] = new Movie("Iron Man", 2008);
        return movies;
    }
}
