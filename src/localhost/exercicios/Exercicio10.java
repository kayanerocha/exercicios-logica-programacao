package localhost.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, media;
        System.out.print("N1 = ");
        n1 = sc.nextDouble();
        System.out.print("N2 = ");
        n2 = sc.nextDouble();
        System.out.print("N3 = ");
        n3 = sc.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("Média = %.2f", media);

        sc.close();
    }
}
