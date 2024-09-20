package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int idade;
        String sexo;

        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        System.out.println("Digite seu sexo (masculino/feminino): ");
        sexo = input.next().toLowerCase(); // Converte para minúsculas para evitar problemas de comparação

        // Cálculo da mensalidade com base na idade e sexo
        switch (sexo) {
            case "masculino":
                if (idade <= 15) {
                    System.out.println("O valor da sua mensalidade é de R$60,00.");
                } else if (idade <= 18) {
                    System.out.println("O valor da sua mensalidade é de R$75,00.");
                } else if (idade <= 30) {
                    System.out.println("O valor da sua mensalidade é de R$90,00.");
                } else if (idade <= 40) {
                    System.out.println("O valor da sua mensalidade é de R$85,00.");
                } else {
                    System.out.println("O valor da sua mensalidade é de R$80,00.");
                }
                break; // Adicionado para evitar que o código continue executando

            case "feminino":
                if (idade <= 18) {
                    System.out.println("O valor da sua mensalidade é de R$60,00.");
                } else if (idade <= 25) {
                    System.out.println("O valor da sua mensalidade é de R$90,00.");
                } else if (idade <= 40) {
                    System.out.println("O valor da sua mensalidade é de R$85,00.");
                } else {
                    System.out.println("O valor da sua mensalidade é de R$80,00.");
                }
                break; // Adicionado para evitar que o código continue executando

            default:
                System.out.println("Digite masculino ou feminino.");
                break; // Adicionado para maior clareza
        }

        // Fechar o scanner
        input.close();
    }
}

