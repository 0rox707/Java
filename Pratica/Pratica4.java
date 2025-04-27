
public class Pratica4 {

    public void exceção(){
        System.out.println("tratamento de execeção");

        int a=1,b=0;
        float c;
        try{
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println("Erro capiturado!");
        }
    }
    

}
