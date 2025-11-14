package oo.splabtothpeteer.observer;

import oo.splabtothpeteer.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject implements Subject {

    // Lista de observatori
    private final List<Observer> observerCollection = new ArrayList<>(); // [cite: 50]

    @Override
    public void registerObserver(Observer observer) {
        observerCollection.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerCollection.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        // Notifica fiecare observator din lista
        for (Observer observer : observerCollection) {
            observer.update(book);
        }
    }

    // O metodă ajutatoare pe care o vom apela cand se adauga o carte
    public void addBook(Book book) {
        notifyObservers(book);
    }
}