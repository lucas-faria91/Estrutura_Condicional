package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        // Variáveis para velocidade inicial, velocidade final, altura, gravidade e tempo.
        double v0, v, h, g = 0;
        int planeta; 
        double t;

        Scanner input = new Scanner(System.in);

        // Exibe a lista de planetas.
        System.out.println("1 - Mercúrio");
        System.out.println("2 - Vênus");
        System.out.println("3 - Terra");
        System.out.println("4 - Marte");
        System.out.println("5 - Júpiter");
        System.out.println("6 - Saturno");
        System.out.println("7 - Urano");
        System.out.println("8 - Netuno");
        System.out.println("9 - Plutão");

        // Solicita ao usuário o planeta em que ele está.
        System.out.print("Em qual planeta você está? ");
        planeta = input.nextInt();

        // Solicita a velocidade inicial da bola.
        System.out.print("Qual a velocidade inicial da bola que você quer lançar? ");
        v0 = input.nextDouble();

        // Solicita o tempo após o lançamento.
        System.out.print("Digite o tempo em que você quer ver a bola após o lançamento: ");
        t = input.nextDouble();

        // Define a gravidade com base no planeta selecionado.
        switch (planeta) {
            case 1:
                g = 3.7; // Mercúrio
                break;
            case 2:
                g = 8.8; // Vênus
                break;
            case 3:
                g = 9.8; // Terra
                break;
            case 4:
                g = 3.8; // Marte
                break;
            case 5:
                g = 26.4; // Júpiter
                break;
            case 6:
                g = 11.5; // Saturno
                break;
            case 7:
                g = 9.3; // Urano
                break;
            case 8:
                g = 12.2; // Netuno
                break;
            case 9:
                g = 0.6; // Plutão
                break;
            default:
                System.out.println("ERRO: Planeta desconhecido");
                // Encerra o programa se o planeta for desconhecido
        }

        // Calcula a velocidade final e a altura.
        v = v0 - g * t;
        h = v0 * t - (g * Math.pow(t, 2)) / 2;

        // Exibe os resultados formatados.
        System.out.format("\nVelocidade = %.2f m/s", v);
        System.out.format("\nAltura = %.2f m\n", h);
        
        input.close();
    }
}
