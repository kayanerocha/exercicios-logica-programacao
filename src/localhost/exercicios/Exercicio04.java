package localhost.exercicios;

import java.util.Scanner;

/*
4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, antecessor, sucessor;
        System.out.print("Número: ");
        numero = sc.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}
