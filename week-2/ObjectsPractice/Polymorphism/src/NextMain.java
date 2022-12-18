public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adventure", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("Adventure", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("Comedy", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("Comedy", "Airheads");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }

    }
}
