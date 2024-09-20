package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        // Programa para calcular a média de três notas e determinar a situação do aluno.
        Double nota1, nota2, nota3, media;

        Scanner input = new Scanner(System.in);

        // Solicita a primeira nota do aluno.
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = input.nextDouble();

        // Solicita a segunda nota do aluno.
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = input.nextDouble();

        // Solicita a terceira nota do aluno.
        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = input.nextDouble();

        // Fecha o scanner para evitar vazamento de recursos.
        input.close();

        // Calcula a média das notas.
        media = (nota1 + nota2 + nota3) / 3;

        // Verifica a situação do aluno com base na média.
        if ((media >= 0) && (media < 3)) {
            System.out.println(media + " Reprovado");
        } else if ((media >= 3) && (media < 7)) {
            System.out.println(media + " Exame");
        } else if ((media >= 7) && (media <= 10)) {
            System.out.println(media + " Aprovado");
        }
    }
}

