package book;


import java.util.List;

// import printer;
// import prToScr;

public class BookReader {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        prToScr printer = new printer();
        printer.toScr(book);
    }
}
