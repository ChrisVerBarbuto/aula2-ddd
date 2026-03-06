import java.util.Scanner;

public class exMedia {
    public static void main(String[] args) {
        double media, n1, n2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        n1 = leitor.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = leitor.nextDouble();

        media = (n1 + n2) / 2;
        System.out.println("Esta é a média: " + media);
    }
}