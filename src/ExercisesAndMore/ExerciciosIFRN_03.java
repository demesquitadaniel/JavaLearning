// Informar um saldo e imprimir o saldo com reajuste de 1%.

package ExercisesAndMore;

public class ExerciciosIFRN_03 {
    public static void main(String[] args) {
        double saldo = 1234.56;
        System.out.println("Seu saldo é de " + saldo);
        double juros = saldo * 0.01;
        System.out.println("Os juros são de "+ juros);
        System.out.println("O seu saldo corrigido é " + (saldo + juros));
    }
}
