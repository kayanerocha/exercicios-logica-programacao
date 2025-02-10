package localhost.exercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa
ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)
 */
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano, dias, meses, anos;
        System.out.print("Dia: ");
        dia = sc.nextInt();
        System.out.print("Mês: ");
        mes = sc.nextInt();
        System.out.print("Ano: ");
        ano = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        anos = calendar.get(Calendar.YEAR) - ano;
        meses = calendar.get(Calendar.MONTH) + 1 - mes;
        dias = calendar.get(Calendar.DAY_OF_MONTH) - dia;

        System.out.printf("%d anos, %d meses e %d dias", anos, meses, dias);

        sc.close();
    }
}
