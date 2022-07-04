
package fundamentos;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        // Informações de um funcionário.
        
        
        // Tipos numéricos inteiros.
        byte anosEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_847_223L;    /* A letra L indica que está sendo
                                                    *  usado a forma literal e 
                                                    * associa ao tipo primitivo Long. */
        
        // Tipos  numéricos reais.
        float salario = 11_445.44F;         /* A letra F indica que está sendo 
                                             *  usado a forma literal e
                                             * associa ao tipo primitivo Float. */
        
        double vendasAcumuladas = 2_991_797_103.01;
        
        // Tipo booleano.
        boolean estaDeFerias = true;   // false ou true!
        
        //  Tipo caractere.
        char status = 'A';  // Representação de Ativo (Caractere único).
        
        // Dias de Empresa.
        System.out.println(anosEmpresa * 365);
        
        // Numero de Viagens.
        System.out.println(numeroDeVoos / 2);
        
        // Pontos por Real. 
        System.out.println(pontosAcumulados / vendasAcumuladas);
        
        System.out.println(id + ": ganha -> " + salario);
        
        System.out.println("Ferias ? - " + estaDeFerias);
        
        System.out.println("Status : " + status);
    }
}
