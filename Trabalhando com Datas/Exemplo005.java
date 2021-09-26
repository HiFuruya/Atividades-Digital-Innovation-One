import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Exemplo005{
    public static void main(String[] args) {

        int data;

        Scanner scan = new Scanner(System.in);
        Calendar vencimento = Calendar.getInstance();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("\nDigite o dia do vencimento: ");
        data = scan.nextInt();
        vencimento.set(Calendar.DATE, data);
        

        System.out.print("Digite o mes do vencimento: ");
        data = scan.nextInt();
        vencimento.set(Calendar.MONTH, data - 1);

        System.out.print("Digite o ano do vencimento: ");
        data = scan.nextInt();
        vencimento.set(Calendar.YEAR, data);
        
        System.out.println("\nA data de vencimento e: "+formatador.format(vencimento.getTime()));
        vencimento.add(Calendar.DATE, +10);

        switch (vencimento.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                vencimento.add(Calendar.DATE, +1);
                break;
        
            case 7:
                vencimento.add(Calendar.DATE, +2);
                break;
        }
    
        System.out.println("A data limite para pagamento sem adesao de juros e: "+formatador.format(vencimento.getTime()));
    }
}