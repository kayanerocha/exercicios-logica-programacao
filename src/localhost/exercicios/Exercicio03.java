package localhost.exercicios;

import java.util.Scanner;

/*
3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois
valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a
uma variável C e imprimir seu valor na tela.
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();
        c = a == b ? a + b : a * b;
        System.out.println("C = " + c);

        sc.close();
    }
}
