package oo.splabtothpeteer.service;

import oo.splabtothpeteer.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private final Map<Integer, Book> books = new HashMap<>();

    public BookService() {
        books.put(1, new Book(1, "Design Patterns"));
        books.put(2, new Book(2, "Clean Code"));
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(int id) {
        return books.get(id);
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void updateBook(int id, Book newBook) {
        books.put(id, newBook);
    }

    public void deleteBook(int id) {
        books.remove(id);
    }
}
