package isoccer;

public class Advogado extends Pessoa{
    
    public Advogado(){
        super.inicializarFuncionario();
    }

    @Override
    public void imprimirPessoa() {
        super.mostrarPessoa();
    }
}
