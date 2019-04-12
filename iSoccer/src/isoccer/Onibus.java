
package isoccer;

import static isoccer.Principal.entrada;

public class Onibus {
    
    private String marcaDoOnibus;
    private String placa;
    private int quantidadeDeAssentos;
    private String itinerario;

    public String getMarcaDoOnibus() {
        return marcaDoOnibus;
    }
    public void setMarcaDoOnibus(String marcaDoOnibus) {
        this.marcaDoOnibus = marcaDoOnibus;
    }
    public int getQuantidadeDeAssentos() {
        return quantidadeDeAssentos;
    }
    public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
        this.quantidadeDeAssentos = quantidadeDeAssentos;
    }
    public String getItinerario() {
        return itinerario;
    }
    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void CriarOnibus(){
        
        System.out.println("Informe a marca do Onibus: ");
        this.marcaDoOnibus = entrada.nextLine();
        System.out.println("Informe a placa do Onibus: ");
        this.placa = entrada.nextLine();
        System.out.println("Informe a quantidade de assentos: ");
        this.quantidadeDeAssentos = entrada.nextInt();entrada.nextLine();
        System.out.println("Informa o itinerario do onibus: ");
        this.itinerario = entrada.nextLine();
    }
    public void MostrarOnibus(){
        System.out.println("Marca: " + this.marcaDoOnibus);
        System.out.println("Placa:" + this.placa);
        System.out.println("Itinerario: " + this.itinerario);
        System.out.println("Quntidade de Assentos:" + this.quantidadeDeAssentos);
        
    }
}
