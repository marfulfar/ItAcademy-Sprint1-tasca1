package objects;

public class F1 extends News{

    private String scuderia;

    public F1(String title, String scuderia) {
        super(title);
        this.scuderia = scuderia;
        super.setRate(newsRating());
        super.setPrice(newsPrice());
    }

    public String getScuderia() {
        return scuderia;
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }

    @Override
    public String toString() {
        return "F1{" +
                "scuderia='" + scuderia + '\'' +
                '}';
    }

    @Override
    public float newsPrice() {
        float price;
        float scuderiaPrice = 0f;

        if(scuderia.equalsIgnoreCase("Ferrari") ||
                scuderia.equalsIgnoreCase("Mercedes")){scuderiaPrice=50f;}

        price= 100 + scuderiaPrice;

        return price;
    }

    @Override
    public int newsRating() {
        int totalPoints;
        int scuderiaPoints = 0;

        if(scuderia.equalsIgnoreCase("Ferrari") || scuderia.equalsIgnoreCase("Mercedes")){scuderiaPoints=2;}

        totalPoints= 4 + scuderiaPoints;

        return totalPoints;
    }
}
