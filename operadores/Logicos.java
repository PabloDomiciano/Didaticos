package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        System.out.println("TABELA VERDADE (&&): ----- ");  //Tabela E;
        System.out.println("|          " + (true && true) + "           |");
        System.out.println("|          " + (true && false) + "          |");
        System.out.println("|          " + (false && true) + "          |");
        System.out.println("|          " + (false && false) + "          |");        
        System.out.println("---------------------------");
        
        System.out.println();
        
        System.out.println("TABELA VERDADE (||): ----- ");  //Tabela OU;
        System.out.println("|          " + (true || true) + "          |");
        System.out.println("|          " + (true || false) + "          |");
        System.out.println("|          " + (false || true) + "          |");
        System.out.println("|          " + (false || false) + "         |");        
        System.out.println("--------------------------");      
        
        System.out.println();

        System.out.println("TABELA VERDADE (^): ------ ");  //Tabela XOR ou OU exclusivo;
        System.out.println("|          " + (true ^ true) + "         |");
        System.out.println("|          " + (true ^ false) + "          |");
        System.out.println("|          " + (false ^ true) + "          |");
        System.out.println("|          " + (false ^ false) + "         |");        
        System.out.println("--------------------------");
        
        System.out.println();
        
        System.out.println("TABELA VERDADE !(NOT) ----");   // (!) Significa NOT, invertendo os valores booleanos.
        System.out.println("|          " + (!true) + "          |");
        System.out.println("|          " + (!false) + "           |");
        System.out.println("---------------------------");
    }
}
