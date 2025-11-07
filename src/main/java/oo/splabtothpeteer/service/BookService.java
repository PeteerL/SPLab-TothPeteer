package oo.splabtothpeteer.service;

import lombok.RequiredArgsConstructor;
import oo.splabtothpeteer.model.Book;
import oo.splabtothpeteer.persistence.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Integer id, Book updated) { // 'updated' este cartea primită din JSON
        return bookRepository.findById(id)
                .map(existingBook -> { // 'existingBook' este cartea din Baza de Date

                    // Actualizăm câmpurile de pe cartea existentă:
                    existingBook.setTitle(updated.getTitle());
                    existingBook.setAuthors(updated.getAuthors()); // <-- LINIA LIPSA

                    // Salvăm cartea existentă (care acum are date noi)
                    return bookRepository.save(existingBook);
                }).orElse(null); // Returnăm null dacă nu am găsit ID-ul
    }
}
