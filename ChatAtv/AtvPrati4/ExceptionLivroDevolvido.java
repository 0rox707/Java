public class ExceptionLivroDevolvido extends RuntimeException{
    ExceptionLivroDevolvido(){
        super("Devolução invalida, livro ja foi devolvido");
    }
}
