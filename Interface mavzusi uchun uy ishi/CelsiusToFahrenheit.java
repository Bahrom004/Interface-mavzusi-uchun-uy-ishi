public class CelsiusToFahrenheit implements BaseConverter{
    public double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
