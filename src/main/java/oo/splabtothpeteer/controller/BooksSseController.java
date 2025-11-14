package oo.splabtothpeteer.controller;

import oo.splabtothpeteer.observer.AllBooksSubject;
import oo.splabtothpeteer.observer.SseObserver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping("/books-sse") // [cite: 31]
    public ResponseBodyEmitter getBooksSse() {
        // Creeaz un Emitter SSE cu un timeout lung (sau 0L pentru a nu expira)
        final SseEmitter emitter = new SseEmitter(0L);

        // Creeaza un nou observator pentru aceasta conexiune
        SseObserver observer = new SseObserver(emitter);

        // Adauga observatorul la Subject
        allBooksSubject.registerObserver(observer);

        // La deconectare, time-out sau eroare, ștergem observatorul din lista
        emitter.onCompletion(() -> allBooksSubject.unregisterObserver(observer));
        emitter.onTimeout(() -> allBooksSubject.unregisterObserver(observer));
        emitter.onError((e) -> allBooksSubject.unregisterObserver(observer));

        return emitter;
    }
}