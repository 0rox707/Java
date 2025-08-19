public class LimparTerminal {
    public static void main(String[] args) {

        System.out.println("isto e antes de limpar o terminal.");
        try{
            Thread.sleep(60*3);
        }catch(InterruptedException e){
            System.out.println("sla!!!!");
        }
        System.out.print("\033[H");
       //move o cursor pro tompo do terminal 

        System.out.println("\033[2J");
        // limpa a tela

        
        System.out.flush();
        System.out.println("Terminal limpo!");
    }
}