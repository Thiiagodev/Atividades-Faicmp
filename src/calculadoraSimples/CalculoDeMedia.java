package calculadoraSimples;

import java.util.Scanner;
import java.text.DecimalFormat;

    public class CalculoDeMedia {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            double nota1, nota2, nota3, media;

            System.out.println("CÁLCULO DE MÉDIA ARITMÉTICA");

            System.out.print("Digite a primeira nota: ");
            nota1 = entrada.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextDouble();

            System.out.print("Digite a terceira nota: ");
            nota3 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            DecimalFormat df = new DecimalFormat("#,##0.0");

            System.out.println("RESULTADO:");
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
            System.out.println("Média: " + df.format(media));


            if (media >= 7.0) {
                System.out.println("Situação: APROVADO");
            } else if (media >= 5.0) {
                System.out.println("Situação: EM RECUPERAÇÃO");
            } else {
                System.out.println("Situação: REPROVADO");
            }

            entrada.close();
        }
    }
