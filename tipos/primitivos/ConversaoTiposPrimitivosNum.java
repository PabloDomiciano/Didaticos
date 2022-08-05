
package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoTiposPrimitivosNum {
    
    public static void main(String[] args) {
        
        double a = 1;           // Conversão implícita.
        System.out.println(a);
        
        float b = (float) 10;      // Conversão explicíta (CAST).
        System.out.println(b);
        
        int c = 4;
        byte d = (byte) c;         /* A conversão do tipo Inteiro para o tipo Byte
                                    * pode ocorrer a perca de informações! (CAST) */
        System.out.println(d); 
        
        double e = 1.9999999;      /* Neste caso o número 1.9999... é arredondado para 1. */
        int f = (int) e;
        
        System.out.println(f);     //Impressão de teste.
        
        // Conversão de Número para String.
        Integer num1 = 100;
        System.out.println(num1.toString().length());   /* Através do método foi convertido
                                                           a váriavel Integer em tipo String, 
                                                           utilizando a função length para 
                                                           contar os caracteres presentes na váriavel.*/
        
        int num2 = 1000;
        System.out.println(Integer.toString(num2).length());
                                                               /* Outras maneiras de conversão */
        System.out.println((" " + num2).length());
        
    }
    
}
