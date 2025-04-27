

abstract class Pratica1 {
    static int a=0;


    public static int getA() {
        return a;
    }
    abstract void abstrato(); 
    public static void setA(int a) {
        Pratica1.a = a;
    }
    public void testMetodo(){
        System.out.println("Testando metodo na super class");
    }
    public Pratica1(){
        this.a++;
    }
    
}


