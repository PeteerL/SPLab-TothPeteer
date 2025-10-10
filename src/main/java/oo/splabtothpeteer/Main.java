import oo.splabtothpeteer.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Book book = new Book("Design Patterns in Java");
        book.addAuthor(new Author("John Doe"));
        book.addAuthor(new Author("Jane Smith"));

        Chapter chapter1 = new Chapter("Introduction");
        SubChapter sub1 = new SubChapter("What is OOP?");
        sub1.addParagraph(new Paragraph("OOP stands for Object-Oriented Programming."));
        sub1.addImage(new Image("oop_diagram.png"));
        sub1.addTable(new Table("OOP Features"));
        chapter1.addSubChapter(sub1);

        book.addChapter(chapter1);

        book.print();
    }
}