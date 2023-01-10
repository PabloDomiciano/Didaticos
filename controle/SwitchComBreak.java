package controle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.println("Digite a sua nota para ver o conceito: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 1:
                conceito = "F";
                break;
            case 2:
                conceito = "F";
                break;
            case 3:
                conceito = "F";
                break;
            case 4:
                conceito = "F";
                break;
            case 5:
                conceito = "C";
                break;
            case 6:
                conceito = "C";
                break;
            case 7:
                conceito = "C";
                break;
            case 8:
                conceito = "B";
                break;
            case 9:
                conceito = "B";
                break;
            case 10:
                conceito = "A";
                break;
            default:
                conceito = "Valor não valido!";
        }
        System.out.println("Conceito é : " + conceito);
        entrada.close();
    }
}
