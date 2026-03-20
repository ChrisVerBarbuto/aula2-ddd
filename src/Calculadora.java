import java.util.SortedMap;

public class Calculadora {
    double numero1;
    double numero2;
    double resultado;
    public void exibirResultado(){
        System.out.println("Resultado = " + resultado);
    }
    public void somar(){
        resultado = numero1 + numero2;
    }
    //Metodo com retorno
    public double subtrair(){
        return numero1 - numero2;
    }
    //Metodo com parametro
    public  String exibir(double valor,String operacao){
        return operacao + " = " + valor;
    }
    //metodo com retorno
    public double multiplicacao(){
        return numero1 * numero2;
    }
    //metodo com parametro

}
