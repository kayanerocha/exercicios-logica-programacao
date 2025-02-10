package localhost.exercicios;

import java.util.Scanner;

// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para obter a sua tabuada: ");
        int valor = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", valor, i, valor * i);
        }
        sc.close();
    }
}
