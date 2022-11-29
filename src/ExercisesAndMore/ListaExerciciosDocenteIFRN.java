    //  1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    //  mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    //  (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

package ExercisesAndMore;
import java.util.Scanner;

public class ListaExerciciosDocenteIFRN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade em anos: ");
        int anos = scan.nextInt();
        System.out.println("Quantos meses: ");
        int meses = scan.nextInt();
        System.out.println("E quantos dias: ");
        int dias = scan.nextInt();

        int anosEmDias = anos * 365;
        int mesesEmDias = meses * 30;

        System.out.println("Você já viveu " + (dias + anosEmDias + mesesEmDias) + " dias");

    }

}
