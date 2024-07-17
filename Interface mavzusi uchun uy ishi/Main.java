public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("John Doe", 9, "Dream Team", 1, 3, 10);
        GoalKeeper goalKeeper = new GoalKeeper("Jane Smith", 1, "Dream Team", 0, 2, 0, 5);
        VolleyballPlayer volleyballPlayer = new VolleyballPlayer("Mike Johnson", 7, "Spike Masters", 25);
        Setter setter = new Setter("Anna Brown", 3, "Spike Masters", 20, 15);
        BasketballPlayer basketballPlayer = new BasketballPlayer("Chris Evans", 11, "Hoop Heroes", 30);
        PointGuard pointGuard = new PointGuard("David Lee", 5, "Hoop Heroes", 22, 8);

        System.out.println(footballPlayer.getInfo());
        System.out.println(goalKeeper.getInfo());
        System.out.println(volleyballPlayer.getInfo());
        System.out.println(setter.getInfo());
        System.out.println(basketballPlayer.getInfo());
        System.out.println(pointGuard.getInfo());

        BaseConverter celsiusToKelvin = new CelsiusToKelvin();
        BaseConverter celsiusToFahrenheit = new CelsiusToFahrenheit();

        double celsius = 25;
        System.out.println(celsius + " Celsius is " + celsiusToKelvin.convert(celsius) + " Kelvin");
        System.out.println(celsius + " Celsius is " + celsiusToFahrenheit.convert(celsius) + " Fahrenheit");
    }
}
