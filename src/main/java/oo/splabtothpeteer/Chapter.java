package oo.splabtothpeteer;
import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public void addSubChapter(SubChapter sc) {
        subChapters.add(sc);
    }

    public void print() {
        System.out.println("  Chapter: " + name);
        for (SubChapter sc : subChapters) {
            sc.print();
        }
    }
}
