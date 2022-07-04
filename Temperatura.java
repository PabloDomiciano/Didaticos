
package fundamentos;

public class Temperatura {
    
    public static void main(String[] args) {
        double fah = 86;                    // Variavel definida pelo (tipo + nome = valor atribuído).
        double graus;                       
        final double CONSTANTE1 = 32;       // Uma constante não pode ser alterada (final). 
        final double CONSTANTE2 = 5.0/9.0;
        
        graus = (fah - CONSTANTE1) * CONSTANTE2;  
        
        System.out.println("O resultado e " + graus + " graus celsius.");
    }
}
