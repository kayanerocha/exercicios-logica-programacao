package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
Imprima na tela as duas temperaturas.
Fórmula: C = (5 * (F-32) / 9)
 */
public class Exercicio17 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temperaturaFahrenheit, temperaturaCelsius;
        System.out.print("Temperatura em Fahrenheit: ");
        temperaturaFahrenheit = sc.nextDouble();

        temperaturaCelsius = (5 * (temperaturaFahrenheit - 32) / 9);
        System.out.printf("Temperatura em Celsius: %.2fºC", temperaturaCelsius);
        sc.close();
    }
}
