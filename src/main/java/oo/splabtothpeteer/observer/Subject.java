package oo.splabtothpeteer.observer;
import oo.splabtothpeteer.model.Book;

public interface Subject {
    void registerObserver(Observer observer); // [cite: 51]
    void unregisterObserver(Observer observer); // [cite: 52]
    void notifyObservers(Book book);
}
