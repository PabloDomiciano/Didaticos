package fundamentos.desafios;

public class DesafioLogico {
    public static void main(String[] args) {
        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;
        boolean sorvete = false;
        
        if(trabalhoTerca ^ trabalhoQuinta){
            System.out.println("Comprando TV 32 Polegadas...");
            if(!sorvete){
                System.out.println("Nao tomou o sorvete, saude aumentada...");
            }
            else if(sorvete){
                System.out.println("Tomando sorvete...");
            }
        }
        else if(trabalhoTerca && trabalhoQuinta){
            System.out.println("Comprando TV 50 Polegadas...");
            if(!sorvete){
                System.out.println("Nao tomou o sorvete, saude aumentada...");
            }
            else if(sorvete){
                System.out.println("Tomando sorvete...");
            }
        }
        else{
            System.out.println("Sem tv"
                    + " e sem sorvete pra familia hoje");

        }
    }
}
