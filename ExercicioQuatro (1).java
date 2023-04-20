import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o capital aplicado:");
        double capital = entrada.nextDouble();

        System.out.print("Informe o prazo de aplicação:");
        double prazo = entrada.nextDouble();

        System.out.print("Informe a taxa de juros mensal:");
        double taxa = entrada.nextDouble();

        double montante = capital * Math.pow(1 + taxa, prazo);

        System.out.println("O montante a ser recebido é: " + montante);

        entrada.close();

    }
}
