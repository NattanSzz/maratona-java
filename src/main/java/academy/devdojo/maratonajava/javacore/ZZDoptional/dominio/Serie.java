package academy.devdojo.maratonajava.javacore.ZZDoptional.dominio;

public class Serie {
    private Integer id;
    private String title;
    private int chapters;
    
    public Serie(Integer id, String title, int chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Serie [id=" + id + ", title=" + title + ", chapters=" + chapters + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    
}
