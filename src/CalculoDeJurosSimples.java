import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoDeJurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        double valorEmprestado, taxaJuros, juros, montanteTotal;
        int meses;

        // Cabeçalho do programa
        System.out.println("CALCULADORA DE JUROS SIMPLES");
        System.out.println("---------------------------");

        // Entrada de dados
        System.out.print("Digite o valor emprestado (R$): ");
        valorEmprestado = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        taxaJuros = scanner.nextDouble();

        System.out.print("Digite o período em meses: ");
        meses = scanner.nextInt();

        // Cálculo dos juros simples usando a fórmula: Juros = (valor_emprestado * taxa_juros * meses) / 100
        juros = (valorEmprestado * taxaJuros * meses) / 100;

        // Cálculo do montante total (valor emprestado + juros)
        montanteTotal = valorEmprestado + juros;

        // Formatando para duas casas decimais
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Exibição dos resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("---------------------------");
        System.out.println("Valor emprestado: R$ " + df.format(valorEmprestado));
        System.out.println("Taxa de juros: " + taxaJuros + "% ao mês");
        System.out.println("Período: " + meses + " meses");
        System.out.println("Juros a pagar: R$ " + df.format(juros));
        System.out.println("Montante total: R$ " + df.format(montanteTotal));

        scanner.close();
    }
}