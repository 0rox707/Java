import java.util.HashMap;
import java.util.Scanner;
public class Pratica5 {
    static Scanner dd;
    public static void main(String[] args) {
        dd = new Scanner(System.in);
        HashMap<String,Integer> idadepessoa = new HashMap<>();
        
        for(;;){
            try{
                System.out.println("Quer adicionar Pessoa e idade? s/n");
                String opc= dd.next();
                if(opc.equalsIgnoreCase("S")){
                System.out.println("Adicione um nome e uma idade: ");
                String nome = dd.next();
                dd.nextLine();
                int idade=dd.nextInt();
                idadepessoa.put(nome, idade);
                }else if(opc.equalsIgnoreCase("N")){
                    break;
                }else{
                    System.out.println("Opção invalida!");
                }
            }catch(RuntimeException e){
                System.out.println("Imput errado!");
            }    
        }
        for (String i:  idadepessoa.keySet()){
            System.out.println("Nomes: "+i+" | idade: "+idadepessoa.get(i));
        }
    }
}
