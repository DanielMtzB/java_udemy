
public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica calc = new Aritmetica();
        
        System.out.println(calc.sumar(5, 4));
        System.out.println(calc.multiplicar(5, 4));
        System.out.println(calc.dividir(5, 0));
        System.out.println(calc.restar(5, 4));
    }
}
