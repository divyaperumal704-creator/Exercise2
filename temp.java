import java.util.Scanner;

class Temperature {

    double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }
}

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Temperature t = new Temperature();

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Celsius to Fahrenheit: "
                + t.celsiusToFahrenheit(c));

        System.out.println("Celsius to Kelvin: "
                + t.celsiusToKelvin(c));

        System.out.print("\nEnter Fahrenheit: ");
        double f = sc.nextDouble();

        System.out.println("Fahrenheit to Celsius: "
                + t.fahrenheitToCelsius(f));

        System.out.println("Fahrenheit to Kelvin: "
                + t.fahrenheitToKelvin(f));

        System.out.print("\nEnter Kelvin: ");
        double k = sc.nextDouble();

        System.out.println("Kelvin to Celsius: "
                + t.kelvinToCelsius(k));

        System.out.println("Kelvin to Fahrenheit: "
                + t.kelvinToFahrenheit(k));

        sc.close();
    }
}