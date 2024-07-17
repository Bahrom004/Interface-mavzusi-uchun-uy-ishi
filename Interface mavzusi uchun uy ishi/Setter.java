public class Setter extends VolleyballPlayer{
    private int countOfSets;

    public Setter(String nameOfPlayer, int numberPosition, String teamName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }
}
