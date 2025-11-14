package oo.splabtothpeteer.command;

import oo.splabtothpeteer.model.Book;
import oo.splabtothpeteer.service.BookService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // Constructor injection
public class CreateBookCommand implements Command {

    private final BookService bookService;
    private final Book book;

    @Override
    public void execute() {
        bookService.createBook(book);
        System.out.println("Book created (via command): " + book.getTitle());
    }
}