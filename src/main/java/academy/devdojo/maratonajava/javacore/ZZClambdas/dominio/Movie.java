package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Movie {
    private String title;
    private int sequences;
    
    public Movie(String title, int sequences) {
        this.title = title;
        this.sequences = sequences;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", sequences=" + sequences + "]";
    }

    public String getTitle() {
        return title;
    }

    public int getSequences() {
        return sequences;
    }

}
