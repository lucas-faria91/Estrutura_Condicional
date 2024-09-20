package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        // Declaração das variáveis
        double numero1, numero2;
        int escolha;

        Scanner input = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Entre com os dois números que deseja calcular: ");
        numero1 = input.nextDouble();
        numero2 = input.nextDouble();

        // Menu de operações
        System.out.println("Informe qual operação deseja realizar");
        System.out.println("Digite:\n1 - Somar os dois números: "); 
        System.out.println("2 - Multiplicar os dois números: ");
        System.out.println("3 - Subtrair os dois números: ");
        System.out.println("4 - Dividir os dois números: ");
        escolha = input.nextInt();

        // Fechar o scanner
        input.close();

        // Switch para realizar a operação escolhida
        switch (escolha) {
            case 1:
                System.out.println("Você selecionou somar dois números, o resultado é: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Você selecionou multiplicar dois números, o resultado é: " + (numero1 * numero2));
                break;

            case 3:
                System.out.println("Você selecionou subtrair dois números, o resultado é: " + (numero1 - numero2));
                break;

            case 4:
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    System.out.println("Você selecionou dividir dois números, o resultado é: " + (numero1 / numero2));
                }
                break;

            default:
                System.out.println("Entrada inválida, escolha um número de 1 a 4.");
                break;
        }
    }
}

