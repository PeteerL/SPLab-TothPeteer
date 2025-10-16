package oo.splabtothpeteer;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy = null;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
    }

    @Override
    public void print() {
        if (alignStrategy != null)
            alignStrategy.render(this, null);
        else
            System.out.println("Paragraph: " + text);
    }
}


