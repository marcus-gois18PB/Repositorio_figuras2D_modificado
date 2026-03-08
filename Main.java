import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RepositorioDeFiguras2D repo = new RepositorioDeFiguras2D();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Adicionar Quadrado");
            System.out.println("2 - Adicionar Círculo");
            System.out.println("3 - Listar figuras");
            System.out.println("4 - Consultar área");
            System.out.println("5 - Consultar perímetro");
            System.out.println("6 - Consultar tipo");
            System.out.println("7 - Remover figura");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    int posQ = repo.adicionaFigura(new Quadrado(lado));
                    System.out.println("Quadrado adicionado na posição " + posQ + ".");
                    break;

                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    int posC = repo.adicionaFigura(new Circulo(raio));
                    System.out.println("Círculo adicionado na posição " + posC + ".");
                    break;

                case 3:
                    System.out.println("\n=== Figuras no repositório ===");
                    String lista = repo.listaFiguras();
                    System.out.print(lista.isEmpty() ? "Repositório vazio.\n" : lista);
                    break;

                case 4:
                    System.out.print("Digite a posição da figura: ");
                    int posArea = scanner.nextInt();
                    System.out.printf("Área: %.2f%n", repo.area(posArea));
                    break;

                case 5:
                    System.out.print("Digite a posição da figura: ");
                    int posPerimetro = scanner.nextInt();
                    System.out.printf("Perímetro: %.2f%n", repo.perimetro(posPerimetro));
                    break;

                case 6:
                    System.out.print("Digite a posição da figura: ");
                    int posTipo = scanner.nextInt();
                    System.out.println("Tipo: " + repo.tipo(posTipo));
                    break;

                case 7:
                    System.out.print("Digite a posição da figura a remover: ");
                    int posRemover = scanner.nextInt();
                    FiguraGeometrica2D removida = repo.removeFigura(posRemover);
                    System.out.println("Figura removida: " + removida);
                    break;


                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
