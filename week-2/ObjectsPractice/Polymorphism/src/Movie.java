public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type) {
            case "Adventure" -> new Adventure(title);
            case "Comedy" -> new Action(title);
            case "Action" -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Beautiful scenery\n");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Hilarious\n");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}

class Action extends Movie {
    public Action(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Huge Explosions\n");
    }

    public void watchComedy() {
        System.out.println("Watching an Action!");
    }
}
