package isoccer;

import static isoccer.Principal.entrada;
import java.util.InputMismatchException;

public class SocioTorcedor extends Pessoa{
    
    private double valorDaContribuicao;
    private String estadoDePagamento;
    private String tipo;

    public SocioTorcedor(){
        super.inicializarFuncionario();
        this.estadoDePagamento = "adimplente";
        this.valorDaContribuicao = 0.00;
        this.tipo = null;
    }
    
    /*Getters e Setters */
    
    public double getValorDaContribuicao() {
        return valorDaContribuicao;
    }
    public void setValorDaContribuicao(double valorDaContribuicao) {
        this.valorDaContribuicao = valorDaContribuicao;
    }
    public String getEstadoDePagamento() {
        return estadoDePagamento;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /*Funções de Edicção*/
    
    public void alterarEstadoDePagamento(){
        
        String novoEstado = null;
        System.out.println("Informe para qual estado deseja alterar o status do Socio Torcedor: inadimplente/adimplente");
        novoEstado = entrada.nextLine();
        
        if(novoEstado.equals("inadimplente") && this.estadoDePagamento.equals("inadimplente")){
            System.out.println("O estado informado não difere do atual estado!");
        }else if(novoEstado.equals("adimplente") && this.estadoDePagamento.equals("adimplente")){
            System.out.println("O estado informado não difere do atual estado!");
        }else{
            this.estadoDePagamento = novoEstado;
            System.out.println("Estado de contribuição alterado com secesso!\n");
        }
    }
    public void altualizarValorContribuicao(){
        
        System.out.println("Informe o novo valor da contribuição: ");
        this.valorDaContribuicao = entrada.nextDouble();
        System.out.println("Atualização realizada com sucesso");
    }
    public void CriarTorcedor(){
        super.criarPessoa();
        
        System.out.println("Informe o valor incial da contribuição: ");
        this.valorDaContribuicao = entrada.nextDouble();entrada.nextLine();
        while(true)
        {
            try{
                System.out.println("Informe o tipo de torcedor: ex.: junior, senior, elite;");
                this.tipo = entrada.nextLine();
                break;
            }catch(InputMismatchException E){
                System.out.println("Tipo de dado Incompativel!");
                entrada.nextLine();
            }
        }
    }

    @Override
    public void imprimirPessoa() {
        super.mostrarPessoa();
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Valor da contribuição: " + this.valorDaContribuicao);
        System.out.println("Estado de Pagamento: " + this.estadoDePagamento);
        
    }
}
