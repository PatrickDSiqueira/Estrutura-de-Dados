import java.util.Stack;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<String> historico = new Stack<>();

        File arquivo = new File("caminho_do_arquivo.txt");

        Scanner scanner = new Scanner(new File("\Users\12114788\Desktop\Estrutura-de-Dados\Av1\Questao1\Lista_URL.txt"));
        while (scanner.hasNextLine()){
            historico.push(scanner.nextLine());
        }

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar link ao histórico");
            System.out.println("2 - Mostrar histórico de links");
            System.out.println("3 - Excluir link do histórico");
            System.out.println("4 - Mostrar quantidade de registros");
            System.out.println("5 - Consultar um link");
            System.out.println("6 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Digite o link a ser adicionado: ");
                    String link = scanner.nextLine();
                    historico.push(link);
                    System.out.println("Link adicionado ao histórico.");
                    break;
                case 2:
                    System.out.println("Histórico de links (do mais recente para o mais antigo):");
                    for (String l : historico) {
                        System.out.println(l);
                    }
                    break;
                case 3:
                    System.out.print("Digite o índice do link a ser excluído: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    if (indice >= 0 && indice < historico.size()) {
                        historico.removeElementAt(indice);
                        System.out.println("Link excluído do histórico.");
                    } else {
                        System.out.println("Link inexistente.");
                    }
                    break;
                case 4:
                    System.out.println("Quantidade de registros no histórico: " + historico.size());
                    break;
                case 5:
                    System.out.print("Digite o link a ser consultado: ");
                    String linkConsultado = scanner.nextLine();
                    if (historico.contains(linkConsultado)) {
                        System.out.println("Link encontrado no histórico.");
                    } else {
                        System.out.println("Link não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
