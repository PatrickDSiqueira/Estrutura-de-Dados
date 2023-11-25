package questão1;

import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int input;

        String caminhoArquivo = "C:/Users/12123756/Desktop/Estrutura-de-Dados/Av2_Pratica/dados.txt";

        Scanner teste = new Scanner(caminhoArquivo);
        File arquivo = new File(caminhoArquivo);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }

        scanner.close();

        ArvoreAVL arvoreAVL = new ArvoreAVL();
        ArvoreAVL.Node node;

        do {

            System.out.println("<1> Inserir");
            System.out.println("<2> Excluir");
            System.out.println("<3> Pesquisar");
            System.out.println("<4> Caminhamento em pré-ordem");
            System.out.println("<5> Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out. println("Opção 1 selecionada: Inserir");
                    System.out. println("Digite o elemento que você quer inserir -> ");
                    input = scanner.nextInt();



                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Excluir");
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Pesquisar");
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Caminhamento em pré-ordem");
                    break;
                case 5:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
