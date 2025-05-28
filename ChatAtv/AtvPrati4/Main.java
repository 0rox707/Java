import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    private HashMap<Integer , Livro> coleção = new HashMap<>();
    static Scanner dd;
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu(){
        dd= new Scanner(System.in);
        String men = "1) Cadastrar novo livro.\n2) Excluir livro cadastrado.\n3) Emprestar livro (informando código).\n4) Devolver livro (informando código).\n5) Listar todos os livros.\n6) Listar apenas os livros disponíveis.\n7) Buscar  livro por código.\n0) Sair do sistema.";
        Main m= new Main();
        
        while (true) {
            
            System.out.println(men); 
            
            try{
                System.out.print("Opção: ");
                int escolha = dd.nextInt();
                    dd.nextLine();
                switch (escolha) {
                    case 1:
                        m.opção1();
                        break;
                    case 2:
                        if(!m.coleção.isEmpty()){
                            m.opção2();
                        }else{
                            System.out.println("Coleção vazia.");
                        }
                        break;
                    case 3:
                        if(!m.coleção.isEmpty()){
                            m.opção3();
                        }else{
                            System.out.println("Coleção vazia.");
                        }
                        break;
                    case 4:
                        if(!m.coleção.isEmpty()){
                            m.opção4();
                        }else{
                            System.out.println("Coleção vazia.");
                        }
                        break;
                    case 5:
                        if(!m.coleção.isEmpty()){
                            m.opção5();
                        }else{
                            System.out.println("Coleção vazia.");
                        }
                        break;
                    case 6:
                        if(!m.coleção.isEmpty()){
                            m.opção6();
                        }else{
                            System.out.println("Coleção vazia.");
                        }
                        break;
                    case 7:
                        if(!m.coleção.isEmpty()){
                            m.opção7();
                        }else{
                            System.out.println("Coleção vazia.");
                        }
                        break;
                    case 0:
                        System.out.println("Fechando programa");
                        System.exit(0);
                        break;
                    default: 
                    System.out.println("Opção invalida");
                        
                    }
                    
                    
                }catch(InputMismatchException e){
                System.out.println("Erro, imput invalido;");
                System.exit(0);
            }
            
        }
    }
    private void opção7(){
        
        System.out.print("==================\nId: ");
        int id= dd.nextInt();
        dd.nextLine();
        if(coleção.containsKey(id)){
            System.out.println(coleção.get(id).toString());
        }else{
            System.out.printf("Não existe nem um livro com o id %d \n",id) ;
        }
        
        System.out.println("==================");
    
    }
    private void opção6(){
        System.out.println("==================");
                    
        for(int i:coleção.keySet()){
            if(!(coleção.get(i).isAlugado())){
                System.out.println(coleção.get(i).toString());
            }
        }
        System.out.println("==================");
        
    }
    private void opção5(){
        System.out.println("==================");
        for(int i:coleção.keySet()){
            System.out.println(coleção.get(i).toString());
            System.out.println("==================");
        }
        
    }
    private void opção4(){
        System.out.println("==================\nId do livro: ");
        int id= dd.nextInt();
        dd.nextLine();
        if(coleção.containsKey(id)){
            try{
                coleção.get(id).devolução();
            }catch(ExceptionLivroDevolvido e){
                System.out.println(e.getMessage());
            }
        }
        
    }    
    private void opção3(){
        
        
        System.out.println("Qual livro quer emprestar: ");
        try{
            coleção.get(dd.nextInt()).emprestar();
        }catch(ExceptionLivroEmprestado e ){
            System.out.println(e.getMessage());
        }
    
    }
    private void opção2(){
        System.out.println("Id do livro para excluir cadastro: ");
        int exId=dd.nextInt();
        dd.nextLine();
        if (coleção.containsKey(exId)) {
            coleção.remove(exId);
        }else{
            System.out.printf("não existe %d nos cadastros\n",exId);
        }

    }
    private void opção1(){
        
        String nomeLivro,nomeAutor;
        int livroCodigo=0;
        
        
        System.out.print("Nome do livro: ");
        nomeLivro= dd.nextLine();
        System.out.print("Nome do autor: ");
        nomeAutor= dd.nextLine();
        System.out.print("Id: ");
        livroCodigo=dd.nextInt();
            dd.nextLine();
        coleção.put(livroCodigo,new Livro(nomeLivro, nomeAutor, livroCodigo) );
        System.out.println("==================");
        
    }
    

    private static boolean coleçãoExiste(){
        Main m= new Main();
       
        
        if (!m.coleção.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}
