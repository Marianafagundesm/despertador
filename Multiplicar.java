import java.util.*;
public class Multiplicar {  
public static void main (String [] args) {
    Scanner inputScanner = new Scanner (System.in) ;
    System.out.println("Digite o primeiro número a ser multiplicado e tecle Enter");
    String respostaUsuario = inputScanner.nextLine().trim();
    int numeroUm = Integer.valueOf(respostaUsuario);
    System.out.println("Digite o segundo número a ser multiplicado e tecle Enter");
    respostaUsuario = inputScanner.nextLine().trim();
    int numeroDois = Integer.valueOf(respostaUsuario);
    System.out.println("o resultado da multiplicacao é:" + (numeroUm * numeroDois));
    inputScanner.close();

}   
}


    

