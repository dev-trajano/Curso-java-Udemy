package lambdaa;

public class CalculoTeste {
    
    public static void main(String[]args) {

        Calculo calculo = new Somar();
        
        System.out.println(calculo.executar(5, 5));
        
        calculo = new Multiplicar();
        System.out.println(calculo.executar(5, 5));
        
    }
}
