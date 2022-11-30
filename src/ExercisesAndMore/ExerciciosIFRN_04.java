//  4. Escrever um algoritmo que lê:
//  A porcentagem do IPI a ser acrescido no valor das peças
//  O código da peça 1, valor unitário da peça 1, quantidade de peças 1
//  O código da peça 2, valor unitário da peça 2, quantidade de peças 2
//  O algoritmo deve calcular o valor total a ser pago e apresentar
//  o resultado. Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

package ExercisesAndMore;

public class ExerciciosIFRN_04 {
    public static void main(String[] args) {
        double impostoIpi = 1.18;
        int codPeca1 = 56625;
        int codPeca2 = 65534;
        double valorPeca1 = 430.00;
        double valorPeca2 = 94.75;
        int qtdPeca1 = 250;
        int qtdPeca2 = 800;
        double total = ((valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2)) * impostoIpi;

        System.out.println("A peça de código " + codPeca1 + " com pedido de " + qtdPeca1 + " unidades:");
        System.out.println("Custo pedido: " + (valorPeca1 * qtdPeca1));
        System.out.println(" ");
        System.out.println("A peça de código " + codPeca2 + " com pedido de " + qtdPeca2 + " unidades:");
        System.out.println("Custo pedido: " + (valorPeca2 * qtdPeca2));
        System.out.println(" ");
        System.out.println("Custo total com importos: " + total);

    }
}
