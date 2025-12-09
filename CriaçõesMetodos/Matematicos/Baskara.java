package CriaçõesMetodos;


public class Baskara {
    private float a,b,c,x1,x2,delta;
    
    public Baskara(float a,float b,float c){
        this.a=a;
        this.b=b;
        this.c=c;
        
        System.out.println(visualizar_f());

        calc_Delta();
        calc_x();
        xConfere(x1,x2);

    }
    // ---------- xConfere --------
    public void xConfere(float z1,float z2){
        if(x1!=0 || x2!=0){
            System.out.println("----------\n"+visualizar_fx(z1)+"== "+((a*(z1*z1))+(b*z1)+c)+"\n"+
            visualizar_fx(z2)+"== "+((a*(z2*z2))+(b*z2)+c));

        }

        // (a*(Math.pow(z,2 ))+(b*z)+c)
    }
    //-------- visualizar_fx ----------
    public String visualizar_fx(float x){
        
        boolean flagA=true;
        String f="\nf("+x+") =  ";
        if(get_A()>0){
            f+= get_A()+""+x+"²";
        }else if(get_A()==0){
            flagA=false;
        }else{
            f+=get_A()+"*"+x+"²";
        }
        if(get_B() > 0 ){
            if(flagA){
                f+="+";
            }
            f+=get_B()+"*"+x;
        }else if(get_B()==0){
        }else{
            f+= get_B()+"*"+x;
        }
        if(get_C()>0){
            if(flagA){
                f+="+";
            }
            f+=get_C();
        }else if(get_C()==0){
        }else{
            f+=get_C();
        }
        return f;
    }
    //------- visualizar_f ----------
    public String visualizar_f(){
        boolean flagA=true;
        String f="\nf(x) =  ";
        if(get_A()>0){
            f+= +get_A()+"x²";
        }else if(get_A()==0){
            flagA=false;
        }else{
            f+=get_A()+"x²";
        }

        if(get_B() > 0 ){
            if(flagA){
                f+="+";
            }
            f+=get_B()+"x";
        }else if(get_B()==0){

        }else{
            f+= get_B()+"x";
        }
        if(get_C()>0){
            if(flagA){
                f+="+";
            }
            f+=get_C();

        }else if(get_C()==0){

        }else{
            f+=get_C();
        }
        return f;
    }
    public void calc_Delta(){
        set_Delta((b*2)-(4*a*c));
        System.out.println("Delta => ("+b+"*2)-(4*"+a+"*"+c+") == "+(getDelta())+ " \n----------------");
        
    }


    public void calc_x(){
        Math m = null;
        
        if(getDelta()>0){ 

            set_X1((float)((get_B()*-1)+m.sqrt(delta))/2*a);
            set_X2((float)((get_B()*-1)-m.sqrt(delta))/2*a);
            System.out.println("\nx¹ => (-"+b+" + Ʋ"+getDelta()+")/2*"+get_A()+"=="+get_X1()+
                  "\nx² => (-"+b+" - Ʋ"+getDelta()+")/2*"+get_A()+"=="+getX2());
        }else if(getDelta() == 0){
            set_X1((float)((get_B()*-1)+m.sqrt(delta))/2*a);
            set_X2((float)((get_B()*-1)-m.sqrt(delta))/2*a);
            System.out.println("\nx¹ => (-"+b+" + Ʋ"+getDelta()+")/2*"+get_A()+"=="+get_X1()+
                  "\nx² => (-"+b+" + Ʋ"+getDelta()+")/2*"+get_A()+"=="+getX2());
            
        }else{
            System.out.println("x não possue rais real!");
        }
        System.out.println("-----------------");
    }
    public float get_A() {
        return a;
    }
    public void set_A(float a) {
        this.a = a;
    }
    public float get_B() {
        return b;
    }
    public void set_B(float b) {
        this.b = b;
    }
    public float get_C() {
        return c;
    }
    public void set_C(float c) {
        this.c = c;
    }
    public float get_X1() {
        return x1;
    }
    public void set_X1(float x1) {
        this.x1 = x1;
    }
    public float getX2() {
        return x2;
    }
    public void set_X2(float x2) {
        this.x2 = x2;
    }
    public float getDelta() {
        return delta;
    }
    public void set_Delta(float delta) {
        this.delta = delta;
    }
    
}
