package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        double valorReajustado = valor + (valor * 0.05);
        System.out.println("Valor com reajuste de 5%: " + valorReajustado);

        sc.close();
    }
}
