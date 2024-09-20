package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // Programa para calcular as raízes de uma equação do 2º grau.
        double a, b, c, delta;

        Scanner input = new Scanner(System.in);

        // Solicita os valores de a, b e c para a equação.
        System.out.print("Informe os valores de a, b e c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        // Fecha o scanner para evitar vazamento de recursos.
        input.close();

        // Calcula o valor de delta.
        delta = Math.pow(b, 2) - (4 * a * c);
        
        // Verifica a natureza das raízes com base no valor de delta.
        if (delta < 0) {
            System.out.format("Não existe raiz real");
        } else if (delta == 0) {
            System.out.println("Existe somente uma raiz: x = " + (-b) / (2 * a));
        } else {
            System.out.println("A primeira raiz é: x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("A segunda raiz é: x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}