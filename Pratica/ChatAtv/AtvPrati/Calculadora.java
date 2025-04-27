package ChatAtv.AtvPrati;

public class Calculadora {
    public int somar(int a ,int b){
        return a+b;
    }
    public double somar(double a,double b){
        return a+b;
    }
    public float somar(float a,float b){
        return a+b;
    }
    public long somar (long a, long b){
        return a+b;
    }
    public int subitrair(int a ,int b){
        return a-b;
    }
    public float subitrair(float a ,float b){
        return a-b;
    }
    public double subitrair(double a ,double b){
        return a-b;
    }
    public long subitrair(long a ,long b){
        return a-b;
    }

    public int multiplicar(int a,int b){
        return a*b;
    }
    public float multiplicar(float a,float b){
        return a*b;
    }
    public double multiplicar(double a,double b){
        return a*b;
    }
    public long multiplicar(long a,long b){
        return a*b;
    }

    public int dividir(int a,int b) /*throws Exceções*/{
        if(b==0){
            throw new Exceções("Tentatica de divição por zero!");
        }

        return a/b;
    }
    public long dividir(long a,long b) /*throws Exceções*/{
        if(b==0){
            throw new Exceções("Tentatica de divição por zero!");
        }

        return a/b;
    }
    public float dividir(float a,float b) /*throws Exceções*/{
        if(b==0){
            throw new Exceções("Tentatica de divição por zero!");
        }

        return a/b;
    }
    public double dividir(double a,double b) /*throws Exceções*/{
        if(b==0){
            throw new Exceções("Tentatica de divição por zero!");
        }

        return a/b;
    }


}
