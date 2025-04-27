//package ChatAtv.AtvPrat2;
import java.util.HashMap;
import java.util.Scanner;
public class MainPRat {
    public static void main(String[] args) {
        HashMap <Integer,Produto> menu= new HashMap<>();
        Scanner dd= new Scanner(System.in);
        
        boolean flag=true;
        int op;
        
        String opção="1) Adicionar produto\n2) Remover produto\n3) Listar produtos\n4) Buscar produto\n0) Exit\n";
        
        menu.put(232300, new Produto(232300, "Banana",9.98 ));
        menu.put(220012, new Produto(220012, "Yame",11.98 ));
        menu.put(123321, new Produto(123321, "Pão",5.58 ));

        do{
            System.out.print(opção+"Opção: ");
            try{
                op=Integer.parseInt(dd.nextLine());
            }catch(RuntimeException e){
                System.out.println("Numero invalido");
                continue;
            }
            System.out.println("=====================");
            switch (op) {
            case 1:
                System.out.println("Nome do produto: ");
                String nome=dd.nextLine();
                System.out.println("Codigo: ");
                int code=0;
                try{
                    code= dd.nextInt();
                }catch(RuntimeException e){
                    System.out.println("Codigo invalido.");
                    dd.nextLine();
                    continue;
                }
                dd.nextLine();
                System.out.println("Preço: ");
                double preço=dd.nextDouble();
                dd.nextLine();
                menu.put(code, new Produto(code, nome, preço));
                break;
            case 2:
            System.out.println("== Lista de Produto ==");
            for(int i:menu.keySet()){
                menu.get(i).infoProduto();
            }
            System.out.println("Qual produto remover: ");
            menu.remove(dd.nextInt());
            dd.nextLine();
                break;
                
            case 3:
                for(int i:menu.keySet()){
                    menu.get(i).infoProduto();
                }
                break;
            case 4:
                while (true) {
                    System.out.println("Qual produto quer procurar: ");
                    int i=0;
                    try{
                        i=dd.nextInt();
                        dd.nextLine();
                        
                    }catch(RuntimeException e){
                        dd.nextLine();
                        System.out.println("Valor invalido");
                    }
                    if(menu.containsKey(i)){
                        menu.get(i).infoProduto();
                        break;
                    }else{
                        System.out.println("Produto não existe");
                        break;
                    }
                }
                break;
            case 0:
                System.out.println("Encerando...");
                flag=!flag;
                break;
            default:
                System.out.println("Opção invalida");
                break;
            }
            System.out.println("=====================");
        }while(flag);




    }
}
