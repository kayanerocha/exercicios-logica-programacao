package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor
de idade.
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        boolean isMaiorIdade = idade >= 18;

        System.out.println("Nome: " + nome);
        if (isMaiorIdade) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }


        sc.close();
    }
}
