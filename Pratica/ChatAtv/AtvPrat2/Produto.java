// package ChatAtv.AtvPrat2;
import java.util.Scanner;
public class Produto {
    protected int codigo;
    protected String nome;
    protected double preço;
    
    // ========= get set =========
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    // ====== Construtor =========
    Produto(int code,String name,double price){
        this.codigo=code;
        this.nome=name;
        this.preço=price;
    }

    protected void infoProduto(){
        System.out.println("| Codigo: "+getCodigo()+" | Nome: "+getNome()+" | Preço: "+getPreço()+" R$ |");
    }
    

    // public static void main(String[] args) {
    //     Scanner dd= new Scanner(System.in);
        
    //     System.out.println("Teste de verificação de preço");
    //     double tetse=validarPreco(dd.nextDouble());

    // }
}
