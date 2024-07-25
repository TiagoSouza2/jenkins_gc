package com.example;
public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        System.out.println("32°F to Celsius: " + fahrenheitToCelsius(32));
        System.out.println("0°C to Fahrenheit: " + celsiusToFahrenheit(0));
    }
}
