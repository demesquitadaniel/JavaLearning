// 6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

package ExercisesAndMore;

import java.util.Scanner;

public class ExerciciosIFRN_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        System.out.println("Vc digitou " + numero);
        System.out.println("Seu antecessor é " + (numero - 1));
        System.out.println("Seu sucessor é " + (numero + 1));
    }
}
