import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b:");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Essa nao e uma equacao do segundo grau");
            return;
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("A equacao nao possui raizes reais");
                return;
            } else if (delta == 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("A equacao possui uma unica raiz real: " + x1);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equacao possui duas raizes reais");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}

