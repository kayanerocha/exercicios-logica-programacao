package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o
 nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser
 maior ou igual a 7.
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome, situacao;
        double[] notas = new double[4];
        double media = 0.0;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("N%d = ", i+1);
            notas[i] = sc.nextDouble();
        }
        for (double nota : notas) {
            media += nota;
        }
        media /= notas.length;
        situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println(media);
        System.out.printf("Nome: %s\nSituação: %s", nome, situacao);

        sc.close();
    }
}
