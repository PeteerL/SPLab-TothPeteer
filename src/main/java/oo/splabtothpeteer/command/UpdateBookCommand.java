package oo.splabtothpeteer.command;

import oo.splabtothpeteer.model.Book;
import oo.splabtothpeteer.service.BookService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateBookCommand implements Command {

    private final BookService bookService;
    private final int id;
    private final Book book;

    @Override
    public void execute() {
        Book updatedBook = bookService.updateBook(id, book);

        System.out.println("Book updated (via command): " + updatedBook.getTitle());
    }
}