package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // Programa para calcular o Índice de Massa Corporal (IMC).
        Scanner input = new Scanner(System.in);
        double peso;
        double altura;
        double IMC;

        // Solicita o peso do usuário.
        System.out.print("Entre com seu peso: ");
        peso = input.nextDouble();

        // Solicita a altura do usuário.
        System.out.print("Entre com sua altura: ");
        altura = input.nextDouble();
        
        // Calcula o IMC.
        IMC = peso / (altura * altura);
        input.close();
        
        // Exibe o resultado do IMC formatado.
        System.out.format("Seu Índice de Massa Corporal (IMC) é: %.2f ", IMC);
        
        // Classifica o IMC e exibe a categoria correspondente.
        if (IMC < 20.0) {
            System.out.println("IMC classificado como: abaixo do peso");
        } else if (IMC >= 20.0 && IMC < 25.0) {
            System.out.println("IMC classificado como: Peso normal");
        } else if (IMC >= 25.0 && IMC < 30.0) {
            System.out.println("IMC classificado como: Sobrepeso");
        } else if (IMC >= 30.0 && IMC < 40.0) {
            System.out.println("IMC classificado como: Obeso");
        } else if (IMC >= 40) {
            System.out.println("IMC classificado como: Obeso Mórbido");
        }
    }
}
