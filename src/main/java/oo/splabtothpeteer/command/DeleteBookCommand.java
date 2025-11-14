package oo.splabtothpeteer.command;

import oo.splabtothpeteer.service.BookService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteBookCommand implements Command {

    private final BookService bookService;
    private final int id;

    @Override
    public void execute() {
        bookService.deleteBook(id);

        System.out.println("Book deleted (via command), id: " + id);
    }
}