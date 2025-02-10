package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira
entre eles.
*/
public class Exercicio22 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a, b;
        double quociente, resto;
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();

        quociente = (double) a / b;
        resto = a % b;
        System.out.printf("Quociente: %.2f\nResto: %.2f", quociente, resto);
        sc.close();
    }
}
