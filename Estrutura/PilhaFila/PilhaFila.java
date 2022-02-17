package PilhaFila;
import java.util.Scanner;

public class PilhaFila {

    public static void main(String[] args) {

        int posicaoFila = 0;
        int posicaoPilha = 0;
        int opcao;

        int[] fila = new int[5];
        int[] pilha = new int[5];

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("1 - Adicionar a Fila");
            System.out.println("2 - Adicionar a Pilha");
            System.out.println("3 - Mostrar Fila");
            System.out.println("4 - Mostrar Pilha");
            System.out.println("5 - Remover da Fila");
            System.out.println("6 - Remover da Pilha");
            System.out.println("7 - Sair");
            System.out.print(">");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (posicaoFila < 5) {
                        System.out.print("Digite um valor a ser adicionado a Fila: ");
                        fila[posicaoFila] =  scan.nextInt();
                        posicaoFila++;
                    }

                    else{
                        System.out.println("Fila cheia");
                    }
                break;
                
                case 2:
                    if (posicaoPilha < 5) {
                        System.out.print("Digite um valor a ser adicionado a Pilha: ");
                        pilha[posicaoPilha] =  scan.nextInt();
                        posicaoPilha++;
                    }

                    else{
                        System.out.println("Pilha cheia");

                    }
                break;

                case 3:
                    if (posicaoFila > 0) {
                        System.out.print("Fila{");
                        for (int i = 0; i < posicaoFila; i++) {
                            System.out.print(" "+fila[i]);
                        }
                        System.out.println(" }");
                    }

                    else{
                        System.out.println("Fila vazia");
                    }
                    
                break;

                case 4:
                    if (posicaoPilha > 0) {
                        System.out.println("Pilha\n_");
                        for (int i = posicaoPilha - 1; i > -1; i--) {
                            System.out.println(pilha[i]);
                        }
                        System.out.println("_");
                    }

                    else{
                        System.out.println("Pilha vazia");
                    }
                   
                break;

                case 5:
                    if (posicaoFila == 0) {
                        System.out.println("Fila vazia");
                    }

                    else{
                        for (int i = 0; i < posicaoFila - 1; i++) {
                            fila[i] = fila[i + 1];
                        }
                        posicaoFila--;
                    }
                break;

                case 6:
                    if (posicaoPilha == 0) {
                        System.out.println("Pilha vazia");
                    }

                    else{
                        for (int i = posicaoPilha - 1; i > 0; i--) {
                            fila[i] = fila[i - 1];
                        }
                        posicaoPilha--;
                    }
                break;

                case 7:
                break;

                default:
                    System.out.println("Opcao Invalida");
                break;
            }
        }while(opcao != 7);


    }
}
