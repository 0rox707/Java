public class Carro extends Veiculo{
    final int rodas=4;
    final float max_combustivel=12.0f;
    final int max_velocidade=120;
    private String cor;
    private String placa;
    public Carro(String cor,String placa){
        this.cor=cor;
        this.placa=placa;
    }

    public void ver_painel(){
        System.out.println("\nLigado: "+getligado()+
                            "\nVelocidade: "+getVelocidade()+"km / "+max_velocidade+"km\n"+
                            "Combustivel: "+ getCombustivel()+"L / "+max_combustivel+"L");
    }

    @Override
    public void acelerar(){
        if((getVelocidade())==max_velocidade){
            System.out.println("Ja esta no limite de velocidade.\n--------------");

        }else{
            setVelocidade(getVelocidade()+10);
            setCombustivel(getCombustivel()-0.6f);
        }
    }

    @Override
    public void frear(){
        if(getVelocidade()==0){
            System.out.println("Veiculo ja esta já esta parado.\n--------------");
        }else{
            setVelocidade(getVelocidade()-10);
        }
    }
    
    
}
