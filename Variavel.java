import java.util.*; //esse codigo importa todas as bibliotecas do java deixando tudo livre pra usar
import java.time.*;

public class Variavel { // declaraçao de classe variavel
    public static void main(String[] args) { // declaraçao do metodo
        int horaAtual = LocalDateTime.now().getHour(); // declaraçao da variavel horaAtual que vai receber
        // em numero inteiro o resultado da chamada do metodo getHour()
        int minutoAtual = LocalDateTime.now().getMinute(); 
        int segundoAtual = LocalDateTime.now().getSecond(); 
        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual); // impressao da variavel horaAtual no terminal da saida do sistema
    } // finalizou metodo executar main()
} // finalizou classe variavel
  // shift + alt + seta pra baixo: cria uma copia da linha de baixo
  // se vc quiser comentar assim: ctrl + ; (isso nao afeta o codigo)
