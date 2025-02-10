package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários
mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioMinimo, salarioUsuario, qtdSalarios;
        System.out.print("Salário mínimo: ");
        salarioMinimo = sc.nextDouble();
        System.out.print("Seu salário: ");
        salarioUsuario = sc.nextDouble();

        qtdSalarios = salarioUsuario / salarioMinimo;
        System.out.printf("Quantidade de salários: %.2f", qtdSalarios);

        sc.close();
    }
}
