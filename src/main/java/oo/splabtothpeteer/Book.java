package oo.splabtothpeteer;
import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors = new ArrayList<>();
    private TableOfContents toc = new TableOfContents();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + super.getTitle());
        System.out.println("Authors:");
        for (Author a : authors) {
            a.print();
        }
        toc.print();
        super.print();
    }
}

