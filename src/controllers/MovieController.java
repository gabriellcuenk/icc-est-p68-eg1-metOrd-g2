package controllers;

import models.Movie;

public class MovieController {

    public void sortByTitle(Movie[] moviesList) {

        int n = moviesList.length;

        for (int i = 1; i < n; i++) {

            Movie clave = moviesList[i];
            int j = i - 1;

            while (j >= 0 && moviesList[j].getName().compareTo(clave.getName()) < 0) {

                moviesList[j + 1] = moviesList[j];
                j--;
            }

            moviesList[j + 1] = clave;
        }
    }

}
