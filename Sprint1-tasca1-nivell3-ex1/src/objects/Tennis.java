package objects;

public class Tennis extends News{

    private String Competition;
    private String playerNames;


    public Tennis(String title,String competition, String playerNames) {
        super(title);
        Competition = competition;
        this.playerNames = playerNames;
        super.setRate(newsRating());
        super.setPrice(newsPrice());
    }

    public String getCompetition() {
        return Competition;
    }

    public void setCompetition(String competition) {
        Competition = competition;
    }

    public String getPlayerNames() {
        return playerNames;
    }

    public void setPlayerNames(String playerNames) {
        this.playerNames = playerNames;
    }

    @Override
    public String toString() {
        return "Tennis{" +
                "Competition='" + Competition + '\'' +
                ", playersNames='" + playerNames + '\'' +
                '}';
    }

    @Override
    public float newsPrice() {
        float price;
        float playerPrice = 0f;

        if(playerNames.equalsIgnoreCase("Federer") ||
                playerNames.equalsIgnoreCase("Nadal") ||
                playerNames.equalsIgnoreCase("Djokovic")){playerPrice=100f;}

        price= 150 + playerPrice;

        return price;
    }

    @Override
    public int newsRating() {
        int totalPoints;
        int playerPoints = 0;

        if(playerNames.equalsIgnoreCase("Federer")
                || playerNames.equalsIgnoreCase("Nadal")
                || playerNames.equalsIgnoreCase("Djokovic")){playerPoints=3;}

        totalPoints= 4 + playerPoints;

        return totalPoints;
    }
}
