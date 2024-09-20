package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int dias, tipoApartamento;

        Scanner input = new Scanner(System.in);

        // Entrada do tipo de apartamento
        System.out.println("Qual tipo de apartamento você esteve?");
        System.out.println("Digite: ");
        System.out.println("1 - apartamento simples \n2 - apartamento duplo");
        tipoApartamento = input.nextInt();

        // Cálculo do valor a pagar com base no tipo de apartamento e dias de estadia
        switch (tipoApartamento) {
            case 1:
                System.out.println("Quantos dias você permaneceu conosco? ");
                dias = input.nextInt();
                if (dias < 10) {
                    System.out.println("Você ficou " + dias + " dias. O valor a pagar é: R$" + (dias * 100));
                } else if (dias <= 15) {
                    System.out.println("Você ficou " + dias + " dias. O valor a pagar é: R$" + (dias * 90));
                } else {
                    System.out.println("Você ficou " + dias + " dias. O valor a pagar é: R$" + (dias * 80));
                }
                break;

            case 2:
                System.out.println("Quantos dias você permaneceu conosco? ");
                dias = input.nextInt();
                if (dias < 10) {
                    System.out.println("Você ficou " + dias + " dias. O valor a pagar é: R$" + (dias * 140));
                } else if (dias <= 15) {
                    System.out.println("Você ficou " + dias + " dias. O valor a pagar é: R$" + (dias * 120));
                } else {
                    System.out.println("Você ficou " + dias + " dias. O valor a pagar é: R$" + (dias * 100));
                }
                break;

            default:
                System.out.println("Entrada inválida, digite 1 ou 2.");
                break;
        }

        // Fechar o scanner
        input.close();
    }
}

