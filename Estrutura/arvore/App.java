import java.util.Scanner;

public class App {

    public static void menu() {
        System.out.println("\nEscolha uma opcao:");
        System.out.println("1 Adicionar");
        System.out.println("2 Remover");
        System.out.println("3 Listar");
        System.out.println("4 Buscar");
        System.out.println("0 Sair");
        System.out.print("> ");
    }
    public static void main(String[] args) {
        
        Arvore arvore = new Arvore();

        Scanner scan = new Scanner(System.in);

        int opcao;
        String conteudo;

        System.out.println("ATENCAO DIGITE APENAS CARACTERES E STRINGS");
        menu();
        opcao = scan.nextInt();

        do{
            switch(opcao){
                case 1:
                    System.out.print("Digite algo a ser adicionado a arvore: ");
                    conteudo = scan.nextLine();
                    conteudo = scan.nextLine();
                    arvore.inserir(conteudo);
                break;

                case 2:
                    System.out.print("Digite o conteudo a ser removido: ");
                    conteudo = scan.nextLine();
                    conteudo = scan.nextLine();
                    System.out.println(arvore.remover(conteudo)?"Removido com sucesso":"Nao foi possivel remover '"+conteudo+"'.\nConfira se o conteudo digitado esta correto");
                    arvore.remover(conteudo);
                break;

                case 3:
                    arvore.emOrdem();
                    arvore.emPosOrdem();
                    arvore.emPreOrdem();
                break;

                case 4: 
                    System.out.println("Digite o conteudo a ser buscado");
                    conteudo = scan.nextLine();
                    conteudo = scan.nextLine();
                    System.out.println(arvore.buscar(conteudo) == null?"Conteudo encontrado":"Conteudo nao encontrado");
                    
                break;
            }
        menu();
        opcao = scan.nextInt();
        }while(opcao != 0);

    }
}


