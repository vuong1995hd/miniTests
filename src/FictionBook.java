
public class FictionBook extends Book {
    private String category;
    public FictionBook(int id, String name, double price, String author, String category) {
        super(id, name, price, author);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public double getPrice() {
        return super.getPrice() * (1 - 0.07);
    }
}
