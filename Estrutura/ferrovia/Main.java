import java.util.Scanner;

public class Main {

    private static void menu() {
        System.out.println("\nDigite uma opcao");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Listar");
        System.out.println("0 - Sair");
        System.out.print("> ");
    }
    
    public static void main(String[] args) {
        
        int op;
        String conteudo;

        Scanner scan = new Scanner(System.in);
        Trem trem = new Trem();

        do{
            menu();
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Digite o conteudo do vagao: ");
                    conteudo = scan.nextLine();
                    conteudo = scan.nextLine();
                    trem.adicionar(conteudo);
                    System.out.println("Vagao adicionado");
                break;

                case 2:
                    System.out.println(trem.romever()?"Removido com sucesso":"Nao ha vagoes");
                break;

                case 3:
                    System.out.println(trem.listar());
                break;

                case 0: break;
            }
        }while(op != 0);
    }
}
