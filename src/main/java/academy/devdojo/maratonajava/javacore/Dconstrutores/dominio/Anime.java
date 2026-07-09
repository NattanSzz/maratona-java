package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    public Anime(String name, String type, int episodes, String gender, String studeio) {
        this.name = name;
        this.episodes = episodes;
        this.gender = gender;
        this.type = type;
        this.studio = studeio;
    }

    public Anime() {

    }

    // public void init(String name, String type, int episodes) {
    //     this.name = name;
    //     this.type = type;
    //     this.episodes = episodes;
    // }

    // public void init(String name, String type, int episodes, String gender) {
    //     this.init(name, type, episodes);
    //     this.gender = gender;
    // }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
        System.out.println(this.studio);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getType() {
        return this.type;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
}
