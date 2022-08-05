package fundamentos;

import java.util.Scanner;

public class Wrapper {
   
    /* Wappers são a versão do objeto dos tipos primitivos */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        
        Integer i =  Integer.parseInt(teclado.next());  /* Método que converte o tipo String para o tipo Inteiro,
                                                         *  utilizando console e adionando na variável (i).     */
        
        boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        
        System.out.println("Valor apresentado: " + i);   /* Imprimindo o valor da variável i! */
        
    }
}
