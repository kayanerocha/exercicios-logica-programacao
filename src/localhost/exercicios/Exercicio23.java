package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor
da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
 */
public class Exercicio23 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorHora, percentualDesconto, salarioBruto, salarioLiquido;
        int numeroAulas;

        System.out.print("Valor da hora: R$ ");
        valorHora = sc.nextDouble();
        System.out.print("Número de aulas: ");
        numeroAulas = sc.nextInt();
        System.out.print("Percentual de desconto: ");
        percentualDesconto = sc.nextDouble();

        salarioBruto = valorHora * numeroAulas;
        salarioLiquido = salarioBruto - (salarioBruto * percentualDesconto) / 100;
        System.out.printf("Salário líquido: R$ %.2f", salarioLiquido);
        sc.close();
    }
}
