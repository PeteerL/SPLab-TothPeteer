package oo.splabtothpeteer.command;

import oo.splabtothpeteer.model.Book;
import oo.splabtothpeteer.service.BookService;

public class CreateBookCommand implements Command {
    private final BookService service;
    private final Book book;

    public CreateBookCommand(BookService service, Book book) {
        this.service = service;
        this.book = book;
    }

    @Override
    public void execute() {
        service.addBook(book);
        System.out.println("Book created: " + book);
    }
}
