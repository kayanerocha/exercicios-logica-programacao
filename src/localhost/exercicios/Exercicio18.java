package localhost.exercicios;

/*
18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça
um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
 */
public class Exercicio18 {

    public static void main(String[] args) {
        double alturaFrancisco = 150;
        double alturaSara = 110;

        int qntAnos = 0;
        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += 2.0;
            alturaSara += 3.0;
            qntAnos++;
        }
        System.out.printf("Serão necessários %d anos.", qntAnos);
    }
}
