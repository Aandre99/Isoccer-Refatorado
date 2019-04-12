package isoccer;

public class Tecnico extends Pessoa{
    
    public Tecnico(){
        super.inicializarFuncionario();
    }

    @Override
    public void imprimirPessoa() {
        super.mostrarPessoa();
    }
}
