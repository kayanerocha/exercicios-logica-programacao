package localhost.exercicios;

import java.util.Scanner;

/*
7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valor1, valor2;
        System.out.print("Valor 1: ");
        valor1 = sc.nextBoolean();
        System.out.print("Valor 2: ");
        valor2 = sc.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são verdadeiros");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são falsos");
        }

        sc.close();
    }
}
