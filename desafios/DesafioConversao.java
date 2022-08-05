
package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu salario do primeiro mes: ");       
        String salario1 = teclado.nextLine().replace("," , ".");
        
        System.out.println("Digite o seu salario do segundo mes: ");
        String salario2 = teclado.nextLine().replace(",", ".");
        
        System.out.println("Digite o seu salario terceiro mes: ");
        String salario3 = teclado.nextLine().replace(",", ".");
        
        double num1 = Double.parseDouble(salario1);
        double num2 = Double.parseDouble(salario2);
        double num3 = Double.parseDouble(salario3);
        
        double media = (num1 + num2 + num3) / 3;
        
        System.out.println("A media de salario e de: " + media);
        
        teclado.close();
        
    }
}
