package oo.splabtothpeteer.persistence;

import oo.splabtothpeteer.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    // Putem adăuga aici metode custom, ex: findByName(String name)
    // Dar deocamdată nu e nevoie.
}