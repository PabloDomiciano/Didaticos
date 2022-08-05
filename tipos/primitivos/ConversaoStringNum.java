
package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNum {
    public static void main(String[] args) {
    // Conversão de String para Número.

    String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
    String valor2 = JOptionPane.showInputDialog("Digite o segundo número");    
    
    System.out.println(valor1 + valor2);  /* Valor no tipo String. */
    
    double num1 = Double.parseDouble(valor1);  /* Convertendo o valor do tipo String para o tipo Double. */
    double num2 = Double.parseDouble(valor2);   // e adicionando na variável num1 e num2.
    
    double soma = num1 + num2;                 /* Adicionando a variável soma. */
    System.out.println("A soma e: " + soma);   /* Imprimindo a variável soma. */
    System.out.println("A media e: " + soma / 2);   /*Imprimindo a média da soma. */
    }
}
