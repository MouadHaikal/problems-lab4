package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius * 9 / 5 + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f°C (%.1f°F) and %s", temperatureCelsius, temperatureFahrenheit(), conditions());
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        return new WeatherData((tempFahrenheit-32) * 5/9, conditions);
    }

    public static void main(String[] args) {
        WeatherData today = new WeatherData(25.0, "Sunny");
        WeatherData yesterday = fromFahrenheit(50.f, "Cloudy");

        System.out.println("Today's weather: " + today.getSummary());
        System.out.println("Yesterday's weather: " + today.getSummary());
    }
}
