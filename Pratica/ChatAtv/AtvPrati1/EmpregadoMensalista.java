public class EmpregadoMensalista extends Empregado implements Funcionario{

    private double salarioMensal;
    

    // ===== gets e sets =====
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    // ===== Construtor =====
    public EmpregadoMensalista(String nome,int mac,double salar){
        super(nome, mac);
        setSalarioMensal(salar);
        if (getSalarioMensal() <= 0 ) {
            throw new ExceçãoFuncionario();
        }
    }

    // ===== METODOS =====
    @Override
    public String toString() {
        
        return "Funcionario: "+getNome()+" | Matricula: "+getMatricula()+" | Salario: "+calcularSalario();
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioMensal();
    }
}
