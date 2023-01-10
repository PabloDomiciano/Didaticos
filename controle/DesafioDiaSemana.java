package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual dia da semana estamos: ");
        String diaSemana = entrada.next();
        entrada.close();

        if (diaSemana.equalsIgnoreCase("Segunda")) {
            System.out.print("2");
        } else if (diaSemana.equalsIgnoreCase("Terça")) {
            System.out.print("3");
        } else if (diaSemana.equalsIgnoreCase("Quarta")) {
            System.out.print("4");
        } else if (diaSemana.equalsIgnoreCase("Quinta")) {
            System.out.print("5");
        } else if (diaSemana.equalsIgnoreCase("Sexta")) {
            System.out.print("6");
        } else if (diaSemana.equalsIgnoreCase("Sabado")) {
            System.out.print("7");
        } else if (diaSemana.equalsIgnoreCase("Domingo")) {
            System.out.print("1");
        }else{
            System.out.print("Dia da semana não encontrado");
    }
    }
}
