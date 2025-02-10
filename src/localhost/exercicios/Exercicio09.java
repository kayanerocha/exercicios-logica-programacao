package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima
na tela sua condição de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
 Abaixo de 18,5   | Abaixo do peso
 Entre 18,6 e 24,9 | Peso ideal (parabéns)
 Entre 25,0 e 29,9 | Levemente acima do peso
 Entre 30,0 e 34,9 | Obesidade grau I
 Entre 35,0 e 39,9 | Obesidade grau II (severa)
 Maior ou igual a 40 | Obesidade grau III (mórbida)
*/
public class Exercicio09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;
        String condicao;
        System.out.print("Peso: ");
        peso = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);

        if (imc <= 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc <= 24.9) {
            condicao = "Peso ideal (parabéns)";
        } else if (imc <= 29.9) {
            condicao = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            condicao = "Obesidade grau I";
        } else if (imc <= 39.9) {
            condicao = "Obesidade grau II (severa)";
        } else {
            condicao = "Obesidade grau III (mórbida)";
        }

        System.out.println("Condição: " + condicao);

        sc.close();
    }
}
