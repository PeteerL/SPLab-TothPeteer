package oo.splabtothpeteer.command;

import oo.splabtothpeteer.model.Book; // Asigură-te că este modelul JPA
import oo.splabtothpeteer.service.BookService;
import lombok.RequiredArgsConstructor; // E bine să folosești asta dacă ai Lombok

@RequiredArgsConstructor // Folosește constructor injection
public class CreateBookCommand implements Command {

    private final BookService bookService;
    private final Book book;

    @Override
    public void execute() {
        // AICI ESTE MODIFICAREA:
        // Am schimbat "addBook" în "createBook"
        bookService.createBook(book);

        // Poți lăsa și logarea, dacă vrei
        System.out.println("Book created (via command): " + book.getTitle());
    }
}