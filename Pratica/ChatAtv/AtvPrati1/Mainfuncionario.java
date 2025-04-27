public class Mainfuncionario {
    public static void main(String[] args) {
        try{
            
            EmpregadoHorista fcn1 = new  EmpregadoHorista("João",565677,1023.59,8);
            EmpregadoMensalista fme = new EmpregadoMensalista("Lana",6969,5600.89);
            System.out.println("Funcionarios\n--------------");
            System.out.println(fcn1.toString()+"\n"+ fme.toString());
        }catch(ExceçãoFuncionario e){
            System.out.println("Erro "+e.getMessage());
        }
    }

}
