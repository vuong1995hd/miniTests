
public class miniTest {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook(1, "How to die", 111, "A", "CSharp", ".Net");
        books[1] = new ProgrammingBook(2, "Make game with Unity", 187, "R", "CSharp", ".Net");
        books[2] = new ProgrammingBook(3, "Program with Java", 88, "D", "Java", "Spring MVC");
        books[3] = new FictionBook(4, "Hunter x hunter", 67, "V", "Sci-fi");
        books[4] = new FictionBook(5, "Golem", 45, "J", "Sci-fi");
        books[5] = new FictionBook(6, "Harry Potter", 124, "L", "Fantasy");
        double totalPrice = 0;
        int countJava = 0;
        int countSF = 0;
        int cheapFictions = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("Java")) {
                    countJava++;
                }
            } else if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("Sci-fi")) {
                    countSF ++;
                }
                if (book.getPrice() < 100) {
                    cheapFictions++;
                }
            }
        }
        System.out.println("Total price of all books: " + totalPrice);
        System.out.println("Number of programming books about Java: " + countJava);
        System.out.println("Number of fiction books about Sci-fi: " + countSF);
        System.out.println("Number of fiction books under 100: " + cheapFictions);
    }
}