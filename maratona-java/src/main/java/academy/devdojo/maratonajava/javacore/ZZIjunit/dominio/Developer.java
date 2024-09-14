package academy.devdojo.maratonajava.javacore.ZZIjunit.dominio;

public class Developer extends Employee {
    private String mainLanguage;

    public Developer(int id, String mainLanguage) {
        super(id);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }
}
