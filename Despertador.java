import java.time.*;
import java.util.*;  
import javax.sound.sampled.*;

public class Despertador {
    public static void main(String[] args) {
        int horaAtual = LocalDateTime.now().getHour() ;
        int horaDespertar = -1;
        int horaRestante = -1;

        int minutoAtual = LocalDateTime.now().getMinute();
        int minutoDespertar = -1;
        int minutoRestante = -1;

        int segundoAtual = LocalDateTime.now().getSecond();
        int segundoRestante = -1;
    }
}      