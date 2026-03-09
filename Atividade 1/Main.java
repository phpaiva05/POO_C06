package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // entrada de dados para , e .
        System.out.println("Insira o valor do ingresso inteiro: ");
        String entradaInt = teclado.nextLine().replace(",", ".");
        double inting = Double.parseDouble(entradaInt);

        System.out.println("Insira a quantidade de ingressos inteiros: ");
        int intquant = teclado.nextInt();
        teclado.nextLine(); // limpa o buffer
        // entrada de dados para , e .
        System.out.println("Insira o valor do meio ingresso: ");
        String entradaMeia = teclado.nextLine().replace(",", ".");
        double meiaing = Double.parseDouble(entradaMeia);

        System.out.println("Insira a quantidade de meios ingressos: ");
        int meiaquant = teclado.nextInt();
        teclado.nextLine(); // limpa o buffer

        // calculos
        double inttotal = inting * intquant;
        double meiatotal = meiaing * meiaquant;
        double total = inttotal + meiatotal;
        int ingtotal = (meiaquant + intquant);
        double valor_medio = total / ingtotal;

        //parte de saídas
        System.out.println("Valor total arrecadado com meio ingresso: " + meiatotal);
        System.out.println("Valor total arrecadado com ingresso inteiro: " + inttotal);
        System.out.println("Total arrecadado na sessão: " + total);
        System.out.println("Valor médio gasto por ingresso: " + valor_medio);
    }
}
