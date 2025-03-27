
class Veiculo{
    private float combustivel=0;
    private int velocidade=0;
    private boolean ligado=false;
    
    

    

    public float getCombustivel(){
        return combustivel;
    }

    public void setCombustivel(float combustivel){
        this.combustivel = combustivel;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public boolean getligado(){
        return this.ligado;
    }

    public void ligar(){
        this.ligado=true;
    }
    public void desligar(){
        this.ligado=false;
    }

    public void acelerar(){
        this.velocidade+=10;
    }
    public void frear(){
        this.velocidade-=10;
    }



}

