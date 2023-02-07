package objects;

public class Basketball extends News{

    private String competition;
    private String club;


    public Basketball(String title, String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
        super.setRate(newsRating());
        super.setPrice(newsPrice());
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Basketball{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                '}';
    }


    @Override
    public float newsPrice() {
        float price;
        float competitionPrice = 0f;
        float clubPrice = 0f;

        if(competition.equalsIgnoreCase("EuroLeague")){competitionPrice=75f;}
        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){clubPrice=75f;}

        price= 250 + competitionPrice + clubPrice;

        return price;
    }

    @Override
    public int newsRating() {
        int totalPoints;
        int competitionPoints = 0;
        int clubPoints = 0;

        if(competition.equalsIgnoreCase("EuroLeague")){
            competitionPoints=3;
        } else if (competition.equalsIgnoreCase("ACB")) {
            competitionPoints=2;
        }
        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){clubPoints=1;}

        totalPoints= 4 + competitionPoints + clubPoints;

        return totalPoints;
    }
}
