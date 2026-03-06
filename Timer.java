import java.time.LocalDateTime;
import java.util.*;

public class Timer {
    public static void main (String[] args) {
        int contador = 0;
        while (true) {
         int horaAtual = LocalDateTime.now().getHour(); 
        int minutoAtual = LocalDateTime.now().getMinute(); 
        int segundoAtual = LocalDateTime.now().getSecond(); 
        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);
        System.out.println( "Deseja continuar ou parar?");
        System.out.println( "Digite [1] para parar e [2] para continuar, e tecle Enter");
        
        
            System.out.println("o número é:" + contador);
            try {
                Thread.sleep( 1000);
            }    catch (Exception e) {
                  System.out.println("Erro:" + e);
            }
            
            try {
                if (System.getProperty( "os.name"). contains( "windows")) {
                    new ProcessBuilder( "cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.println( "\033[h\0332j");
                    System.out.flush();
                }               
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }
            contador++;
        }
    }
}
