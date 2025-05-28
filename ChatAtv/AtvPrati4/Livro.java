public class Livro {
    
    private String altor,titulo;
    private int codigo;
    private boolean alugado=false;


    //========= get e set =========

    
    public boolean isAlugado() {
        return alugado;
    }
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    public String getAltor() {
        return altor;
    }
    public void setAltor(String altor) {
        this.altor = altor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    // ========= Construtor =========
    
    public Livro(String titulo, String altor, int codigo) {
        this.altor = altor;
        this.titulo = titulo;
        this.codigo = codigo;
    }
    

    //  ========= metodos =========


    public void emprestar(){
        if (isAlugado()) {
            throw new ExceptionLivroEmprestado();
        }
        System.out.printf("Colocando %s para alugar\n",getTitulo());
        setAlugado(true);
    }

    public void devolução(){
        if(!isAlugado()){
            throw new ExceptionLivroDevolvido();
        }
        System.out.printf("Devolução de %s efetuada\n",getTitulo());
        setAlugado(false);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "|  Livro: "+getTitulo()+" | Autor: "+getAltor()+" | Codigo: "+getCodigo()+" | Alugado: "+(isAlugado()?"Sim":"Não");
    }
    
    
}