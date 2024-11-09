import java.util.Scanner;
public class Menu {
    static Scanner dd=new Scanner(System.in);

    public static void menu()throws InterruptedException{
        while (true) {
            
            System.out.print("----------\nOque quer fazer:\n1) Criar comanda \n2) Ver comandas\n3) Excluir item comanda\n4) Excluir comanda \n5) Modificar comanda\n0) encerrar\n_ _ _ _ _ _ _\nOque fazer: ");
                String n=dd.next();
            System.out.println("_ _ _ _ _ _ _");
            switch (n) {
                case "1":
                System.out.println("opção: Criar comanda!");


                Thread.sleep(500);
                break;
                case "2":
                System.out.println("opção: Ver comanda");


                Thread.sleep(500);
                break;
                case "3":
                System.out.println("Opção: Excluir item de comanda");


                Thread.sleep(500);
                break;
                case "4":
                System.out.println("Opção: Excluir comanda");


                Thread.sleep(500);
                break;
                case "5":
                System.out.println("Modificar comanda");


                Thread.sleep(500);
                break;
                case "0":
                System.out.print("Encerando");
                for(int i=0;i<3;i++){
                    System.out.print(".");
                    Thread.sleep(280);
                }
                System.out.println("");
                System.exit(0);
                default:
                System.out.println("opção invalida!!");
                
                
            }
        }
    }
}
