//  2. Fazer um programa que imprima a média aritmética dos números
//  8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias.
//  A média das médias.

package ExercisesAndMore;

public class ExerciciosIFRN_02 {
    public static void main(String[] args) {
        int mediaAlta = (7+8+9)/3;
        int mediaBaixa = (4+5+6)/3;

        System.out.println("A média entre os números 7, 8 e 9 é " + mediaAlta);
        System.out.println("A média entre os números 4, 5 e 6 é " + mediaBaixa);
        System.out.println("A soma dessas médias é " + (mediaAlta+mediaBaixa));
    }

}
