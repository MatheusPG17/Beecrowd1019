
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int segundost, hora, minuto, segundo;
        
        //entrada de dados
        segundost = leia.nextInt();
        
        //processamento
        hora = (segundost / 60) / 60;
        minuto = (segundost / 60) % 60;
        segundo = segundost % 60;
        
        //saida de dados
        System.out.println(hora +":" + minuto + ":" + segundo);
    }
}
