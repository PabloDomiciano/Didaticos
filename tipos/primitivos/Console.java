package fundamentos;

import java.util.Scanner;

public class Console {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);  /* Entrada do sistema (teclado). */
        
        System.out.print("Digite o seu nome: ");   
        String nome = teclado.nextLine();          /* Armazena o conteúdo do teclado na variável nome. */
        
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = teclado.nextLine();     /* Armazena o conteúdo do teclado na variável sobrenome */
        
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();             /* Armazena o conteúdo do teclado na variável idade,
                                                    *              utilizando o tipo inteiro. */
        System.out.println("Nome: " + nome + " " + sobrenome + 
                "\n Idade: " + idade + " Anos");     
        
        teclado.close(); 
        /* Comando de fechamento do console, utilizado para liberar espaço na memória */
    }
}
