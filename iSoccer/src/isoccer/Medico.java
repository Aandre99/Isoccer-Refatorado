
package isoccer;

import static isoccer.Principal.entrada;

public class Medico extends Pessoa{
    
    private String crm;

    public Medico(){
        super.inicializarFuncionario();
        this.crm = null;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public void CriarMedico(){
        super.criarPessoa();
        System.out.println("Informe o CRM do médico");
        this.crm = entrada.nextLine();
    }

    @Override
    public void imprimirPessoa() {
       super.mostrarPessoa();
        System.out.println("CRM: " + this.crm);
    }
}
