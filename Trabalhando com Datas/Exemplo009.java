import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo009 {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSSS");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

    }
}