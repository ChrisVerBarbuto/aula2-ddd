import java.util.Scanner;

public class primeiroprograma {
   public static void main(String[] args) {
       //leitura de dados - parte1
       Scanner leitor = new Scanner(System.in);
       int idade, qntFilhos;
       boolean casado;
       String nome;
       System.out.println("Digite seu nome: ");
       nome = leitor.nextLine();
       System.out.println("Digite sua idade: ");
       idade = leitor.nextInt();
       System.out.println("Bem vindo(a) " + nome);
    }
}
