
public class ProgrammingBook extends Book {
    private String language;
    private String framework;
    public ProgrammingBook(int id, String name, double price, String author, String language, String framework) {
        super(id, name, price, author);
        this.language = language;
        this.framework = framework;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getFramework() {
        return framework;
    }
    public void setFramework(String framework) {
        this.framework = framework;
    }
    @Override
    public double getPrice() {
        return super.getPrice() * (1 - 0.05);
    }
}