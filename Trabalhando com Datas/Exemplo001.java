import java.util.Date;

public class Exemplo001 {

    public static void main(String[] args) {

        Date novaData = new Date(1045101600000L);
        Date referencia = new Date(1273892400000L);

        System.out.println(novaData.before(referencia) ? "Nascido antes de 15 de Maio de 2010" : "Nascido depois de 15 de Maio de 2010");

    }

}