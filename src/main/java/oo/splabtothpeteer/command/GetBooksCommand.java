package oo.splabtothpeteer.command;

import oo.splabtothpeteer.service.BookService;

public class GetBooksCommand implements Command {

    private final BookService service;

    public GetBooksCommand(BookService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        System.out.println(service.getAllBooks());
    }
}
