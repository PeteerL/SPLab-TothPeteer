package oo.splabtothpeteer.command;

import oo.splabtothpeteer.model.Book;
import oo.splabtothpeteer.service.BookService;

public class UpdateBookCommand implements Command {

    private final BookService service;
    private final int id;
    private final Book newBook;

    public UpdateBookCommand(BookService service, int id, Book newBook) {
        this.service = service;
        this.id = id;
        this.newBook = newBook;
    }

    @Override
    public void execute() {
        service.updateBook(id, newBook);
        System.out.println("Book updated: " + newBook);
    }
}
