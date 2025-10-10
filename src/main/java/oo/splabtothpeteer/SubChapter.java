package oo.splabtothpeteer;
import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void addParagraph(Paragraph p) {
        paragraphs.add(p);
    }

    public void addImage(Image img) {
        images.add(img);
    }

    public void addTable(Table t) {
        tables.add(t);
    }

    public void print() {
        System.out.println("    SubChapter: " + name);
        for (Paragraph p : paragraphs) {
            p.print();
        }
        for (Image img : images) {
            img.print();
        }
        for (Table t : tables) {
            t.print();
        }
    }
}
