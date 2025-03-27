
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner dd= new Scanner(System.in);
        Carro carro= new Carro("Azul","A3CR 33AD");

        for(;;){
            carro.ver_painel();
            System.out.println("\n1) Ligar carro.\n2) Acelerar\n3) Frear\n4) Abastecer\n5) deligar\n0) Encerrar");
            int escolha;
            try{
                escolha=dd.nextInt();
            }catch(IllegalArgumentException e){
                System.out.println("Escolha invalida\n-----------\n");
                continue;
            }
            switch (escolha) {
                case 1:
                    carro.ligar();
                    break;
                case 2: 
                    carro.acelerar();
                    break;
                case 3: 
                    carro.frear();
                    break;
                case 4: 
                    System.out.println("Quanto quer abastecer: ");
                    carro.setCombustivel(carro.getCombustivel()+dd.nextFloat());
                case 5:
                    carro.desligar();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }
    }
}
