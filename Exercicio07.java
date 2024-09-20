package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        // Declaração das variáveis para os lados do triângulo.
        double ladoA, ladoB, ladoC;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com os três lados do triângulo: ");
        ladoA = input.nextDouble();
        ladoB = input.nextDouble();
        ladoC = input.nextDouble();

        // Verifica se as medidas formam um triângulo.
        if ((ladoA - ladoB) < ladoC && ladoC < (ladoA + ladoB) &&
            (ladoB - ladoC) < ladoA && ladoA < (ladoB + ladoC) &&
            (ladoA - ladoC) < ladoB && ladoB < (ladoA + ladoC)) {
            System.out.println("As medidas formam um triângulo.");
        } else {
            System.out.println("As dimensões informadas não formam um triângulo.");
        }

        input.close();
    }
}
