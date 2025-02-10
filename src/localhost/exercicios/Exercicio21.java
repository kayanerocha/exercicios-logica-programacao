package localhost.exercicios;

// 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
public class Exercicio21 {

    public static void main(String[] args) {
        int menor = 0;
        int maior = 100;
        int intervalo = maior - menor;
        System.out.println((int)(Math.random() * intervalo) + menor);
    }
}
