package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double nota = entrada.nextDouble();

        if (nota >= 6) {
            System.out.print("Aluno Aprovado !! ");

        } else {
            System.out.print("Aluno Reprovado !! ");
        }

        entrada.close();
    }
}
