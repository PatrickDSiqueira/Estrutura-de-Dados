package Av1.Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] estante = new int[40][40]; 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print("Digite o código do produto (1 a 5) na posição [" + i + "][" + j + "]: ");
                int codigo = scanner.nextInt();

                if (codigo >= 1 && codigo <= 5) {
                    estante[i][j] = codigo;
                } else {
                    System.out.println("Código de produto inválido. Use um código de 1 a 5.");
                    j--; 
                              }
            }
        }

        int[] quantidadePorTipo = new int[5]; 

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                int codigo = estante[i][j];
                quantidadePorTipo[codigo - 1]++; 
                        }
        }

        for (int i = 0; i < 5; i++) {
            switch (i + 1) {
                case 1:
                    System.out.println("Quantidade de xampus na estante: " + quantidadePorTipo[i]);
                    break;
                case 2:
                    System.out.println("Quantidade de condicionadores na estante: " + quantidadePorTipo[i]);
                    break;
                case 3:
                    System.out.println("Quantidade de hidratantes na estante: " + quantidadePorTipo[i]);
                    break;
                case 4:
                    System.out.println("Quantidade de tinturas na estante: " + quantidadePorTipo[i]);
                    break;
                case 5:
                    System.out.println("Quantidade de demaquilantes na estante: " + quantidadePorTipo[i]);
                    break;
            }
        }

        scanner.close();
    }
}