package objects;

public abstract class News {

    private String title;
    private String bodyText="";
    private  int rate;
    private float price;

    public News(String title) {
        this.title = title;
        this.bodyText = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", bodyText='" + bodyText + '\'' +
                ", rate=" + rate +
                ", price=" + price +
                '}';
    }

    abstract public float newsPrice();

    abstract public int newsRating();


}
