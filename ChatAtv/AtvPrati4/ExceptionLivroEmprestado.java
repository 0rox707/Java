public class ExceptionLivroEmprestado extends RuntimeException{
    ExceptionLivroEmprestado (){
        super("Livro ja esta sendo emprestado.");
    }
}
