public class VolleyballPlayer extends Player{
    private int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, int numberPosition, String teamName, int numberOfPoints) {
        super(nameOfPlayer, "Volleyball", numberPosition, teamName);
        this.numberOfPoints = numberOfPoints;
    }
}
