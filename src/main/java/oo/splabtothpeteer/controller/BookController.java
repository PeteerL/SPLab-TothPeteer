package oo.splabtothpeteer.controller;

import oo.splabtothpeteer.command.*;
import oo.splabtothpeteer.model.Book;
import oo.splabtothpeteer.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        Command cmd = new GetBooksCommand(service);
        cmd.execute();
        return service.getAllBooks();
    }

    @PostMapping
    public void createBook(@RequestBody Book book) {
        Command cmd = new CreateBookCommand(service, book);
        cmd.execute();
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book book) {
        Command cmd = new UpdateBookCommand(service, id, book);
        cmd.execute();
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        Command cmd = new DeleteBookCommand(service, id);
        cmd.execute();
    }
}
