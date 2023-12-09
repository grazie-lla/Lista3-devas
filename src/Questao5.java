import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o tempo gasto na viagem em horas:");
        double travelTime = input.nextDouble();

        System.out.println("Insira a velocidade média durante a viagem em Km/h:");
        double speed = input.nextDouble();

        if (speed <= 0 || travelTime <= 0){
            System.out.println("Os valores não podem ser menores ou iguais a zero.");
        } else {
            System.out.printf("São necessários %.3f litros de combustível para a sua viagem.", fuelConsumption(travelTime, speed));
        }
    }

    public static double fuelConsumption(double travelTime, double speed){
        return (travelTime * speed) / 12;
    }
}

