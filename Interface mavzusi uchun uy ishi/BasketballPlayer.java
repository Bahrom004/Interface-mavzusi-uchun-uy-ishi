public class BasketballPlayer extends Player{
    private int numberOfGoals;

    public BasketballPlayer(String nameOfPlayer, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, "Basketball", numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }
}
