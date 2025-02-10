package localhost.exercicios;

import java.util.Scanner;

/*
1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma
é menor que C.
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, soma;
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();
        System.out.print("C = ");
        c = sc.nextInt();
        soma = a + b;
        boolean isSomaMaiorC = soma > c;
        System.out.println("Soma: " + soma);
        System.out.println("Soma é maior que C: " + isSomaMaiorC);

        sc.close();
    }
}
