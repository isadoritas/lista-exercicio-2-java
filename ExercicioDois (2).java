import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoSalgadinho = 4.00;
        double precoDoce = 3.00;
        double precoSuco = 1.00;
        double precoRefrigerante = 2.00;

        System.out.println("1 - Salgadinho");
        System.out.println("2 - Doce");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");

        double valorCompra = 0.0;
        System.out.print("Digite o número do produto:");
        int produto = scanner.nextInt();

        while (produto != 0) {
            switch (produto) {
                case 1:
                    valorCompra += precoSalgadinho;
                    break;
                case 2:
                    valorCompra += precoDoce;
                    break;
                case 3:
                    valorCompra += precoSuco;
                    break;
                case 4:
                    valorCompra += precoRefrigerante;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Digite o número do próximo produto (ou 0 para finalizar):");
            produto = scanner.nextInt();
        }
        System.out.println("Valor total da compra: R$" + valorCompra);
        System.out.println("Valor pago:");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra");
            return;
        }
        else {
            double valorTroco = valorPago - valorCompra;
            int numeroDeNotas = 0;
            int notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;

            while (valorTroco > 0) {
                if (valorTroco >= 50) {
                    valorTroco -= 50;
                    notas50++;
                }
                else if (valorTroco >= 20) {
                    valorTroco -= 20;
                    notas20++;
                }
                else if (valorTroco >= 10) {
                    valorTroco -= 10;
                    notas10++;
                }
                else if (valorTroco >= 5) {
                    valorTroco -= 5;
                    notas5++;
                }
                else if (valorTroco >= 2) {
                    valorTroco -= 2;
                    notas2++;
                }
                else if (valorTroco >= 1) {
                    valorTroco -= 1;
                    notas1++;
                }
            }
            
            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }
    }
}




