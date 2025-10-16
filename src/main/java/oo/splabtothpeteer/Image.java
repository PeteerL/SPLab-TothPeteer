package oo.splabtothpeteer;

public class Image implements Element {
    protected String url;

    public Image(String url) {
        this.url = url;
    }

    public void content() {
        System.out.println("Displaying image content: " + url);
    }

    @Override
    public void print() {
        System.out.println("Image: " + url);
    }
}

