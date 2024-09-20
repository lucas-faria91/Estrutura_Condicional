package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        double lado1, lado2, lado3;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite os três lados do triângulo: ");
        lado1 = input.nextDouble();
        lado2 = input.nextDouble();
        lado3 = input.nextDouble();

        input.close();

        // Corrigindo a lógica de identificação dos tipos de triângulos
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo não é nem isósceles, nem equilátero.");
        }
    }
}
