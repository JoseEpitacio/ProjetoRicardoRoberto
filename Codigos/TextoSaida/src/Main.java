import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int contWhile = 0;
        Scanner scanner = new Scanner(System.in);
        int escolha;

        TextoSaida[] textos = {
            new TextoSaida(1, 12, "Preto", "Branco", "Label"),
            new TextoSaida(2, 14, "Azul", "Preto", "Edit"),
            new TextoSaida(3, 36, "Branco", "Azul", "Memo"),
            new TextoSaida(4, 8, "Cinza", "Amarelo", "Edit"),
            new TextoSaida(5, 22, "Amarelo", "Cinza", "Label"),
        };

        while(contWhile == 0){
            System.out.println("1 - Exibir Textos /n 2 - Editar Textos /n 3 - Sair");
            escolha = scanner.nextInt();

            switch(escolha){
                case 1:
                    for(TextoSaida texto : textos){
                        System.out.println("ID: " + texto.getId());
                        System.out.println("Tamanho da Letra: " + texto.getTamLetra());
                        System.out.println("Cor da Fonte: " + texto.getCorFonte());
                        System.out.println("Cor de Fundo: " + texto.getCorFundo());
                        System.out.println("Componente de Exibição: " + texto.getCompExibicao());
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Digite o ID do texto que deseja editar: ");
                    int id = scanner.nextInt();
                    System.out.println("Digite o novo tamanho da letra: ");
                    int tamLetra = scanner.nextInt();
                    System.out.println("Digite a nova cor da fonte: ");
                    String corFonte = scanner.next();
                    System.out.println("Digite a nova cor de fundo: ");
                    String corFundo = scanner.next();
                    System.out.println("Digite o novo componente de exibição: ");
                    String compExibicao = scanner.next();

                    for(TextoSaida texto : textos){
                        if(texto.getId() == id){
                            texto.editarTexto(id, tamLetra, corFonte, corFundo, compExibicao);
                        }
                    }
                    break;
                case 3:
                    contWhile = 1;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}