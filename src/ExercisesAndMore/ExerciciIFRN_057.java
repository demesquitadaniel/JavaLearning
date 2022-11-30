//  5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//  calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM = R$ 788,00)

package ExercisesAndMore;

import java.util.Scanner;

public class ExerciciIFRN_057 {
    public static void main(String[] args) {
        double salarioMin = 788.00;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário base: ");
        double salario = scan.nextDouble();
        double divisao = salario / salarioMin;
        System.out.println("Você recebe " + divisao + " salários mínimos");
    }
}
