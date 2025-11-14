package oo.splabtothpeteer.service;

import lombok.RequiredArgsConstructor;
import oo.splabtothpeteer.model.Book;
import oo.splabtothpeteer.observer.AllBooksSubject;
import oo.splabtothpeteer.persistence.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @RequiredArgsConstructor se va ocupa de ambele injectii
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AllBooksSubject allBooksSubject; // <-- 2. Injecteaza Subiectul

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        // 3. Salveaza cartea in baza de date
        Book savedBook = bookRepository.save(book);

        // 4. Notifica toti observatorii (clientii SSE) despre noua carte!
        allBooksSubject.addBook(savedBook);

        return savedBook;
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Integer id, Book updated) {
        return bookRepository.findById(id)
                .map(existing -> {
                    existing.setTitle(updated.getTitle());
                    existing.setAuthors(updated.getAuthors()); // <-- Am văzut că ai adăugat asta, e perfect
                    Book saved = bookRepository.save(existing);
                    // Ai putea notifica și la update
                    // allBooksSubject.addBook(saved); // (sau o altă metodă 'updateBook')
                    return saved;
                }).orElse(null);
    }
}