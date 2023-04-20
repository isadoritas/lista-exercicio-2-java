import java.util.Random;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o primeiro numero inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro:");
        int num2 = scanner.nextInt();

        int maior = 0;
        int menor = 0;

        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else if (num2 > num1) {
            maior = num2;
            menor = num1;
        } else {
            System.out.println("Os numeros sao iguais.");
            System.exit(0);
        }

        int sorteado = random.nextInt((maior - menor) + 1) + menor;

        if (sorteado % 2 == 0) {
            System.out.println("O numero sorteado foi " + sorteado + " e ele e par.");
        } else {
            System.out.println("O numero sorteado foi " + sorteado + " e ele e impar.");
        }
    }
}
