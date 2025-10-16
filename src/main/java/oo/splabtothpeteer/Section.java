package oo.splabtothpeteer;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(Element element) {
        children.add(element);
    }

    public void remove(Element element) {
        children.remove(element);
    }

    public Element get(int index) {
        return children.get(index);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element e : children) {
            e.print();
        }
    }
}


