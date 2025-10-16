package oo.splabtothpeteer;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, String context) {
        String text = paragraph.getText();
        int width = 30;
        int padding = (width - text.length()) / 2;
        System.out.println(" ".repeat(Math.max(0, padding)) + text);
    }
}



