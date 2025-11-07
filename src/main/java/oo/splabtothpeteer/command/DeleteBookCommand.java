package oo.splabtothpeteer.command;

import oo.splabtothpeteer.service.BookService;

public class DeleteBookCommand implements Command {
    private final BookService service;
    private final int id;

    public DeleteBookCommand(BookService service, int id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public void execute() {
        service.deleteBook(id);
        System.out.println("Book deleted: " + id);
    }
}
