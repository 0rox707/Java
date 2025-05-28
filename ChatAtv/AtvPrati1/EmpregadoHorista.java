
public class EmpregadoHorista extends Empregado implements Funcionario{
    protected int horasTrabalhadas;
    protected double valorHora;
    
    // ====== gets e sets ======
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    // ====== Contrutor ======
    public EmpregadoHorista(String nm, int matr, double valhor, int horTrab) {
        super(nm, matr);

        
        this.valorHora=valhor;
        this.horasTrabalhadas =horTrab;
        
        if ((getValorHora()*getHorasTrabalhadas())<=0){
            throw new ExceçãoFuncionario();
        }
    }

    // ====== Metodos ======
    @Override
    public String toString(){
        return "funcionario: "+getNome()+" | Matricula: "+getMatricula()+" | Salario: "+calcularSalario();
    }
    @Override
    public double calcularSalario(){
        return (getValorHora()*getHorasTrabalhadas());
    }

}
