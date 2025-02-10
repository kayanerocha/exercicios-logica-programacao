package localhost.exercicios;

import java.util.Scanner;

/*
14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
 */
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.printf("A = %d\nB = %d", a, b);

        sc.close();
    }
}
