
package isoccer;

import static isoccer.Principal.entrada;

public abstract class Pessoa {
    
    private String nome;
    private String email;
    private String cpf;
    private double salario;
    private String telefone;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmil() {
        return email;
    }
    public void setEmil(String emil) {
        this.email = emil;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void inicializarFuncionario(){
        this.cpf = null;
        this.email = null;
        this.nome = null;
        this.salario = 0.00;
        this.telefone = null;
    }   
    public void criarPessoa(){

        System.out.println("Informe o que se pede: ");
        System.out.println("Nome: ");
        this.nome = entrada.nextLine();
        System.out.println("E-mail: ");
        this.email = entrada.nextLine();
        System.out.println("CPF: ");
        this.cpf = entrada.nextLine();
        System.out.println("Salário: ");
        this.salario = entrada.nextDouble();entrada.nextLine();
        System.out.println("Telefone: ");
        this.telefone = entrada.nextLine();
    }
    public void mostrarPessoa(){
        
        System.out.println("\nNome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Salário: " + this.salario + " reais\n");
    }
    public abstract void imprimirPessoa();
}
