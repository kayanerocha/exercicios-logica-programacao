package localhost.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma
de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de
condições de pagamento para efetuar o cálculo adequado.
Tabela de Código de Condições de Pagamento
 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorProduto, valorTotal;
        int formaPagamento;

        System.out.print("Valor do produto R$ ");
        valorProduto = sc.nextDouble();
        System.out.println("Formas de pagamento:\n1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        do {
            System.out.print("Escolha: ");
            formaPagamento = sc.nextInt();
        } while (formaPagamento < 1 || formaPagamento > 4);

        switch (formaPagamento) {
            case 1:
                valorTotal = valorProduto - (valorProduto * 0.15);
                break;
            case 2:
                valorTotal = valorProduto - (valorProduto * 0.1);
                break;
            case 3:
                valorTotal = valorProduto;
                break;
            case 4:
                valorTotal = valorProduto + (valorProduto * 0.1);
                break;
            default:
                valorTotal = -1;
        }

        System.out.printf("Valor a ser pago: %.2f", valorTotal);

        sc.close();
    }
}
