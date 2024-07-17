public class FootballPlayer extends Player{
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public FootballPlayer(String nameOfPlayer, int numberPosition, String teamName,
                          int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, "Football", numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }
}
