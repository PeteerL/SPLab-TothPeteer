package oo.splabtothpeteer.observer;

import oo.splabtothpeteer.model.Book; // Modelul de JPA

public interface Observer {
    void update(Book book); // Metoda de update [cite: 48]
}
