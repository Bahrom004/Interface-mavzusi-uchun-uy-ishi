public class PointGuard extends BasketballPlayer{
    private int countOfGuard;

    public PointGuard(String nameOfPlayer, int numberPosition, String teamName, int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }
}
