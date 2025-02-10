package localhost.exercicios;

import java.util.Scanner;

/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número = ");
        int numero = sc.nextInt();
        String parOuImpar = numero % 2 == 0 ? "Par" : "Ímpar";
        String positivoOuNegativo = numero > 0 ? "Positivo" : "Negativo";

        System.out.println("Número " + numero + " é:");
        System.out.println("- " + parOuImpar + "\n- " + positivoOuNegativo);

        sc.close();
    }
}
