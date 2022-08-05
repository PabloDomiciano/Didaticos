
package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        
        String a = "Texto de teste";
        
        a = a.replace("teste", "testando"); /* Método utilizado para modificar */
        
        a = a.concat(" !! ");               /* Método utilizado para concatenar */
                                            
        a = a.toUpperCase();                /* Método utilizado para adicionar 
                                             * todas as letras em maiúsculo. */

        
        System.out.println(a);              /* Imprime a váriavel em que foi 
                                             *   adicionado o método (a) */
        
        System.out.println("Pablo".toUpperCase());  /* Pode utilizar diretamente no print. */
        
       
        String b = "Pablo teste"
                .replace("teste", " - Engenharia de Software")
                .toUpperCase();  
                                                                    /* Pode ser adicionado diversos métodos
                                                                     *  em uma mesma váriavel, podendo simplificar
                                                                     *  a linha de código (quebra de linha). */
                                                                    
                                                                    
        System.out.println(b);                                      /* Testando métodos!. */  
        
        /* Obs: Tipos primitivos não tem o operador "." */ 
    }
}
