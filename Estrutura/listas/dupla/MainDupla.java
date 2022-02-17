import java.util.Scanner;

public class MainDupla{

    private static void menu(){
        System.out.println("1 - Adicionar a lista");
        System.out.println("2 - Adicionar a lista em posicao especifica");
        System.out.println("3 - Remover da lista");
        System.out.println("4 - Tamanho da lista");
        System.out.println("5 - Ver lista");
        System.out.println("0 - Sair");
    }
    public static void main(String[] args) {

        ListaDupla lista = new ListaDupla();

        Scanner scan = new Scanner(System.in);
        
        int opcao;
        String texto;

        menu();
        opcao = scan.nextInt();

        do{
            switch(opcao){
                case 1: 
                    System.out.print("\nDigite algo a lista: ");
                    texto = scan.nextLine();
                    texto = scan.nextLine();
                    lista.incluir(texto);
                    System.out.println("Adicionado com sucesso");
                break;
    
                case 2:
                    System.out.print("\nDigite algo a lista: ");
                    texto = scan.nextLine();
                    texto = scan.nextLine();
                    System.out.print("Digite a posicao a ser adicionada: ");
                    opcao = scan.nextInt();
                    System.out.println(lista.incluirPosicao(texto, opcao)?"\nAdicionado com sucesso":"\nNao foi possivel adicionar o item");
                break;
    
                case 3: 
                    System.out.print("Digite a posicao a ser removida: ");
                    opcao = scan.nextInt();
                    System.out.println(lista.excluir(opcao)?"\nRemovido com sucesso":"\nNao foi possivel remover o item");
                break;
    
                case 4: 
                    System.out.println("\nQuantidade de itens na lista: "+lista.tamanho());    
                break;
    
                case 5: 
                    System.out.println(lista.listar());
            }
            menu();
            opcao = scan.nextInt();
        }while(opcao != 0);
    }
}