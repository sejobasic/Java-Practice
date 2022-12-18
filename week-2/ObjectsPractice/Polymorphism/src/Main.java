import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Comedy comedyMovie = new Comedy("Happy Gilmore");
        Action actionMovie = new Action("Die Hard");
        Adventure adventureMovie = new Adventure("Indiana Jones");

        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();

        comedyMovie.watchMovie();
        actionMovie.watchMovie();
        adventureMovie.watchMovie();

        while (true) {
            System.out.print("Enter Type of Movie (Adventure, Action, Comedy) or type 'quit' to exit: ");

            String type = scan.nextLine();

            if ("quit".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = scan.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}