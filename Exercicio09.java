package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        // Declaração da variável
        int diaria;

        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Quantos dias você permanecerá no hotel? ");
        diaria = input.nextInt();

        // Cálculo do total a pagar
        if (diaria < 15) {
            System.out.println("O total a pagar é: " + ((diaria * 15) + 500));
        } else if (diaria == 15) {
            System.out.println("O total a pagar é: " + ((diaria * 10) + 500));
        } else {
            System.out.println("O total a pagar é: " + ((diaria * 5) + 500));    
        }

        // Fechar o scanner
        input.close();
    }
}
