package ChatAtv.AtvPrati;

public class CMain {
    public static void main(String[] args) {
        Calculadora cal=  new Calculadora();
        try{
        System.out.println(
            cal.somar(2100000.00,5100.00)+"\n"+
            cal.subitrair(4.3f, 1.2f)+"\n"+
            cal.multiplicar(4.2, 323.0000)+"\n"
            +cal.dividir(3, 0.0f));
        }catch(Exceções e){
            System.out.println(e.getMessage());
        }
    } 
}
