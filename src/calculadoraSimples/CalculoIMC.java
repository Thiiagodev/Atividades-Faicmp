package calculadoraSimples;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("CALCULADORA DE IMC ");

        System.out.print("Digite o seu peso (kg): ");
        peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("#,##0.0");

        System.out.println("RESULTADO:");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + df.format(imc));

        System.out.print("Classificação: ");

        if (imc < 18.5) {
            System.out.println("ABAIXO DO PESO");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("PESO NORMAL");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("SOBREPESO");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("OBESIDADE GRAU I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("OBESIDADE GRAU II (SEVERA)");
        } else {
            System.out.println("OBESIDADE GRAU III (MÓRBIDA)");
        }

        scanner.close();
    }
}
