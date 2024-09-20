package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // Programa para calcular a média de duas notas e determinar a aprovação do aluno.
        Double nota1, nota2, media;

        Scanner input = new Scanner(System.in);

        // Solicita a primeira nota do aluno.
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = input.nextDouble();

        // Solicita a segunda nota do aluno.
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = input.nextDouble();

        // Fecha o scanner para evitar vazamento de recursos.
        input.close();

        // Calcula a média das notas.
        media = (nota1 + nota2) / 2;

        // Verifica se o aluno está aprovado ou reprovado.
        if (media >= 7) {
            System.out.println(media + " Aprovado");
        } else {
            System.out.println(media + " Reprovado");
        }
    }
}
