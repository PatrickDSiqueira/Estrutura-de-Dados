package diagnostica;

//✓ Entrar com um vetor randômico de 50posições
//✓ Implementar o método de ordenação da Bolha – Bubble Sort(https://www.devmedia.com.br/entendendo-o-algoritmo-bubble-sort-em-java/24812)
//✓ Realizar a rotina de busca de um elemento no vetor – método
//de pesquisa Binária

import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] vetor = new int[50];

        int vetorLength = vetor.length;


        for (int i = 0; i < vetorLength; i++) {

            vetor[i] = aleatorio.nextInt();
        }

        for (int i = 0; i < vetorLength; i++) {

            for (int j = 0; j < vetorLength - 1; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor Organizado -> ");

        for (int number : vetor) {
            System.out.println(" " + number);
        }
    }
}
