import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Calculadora");

        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o primeiro número: ");

        calculadora.numero1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");

        calculadora.numero2 = leitor.nextDouble();
        calculadora.somar();
        calculadora.exibirResultado();

        System.out.println("Subtração = " + calculadora.subtrair());
        //double sub = calculadora.subtrair();
        //System.out.println(sub);
        //System.out.println(calculadora.exibir(sub,"Subtração"));

        System.out.println("Multiplicação = " + calculadora.multiplicacao());
        double mult = calculadora.multiplicacao();


    }
}
