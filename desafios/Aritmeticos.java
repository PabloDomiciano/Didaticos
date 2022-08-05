package fundamentos;

public class Aritmeticos {
    public static void main(String[] args) {
        int a = (6*(3+2));           // Resultado é 30.
        int b = (int) Math.pow(a, 2);  // (Math.pow) Faz com que o resultado seja elevado ao quadrado (900).
        int c = b / (3*2);           // Dividindo o resultado de b por 6 e adicionando na variável c (150).
        
        int d = ((1-5) * (2-7)) / 2;    // Segunda parte da formula, resultado é 10.
        int e = (int) Math.pow(d,2);    // Resultado da variavel d elevado ao quadrado e adicionado em e.
        
        int f = c - e;      // Pegando os resultados de cada parte da formula, fazendo a subtração e adicionando em f
        int g = (int) Math.pow(f, 3);   // Elevando todo o resultado ao cubo.
       
        int h = 10;
        int j = (int) Math.pow(h,3);    // Elevando o resultado da variável h ao cubo e adicionando na variável j.
        
        int k = g / j;  // Final da formula.
        
        System.out.println(k);
    }
}
