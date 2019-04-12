package isoccer;

import static isoccer.Principal.entrada;

public class CentroTreinamento {
    
    private int quantidadeDormitorios;
    private String nomeDoCt;
    
    public int getQuantidadeDormitorios() {
        return quantidadeDormitorios;
    }
    public void setQuantidadeDormitorios(int quantidadeDormitorios) {
        this.quantidadeDormitorios = quantidadeDormitorios;
    }
     public String getNomeDoCt() {
        return nomeDoCt;
    }
    public void setNomeDoCt(String nomeDoCt) {
        this.nomeDoCt = nomeDoCt;
    }
    
    public void criarCentroTreinamento(){
        System.out.println("Informe o nome do Centro de Treinamento: ");
        this.nomeDoCt = entrada.nextLine();
        System.out.println("Informe a quantidade de dormitórios: ");
        this.quantidadeDormitorios = entrada.nextInt();
    }
    public void mostrarCT(){
        System.out.println("Nome: " + this.nomeDoCt);
        System.out.println("Quantidade de Dormitorios: " + this.quantidadeDormitorios);
        
    }
}
