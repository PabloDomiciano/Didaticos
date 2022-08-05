
package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        
        int teste1 = 2;  // Valor atribuido a variável teste1 = 2.
        int teste2 = 4;  // Valor atirubido a variável teste2 = 4;
        
        System.out.println(teste1 == teste2);    // Verifica e compara se as variáveis são iguais.
        System.out.println(teste1 <= teste2);    // Verifica e compara se a variável teste1 é menor ou igual a teste2.
        System.out.println(teste1 >= teste2);    // Verifica e compara se a variável teste1 é maior ou igual a teste2.
        System.out.println(teste1 < teste2);     // Verifica e compara se a variável teste1 é menor que a teste2.
        System.out.println(teste1 > teste2);     // Verifica e compara se a variável teste1 é maior que a teste2.
        System.out.println(teste1 != teste2);    // Verifica e compara se a variável teste1 é diferente ou igual a teste2.
        
        // ------------------------------- //
        
        double nota = 7.4;
        boolean bomAluno = false;
        boolean passouPorMedia = nota > 6;
            // Teste em variável.
        
            
            System.out.println("Teste Aluno: -------");
        System.out.println("Passou: " + (bomAluno &&  passouPorMedia));
        
    }
}
