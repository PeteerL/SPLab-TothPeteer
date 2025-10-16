package oo.splabtothpeteer;

public class ImageProxy extends Image {
    private Image realImage;

    public ImageProxy(String url) {
        super(url);
    }

    private Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
            System.out.println("(Loading image: " + url + ")");
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }
}
