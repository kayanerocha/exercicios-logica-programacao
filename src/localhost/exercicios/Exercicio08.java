package localhost.exercicios;

import java.util.Scanner;

/*
8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, menor, maior, medio;
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();
        System.out.print("C = ");
        c = sc.nextInt();

        if (a < b && b < c) {
            menor = a;
            maior = c;
            medio = b;
        } else if (a < c && c < b) {
            menor = a;
            maior = b;
            medio = c;
        } else if (b < a && a < c) {
            menor = b;
            maior = c;
            medio = a;
        } else if (b < c && c < a) {
            menor = b;
            maior = a;
            medio = c;
        } else {
            menor = c;
            maior = Math.max(a, b);
            medio = Math.min(a, b);
        }
        System.out.printf("%d %d %d", maior, medio, menor);

        sc.close();
    }
}
