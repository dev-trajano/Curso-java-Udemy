package lambdaa;

public class Calculotest2 {
    public static void main(String[]args) {
        
        Calculo calculo = (x,y)-> {return x+y;};
        
        System.out.println(calculo.executar(5, 5));

        calculo = (x,y)->x*y;
        System.out.println(calculo.executar(5, 5));
        System.out.println(calculo.legal());

        
    }
    
}
