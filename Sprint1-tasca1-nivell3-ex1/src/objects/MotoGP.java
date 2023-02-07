package objects;

public class MotoGP extends News{

    private String team;


    public MotoGP(String title,  String team) {
        super(title);
        this.team = team;
        super.setRate(newsRating());
        super.setPrice(newsPrice());
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "MotoGP{" +
                "team='" + team + '\'' +
                '}';
    }

    @Override
    public float newsPrice() {
        float price;
        float teamPrice = 0f;

        if(team.equalsIgnoreCase("Honda") ||
                team.equalsIgnoreCase("Yamaha")){teamPrice=50f;}

        price= 100 + teamPrice;

        return price;
    }

    @Override
    public int newsRating() {
        int totalPoints;
        int teamPoints = 0;

        if(team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")){teamPoints=3;}

        totalPoints= 3 + teamPoints;

        return totalPoints;
    }
}
