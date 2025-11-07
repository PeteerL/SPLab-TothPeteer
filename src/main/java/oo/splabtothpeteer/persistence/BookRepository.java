package oo.splabtothpeteer.persistence;

import oo.splabtothpeteer.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Spune-i lui Spring că aceasta este o componentă de persistență
public interface BookRepository extends JpaRepository<Book, Integer> { // <Clasa, Tipul ID-ului>
    // Gata! Ai automat: save(), findById(), findAll(), deleteById(), etc. [cite: 69]
}