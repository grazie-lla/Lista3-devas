import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a temperatura atual:");
        double temperature = input.nextDouble();

        input.nextLine();

        System.out.println("Insira a medida da temperatura atual (Kelvin, Celsius ou Fahrenheit):");
        String currentScale = input.nextLine().toLowerCase();

        System.out.println("Insira para qual medida será convertida a temperatura (Kelvin, Celsius ou Fahrenheit):");
        String finalScale = input.nextLine().toLowerCase();

        double output = convertTemperature(temperature, currentScale, finalScale);

        if (!currentScale.equalsIgnoreCase("kelvin") && !currentScale.equalsIgnoreCase("celsius") && !currentScale.equalsIgnoreCase("fahrenheit")){
            System.out.println("Opção inválida!");
        }else if (!finalScale.equalsIgnoreCase("kelvin") && !finalScale.equalsIgnoreCase("celsius") && !finalScale.equalsIgnoreCase("fahrenheit")){
            System.out.println("Opção inválida!");
        } else {
            System.out.printf("Temperatura atual = %.2f %nMedida atual = %s %nMedida final = %s %nOutput = %.2f", temperature, currentScale, finalScale, output);
        }

    }

    public static double convertTemperature (double temperature, String currentScale, String finalScale){
        switch (currentScale) {
            case "kelvin":
                return convertFromKelvin(temperature, finalScale);
            case "celsius":
                return convertFromCelsius(temperature, finalScale);
            case "fahrenheit":
                return convertFromFahrenheit(temperature, finalScale);
            default:
                System.out.println("Opção inválida!");
                return temperature;
        }
    }
    public static double convertFromKelvin (double temperature, String finalScale) {
        switch (finalScale){
            case "celsius":
                return temperature - 273.15;
            case "fahrenheit":
                return (temperature - 273.15) * 9/5 + 32;
            default:
                System.out.println("Opção inválida!");
                return temperature;
            }
    }

    public static double convertFromCelsius (double temperature, String finalScale){
        switch (finalScale) {
            case "kelvin":
                return temperature + 273.15;
            case "fahrenheit":
                return (temperature * 9/5) + 32;
            default:
                System.out.println("Opção inválida!");
                return temperature;
        }
    }

    public static double convertFromFahrenheit (double temperature, String finalScale){
        switch (finalScale) {
            case "kelvin":
                return (temperature - 32) * 5/9 + 273.15;
            case "celsius":
                return (temperature -32) + 5.0/9.0;
            default:
                System.out.println("Opção inválida!");
                return temperature;
        }
    }

}
