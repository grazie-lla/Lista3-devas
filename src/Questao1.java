import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
         double num1 = input.nextDouble();

        System.out.println("Insira o segundo número:");
        double num2 = input.nextDouble();

        System.out.println("Escolha o número da operação: 1-somar, 2-subtrair, 3-dividir ou 4-multiplicar");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                sum(num1, num2);
                break;
            case 2:
                subtraction(num1, num2);
                break;
            case 3:
                division(num1, num2);
                break;
            case 4:
                multiplication(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    public static void sum (double num1, double num2){

        System.out.println("O resultado da soma é " + (num1 + num2));
    }

    public static void subtraction (double num1, double num2){

        System.out.println("O resultado da subtração é " + (num1 - num2));
    }

    public static void division (double num1, double num2){

        if (num1 != 0 && num2 !=0) {
            System.out.println("O resultado da divisão é " + (num1 / num2));
        } else {
            System.out.println("Não é permitido divisões com 0.");
        }
    }

    public static void multiplication (double num1, double num2){

        System.out.println("O resultado da multiplicação é " + (num1 * num2));
    }
}
