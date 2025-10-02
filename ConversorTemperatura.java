import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Conversão para Kelvin
        double kelvin = celsius + 273.15;

        // Exibindo os resultados
        System.out.println("\nTemperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        sc.close();
    }
}
