package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz
12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância
percorrida e a quantidade de litros utilizados para fazer a viagem.
Fórmulas:
    - distância = tempo x velocidade.
    - litros usados = distância / 12.
*/
public class Exercicio24 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double qntLitros, tempoViagem, velocidadeMedia, distancia;
        System.out.print("Tempo de viagem (horas): ");
        tempoViagem = sc.nextDouble();
        System.out.print("Velocidade média (Km/h): ");
        velocidadeMedia = sc.nextDouble();

        distancia = tempoViagem * velocidadeMedia;
        qntLitros = distancia / 12;

        System.out.printf("Distância: %.2f\nQuantidade de litros usados: %.2f", distancia, qntLitros);
        sc.close();
    }
}
