
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int segundost, hora, minuto, segundo;
        
        segundost = leia.nextInt();
        
        hora = (segundost / 60) / 60;
        minuto = (segundost / 60) % 60;
        segundo = segundost % 60;
        
        System.out.println(hora +":" + minuto + ":" + segundo);
    }
}
