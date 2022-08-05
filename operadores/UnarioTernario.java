
package fundamentos.operadores;
public class UnarioTernario {
    public static void main(String[] args) {
       
    // Operador Unário...    
    int a = 1;
    int b = 2;
    
    a++;  // a = a + 1;
    a--;  // a = a - 1;
    
    
    ++b; // b = b + 1;
    --b; // b = b - 1;
    
    System.out.println("Print de teste: ");
    System.out.println(++a == b--); 
    
    //----------------------------------//
    // Operador Ternário...
    double media = 4.3;
    String resultadoFinal = media >= 7.0 ? 
            "Aprovado" : "Recuperacao";
    System.out.println("O aluno esta: " + resultadoFinal);
    
    // Usando em operadores lógicos.
    double nota = 9.3;
    boolean bomAluno = true;
    boolean passouPorMedia = nota >= 6;
    boolean temDesconto = bomAluno && passouPorMedia;
    
    String resultado = temDesconto ? "Sim" : "Nao";
    System.out.println("Tem desconto? " + resultado);
    
    
    }
}
