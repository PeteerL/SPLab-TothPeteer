package oo.splabtothpeteer;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, String context) {
        System.out.println("<< " + paragraph.getText());
    }
}


