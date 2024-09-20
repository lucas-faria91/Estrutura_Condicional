package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        // Variável para armazenar o valor de x.
        int x;

        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que insira o valor de x.
        System.out.print("Digite o valor de \"x\": ");
        x = input.nextInt();

        // Verifica o intervalo de x e calcula o valor correspondente.
        if (x < -2) {
            x = 2 * x + 2; // Se x é menor que -2
        } else if (x >= -2 && x < 3) {
            x = 3; // Se x está entre -2 (inclusivo) e 3 (exclusivo)
        } else if (x >= 3) {
            x = -x; // Se x é maior ou igual a 3
        }

        // Exibe o resultado.
        System.out.println("O valor de f(x) é: " + x);
        input.close();
    }
}
