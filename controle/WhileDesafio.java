package controle;

import java.util.Scanner;

public class WhileDesafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair")) {
            System.out.print("Você diz: ");
            valor = entrada.next();
        }
        entrada.close();
    }
}