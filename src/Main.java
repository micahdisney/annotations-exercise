@SuppressWarnings("deprecation") public class Main {
     void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.getBooks()) {
            System.out.println(book);
        }
    }
}
