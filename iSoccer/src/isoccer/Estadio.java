package isoccer;

import static isoccer.Principal.entrada;

public class Estadio {
    
    private int numeroTorcedores;
    private int quantidadeLanchonetes;
    private int quantidadeBanheiros;
    private String nome;

    public int getNumeroTorcedores() {
        return numeroTorcedores;
    }
    public void setNumeroTorcedores(int numeroTorcedores) {
        this.numeroTorcedores = numeroTorcedores;
    }
    public int getQuantidadeLanchinetes() {
        return quantidadeLanchonetes;
    }
    public void setQuantidadeLanchinetes(int quantidadeLanchinetes) {
        this.quantidadeLanchonetes = quantidadeLanchinetes;
    }
     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeBanheiros() {
        return quantidadeBanheiros;
    }
    public void setQuantidadeBanheiros(int quantidadeBanheiros) {
        this.quantidadeBanheiros = quantidadeBanheiros;
    }
    
    public void CriarEstadio(){
        System.out.println("Informe o nome do Estadio: ");
        this.nome = entrada.nextLine();
        System.out.println("Informe a capacidade incial de Torcedores: ");
        this.numeroTorcedores = entrada.nextInt();
        System.out.println("Informe a quantidade incial de Banheiros: ");
        this.quantidadeBanheiros = entrada.nextInt();
        System.out.println("Informa quantidade incial de Lanchonetes: ");
        this.quantidadeLanchonetes = entrada.nextInt();
    }
    public void mostratEstadio(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Capacidade: " + this.numeroTorcedores);
        System.out.println("Quantidade de Lanchonetes: " + this.quantidadeLanchonetes);
        System.out.println("Quantidade de Banheiros: " + this.quantidadeBanheiros);
    }
}
