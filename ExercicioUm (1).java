import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero:");
        double numero3 = scanner.nextDouble();

        double maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        } 
        System.out.println("O maior numero e:" + maior);

        double menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }
        System.out.println("O menor numero e:" + menor);

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A media aritmetica dos tres numeros e:" + media);    
    }
}
