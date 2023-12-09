import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário:");
        String name = input.nextLine();

        System.out.println("Insira o número de horas trabalhadas por mês:");
        double workedHours = input.nextDouble();

        System.out.println("Insira o valor da hora trabalhada:");
        double hourlyRate = input.nextDouble();

        System.out.printf("O salário anual de %s é %.2f.", name, annualSalary(workedHours, hourlyRate));

    }

    public static double annualSalary(double workedHours, double hourlyRate){
         return workedHours * hourlyRate * 12;
    }
}
