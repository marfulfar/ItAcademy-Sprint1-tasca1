package objects;

public class Football extends News{

    private String competition="";
    private String club="";
    private  String playerName="";

    public Football(String title,String competition, String club, String playerName) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.playerName=playerName;
        super.setPrice(newsPrice());
        super.setRate(newsRating());
    }

    @Override
    public float newsPrice() {
        float price;
        float competitionPrice = 0f;
        float clubPrice = 0f;
        float playerPrice = 0f;

        if(competition.equalsIgnoreCase("Champions league")){competitionPrice=100f;}
        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){clubPrice=100f;}
        if(playerName.equalsIgnoreCase("Ferran Torres") || playerName.equalsIgnoreCase("Benzema")){playerPrice=50f;}
        price= 300 + competitionPrice + clubPrice + playerPrice;

        return price;
    }

    @Override
    public int newsRating() {
        int totalPoints=0;
        int competitionPoints = 0;
        int clubPoints = 0;
        int playerPoints = 0;

        if(competition.equalsIgnoreCase("Champions league")){
            competitionPoints=3;
        } else if (competition.equalsIgnoreCase("league")) {
            competitionPoints=2;
        }
        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){clubPoints=1;}
        if(playerName.equalsIgnoreCase("Ferran Torres") || playerName.equalsIgnoreCase("Benzema")){playerPoints=1;}
        totalPoints= 5 + competitionPoints + clubPoints + playerPoints;

        return totalPoints;
    }


}
