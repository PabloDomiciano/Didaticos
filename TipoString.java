
package fundamentos;

public class TipoString {
    public static void main(String[] args) {
                                    // Funcionalidades de Strings.
        String teste = "Ola mundo";
        
        System.out.println(teste.concat("!!"));     /*  Método que adiciona através da concatenação a String (!!)." */
        
        
        System.out.println(teste.toUpperCase());    /* Método que imprime a String em letra Maiúscula. */
            
        
        System.out.println(teste.toLowerCase());    /* Método que imprime a String em letra Minúscula. */
        
        
        System.out.println(teste.startsWith("Ola"));   /* Método que verifica se está iniciada com Ola, 
                                                        *  caso for verdadeiro retorna true. */ 
        
        System.out.println(teste.length());        /* Método de contagem de caracteres na váriavel teste. */
        
        System.out.println(teste.endsWith("mundo"));   /* Método que verifica se está finalizada com mundo 
                                                        *  caso for verdadeiro retorna true.          */
        
        System.out.println(teste.charAt(2));      /* Método que retorna o caractere apresentado pelo valor de sua posição. */
        
        System.out.println(teste.equalsIgnoreCase("ola mundo"));   /* Método que verifica a igualdade ignorando 
                                                                      se está sendo apresentado em minúsculo. */
      
        System.out.println(teste.equals("ola mundo"));          /* Método que verifica a igualdade
                                                                   considerando toda a String, caso contrário retorna false. */
        
        
        var nome = "Pablo";
        var sobrenome = "Henrique";
        var idade = 19;
        
        System.out.printf("Nome: %s %s tem %d anos.",nome,sobrenome,idade);   
                /* Utilizado para evitar várias concatenações */
                
        String frase = String.format("\nNome: %s %s tem %d anos.",nome,sobrenome,idade);
        System.out.println(frase);
                /* Método utilizado para atribuir uma variável. */
    }
 
}
