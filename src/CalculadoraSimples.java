import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado;
        char operacao;

        System.out.println("Calculadora simples");

        System.out.print("Digite um numero: ");
        numero1 = entrada.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = entrada.next().charAt(0);

        System.out.print("Digite um numero: ");
        numero2 = entrada.nextDouble();

        switch(operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, resultado);
                break;

            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, resultado);
                } else {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Operação inválida! Por favor, use +, -, * ou /.");
        }

        entrada.close();
    }
}