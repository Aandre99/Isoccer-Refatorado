package isoccer;

import static isoccer.Principal.entrada;

public class Motorista extends Pessoa{
    
    private int numeroCNH;
    
    public Motorista(){
        super.inicializarFuncionario();
        this.numeroCNH = 0;
    }
    public long getNumeroCNH() {
        return numeroCNH;
    }
    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
    public void CriarMotorista(){
        super.criarPessoa();
        System.out.println("Informe o numero da CNH do novo motorista: ");
        this.numeroCNH = entrada.nextInt();
    }

    @Override
    public void imprimirPessoa() {
         super.mostrarPessoa();
        System.out.println("numero da CNH: " + this.numeroCNH);
    }
}
