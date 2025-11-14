package oo.splabtothpeteer.observer;

import oo.splabtothpeteer.model.Book;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

public class SseObserver implements Observer {

    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book) {
        try {
            // Trimite cartea ca JSON pe conexiunea SSE
            emitter.send(book, MediaType.APPLICATION_JSON);
        } catch (IOException e) {
            /*Daca e o eroare (ex: clientul s-a deconectat),
             putem considera sa ștergem observer-ul*/
            emitter.completeWithError(e);
        }
    }
}