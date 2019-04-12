package isoccer;

import static isoccer.Principal.entrada;

public class Jogador extends Pessoa{
    
    private String tipo;
    private boolean jogadorDisponivel;

    public Jogador(){
        super.inicializarFuncionario();
        this.tipo = null;
        this.jogadorDisponivel = true;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean JogadorDisponivel() {
        
        if(this.jogadorDisponivel)
            return true;
        else
            return false;
    }
    public void setJogadorDisponivel(boolean jogadorDisponivel) {
        this.jogadorDisponivel = jogadorDisponivel;
    }
    
    public void CriarJogador(){
        super.criarPessoa();
        System.out.println("Informe o tipo do jogador: ex.: volante, zagueiro...");
        this.tipo = entrada.nextLine();
    }
    @Override
    public void imprimirPessoa() {
        super.mostrarPessoa();
        System.out.println("Tipo: " + this.tipo);
        System.out.print("Status: ");
        if(this.JogadorDisponivel()){
            System.out.println("Disponivel");
        }else{
            System.out.println("Não Disponivel");
        }
        System.out.println("\n");
    }
}
