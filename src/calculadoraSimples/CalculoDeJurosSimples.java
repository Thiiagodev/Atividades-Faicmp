package calculadoraSimples;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoDeJurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorEmprestado, taxaJuros, juros, montanteTotal;
        int meses;

        System.out.println("CALCULADORA DE JUROS SIMPLES");
        System.out.println("---------------------------");

        System.out.print("Digite o valor emprestado (R$): ");
        valorEmprestado = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        taxaJuros = scanner.nextDouble();

        System.out.print("Digite o período em meses: ");
        meses = scanner.nextInt();

        juros = (valorEmprestado * taxaJuros * meses) / 100;

        montanteTotal = valorEmprestado + juros;

        DecimalFormat df = new DecimalFormat("#,##0.00");


        System.out.println("RESULTADO:");
        System.out.println("Valor emprestado: R$ " + df.format(valorEmprestado));
        System.out.println("Taxa de juros: " + taxaJuros + "% ao mês");
        System.out.println("Período: " + meses + " meses");
        System.out.println("Juros a pagar: R$ " + df.format(juros));
        System.out.println("Montante total: R$ " + df.format(montanteTotal));

        scanner.close();
    }
}