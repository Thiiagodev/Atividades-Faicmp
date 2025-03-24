package AtividadeSalarioFuncionario;

import java.util.Locale;
import java.util.Scanner;


public class LerDadosDoFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner captacao = new Scanner(System.in);

        // Lendo os dados do funcionário
        System.out.print("Nome: ");
        String nome = captacao.nextLine();

        System.out.print("Salario Bruto: ");
        double SalarioBruto = captacao.nextDouble();

        System.out.print("Taxa: ");
        double taxad = captacao.nextDouble();

        // Criando o objeto funcionário
        Funcionario Funcionario = new Funcionario(nome, SalarioBruto, taxad);

        // Perguntando a porcentagem de aumento e aplicando
        System.out.print("Porcentagem de aumento de sálrio? ");
        double percentage = captacao.nextDouble();
        Funcionario.increaseSalary(percentage);

        // Mostrando os dados atualizados
        System.out.printf("Atualização do seu salario do(a): %s, $ %.2f%n",
                Funcionario.getName(), Funcionario.netSalary());

        captacao.close();
    }
}

class Funcionario {
    private String nome;
    private double SalarioBruto;
    private double taxad;

    // Construtor
    public Funcionario(String nome, double SalarioBruto, double taxad) {
        this.nome = nome;
        this.SalarioBruto = SalarioBruto;
        this.taxad = taxad;
    }

    // Getters e setters
    public String getName() {
        return nome;
    }

    public void setNamo(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return SalarioBruto;
    }

    public void setSalarioBruto(double SalarioBruto) {
        this.SalarioBruto = SalarioBruto;
    }

    public double gettaxad() {
        return taxad;
    }

    public void settaxad(double tax) {
    }

    public double netSalary() {
        return SalarioBruto - taxad;
    }

    public void increaseSalary(double percentage) {
        SalarioBruto += SalarioBruto * percentage / 100.0;
    }

    }

