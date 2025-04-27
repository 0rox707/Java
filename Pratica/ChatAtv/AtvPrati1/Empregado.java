abstract class Empregado implements Funcionario{
    private String nome;
    private int matricula;
    // ======== gets e sets =======
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public abstract double calcularSalario();
    // ========= construtor ==========
    public Empregado(String nm, int matr){
        this.nome=nm;
        this.matricula=matr;
    }
}
