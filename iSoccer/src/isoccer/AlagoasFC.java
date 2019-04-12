package isoccer;

import static isoccer.Principal.entrada;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class AlagoasFC {
    
    private ArrayList<Pessoa> funcionarios;
    private ArrayList<Pessoa> socioTorcedores;
    private ArrayList<Onibus> transporte;
    private Estadio estadio;
    private Tecnico tecnico;
    private CentroTreinamento ct;
    
    public AlagoasFC(){
        this.ct = null;
        this.estadio = null;
        this.tecnico = null;
        this.funcionarios = new ArrayList<>();
        this.socioTorcedores = new ArrayList<>();
        this.transporte = new ArrayList<>();
    }
    public void adicionarFuncionario(){
        System.out.println("Informe o tipo do Funcionario que deseja cadastrar: ");
        System.out.println("\nOpções:\n ");
        System.out.println("1 - Presidente;");
        System.out.println("2 - Médico;");
        System.out.println("3 - Técnico;");
        System.out.println("4 - Preparador Físico;");
        System.out.println("5 - Motorista;");
        System.out.println("6 - Cozinheiro;");
        System.out.println("7 - Advogado;");
        System.out.println("8 - Jogador;\n");

        int opcao = 0;
        opcao = entrada.nextInt();entrada.nextLine();
        
        switch(opcao){
            case 1:
                Presidente p = new Presidente();
                p.criarPessoa();
                this.funcionarios.add(p);
                break;
            case 2:
                Medico md = new Medico();
                md.CriarMedico();
                this.funcionarios.add(md);
                break;
            case 3:
                Tecnico t = new Tecnico();
                t.criarPessoa();
                this.funcionarios.add(t);
                this.tecnico = t;
                break;
            case 4:
                PreparadorFisico pf = new PreparadorFisico();
                pf.criarPessoa();
                this.funcionarios.add(pf);
                break;
            case 5:
                Motorista mt = new Motorista();
                mt.CriarMotorista();
                this.funcionarios.add(mt);
                break;
            case 6:
                Cozinheiro cz = new Cozinheiro();
                cz.criarPessoa();
                this.funcionarios.add(cz);
                break;
            case 7:
                Advogado ad = new Advogado();
                ad.criarPessoa();
                this.funcionarios.add(ad);
                break;
            case 8:
                Jogador j = new Jogador();
                j.CriarJogador();
                this.funcionarios.add(j);
                break;
        }
        System.out.println("\n-> Funcionario Adicionado com sucesso.\n");
        
    }
    public void adicionarOnibus(){
        
        int op = 0;
        
        System.out.println("Informe o que deseja fazer:\n");
        System.out.println("1 - Adicionar Onibus;");
        System.out.println("2 - Verificar recurso Onibus;\n");
        
        op = entrada.nextInt();entrada.nextLine();
        
        if(op == 1){
            
            if(this.transporte.size() == 0){
                Onibus novo = new Onibus();
                novo.CriarOnibus();
                this.transporte.add(novo);
                System.out.println("Onibus Adicionado com sucesso!");
            }else{
                System.out.println("Recurso ja existente!");
            }
        }else{
            
            if(this.transporte.size() > 0){
                System.out.println("Recurso Disponível!");
            }else{
                System.out.println("Recurso Indispinivel!");
            }
        }
    }
    public void adicionarEstadio(){
        
        int op = 0;
        
        System.out.println("Informe o que deseja fazer:\n");
        System.out.println("1 - Adicionar Estaio;");
        System.out.println("2 - Verificar recurso Estadio;\n");
        
        op = entrada.nextInt();entrada.nextLine();
        
        if(op == 1){
            
            if(this.estadio == null){
                this.estadio = new Estadio();
                this.estadio.CriarEstadio();
            }else{
                System.out.println("Recurso ja existente!");
            }
            System.out.println("Estadio Adicionado com sucesso!");
        }else{
            
            if(this.estadio != null){
                System.out.println("Recurso Disponível!");
            }else{
                System.out.println("Recurso Indispinivel!");
            }
        }
    }
    public void adicionarSocioTorcedor(){
        
        SocioTorcedor novoSocio = new SocioTorcedor();
        novoSocio.CriarTorcedor();
        this.socioTorcedores.add(novoSocio);
    }
    public void adicionarCentroDeTreinamento(){
        
        int op = 0;
        
        System.out.println("Informe o que deseja fazer:\n");
        System.out.println("1 - Adicionar CT;");
        System.out.println("2 - Verificar recurso CT;");
        System.out.println("3 - Verificar Quantidade de Dormitorios;\n");
        
        op = entrada.nextInt();entrada.nextLine();
        
        if(op == 1){
            if(this.ct == null){    
                this.ct = new CentroTreinamento();
                this.ct.criarCentroTreinamento();
            }else{
                System.out.println("Recurso ja existe!");
            }
        }else if(op == 2){
            
            if(this.ct != null){
                System.out.println("Centro de Treinamento Disponível!");
            }else{
                System.out.println("Centro de Treinamento Indispinivel!");
            }
        }else{
            if(this.ct != null){
                System.out.println(" A quantidade de dormitorios e': " + this.ct.getQuantidadeDormitorios());
            }else{
                System.out.println("O recuroso não estada disponivel");
            }
        }
    }
    
    public void relatorioDoTime(){
        
        if(this.funcionarios.size() > 0){
            
            System.out.println("Relatorio do Time:\n");
            
            if(this.tecnico != null){
             System.out.println("Tecnico:");
             this.tecnico.mostrarPessoa();  
            }
            Iterator I = new Lista_Iterator(this.funcionarios);

            while(I.hasNext()){

                Pessoa p = (Pessoa) I.next();
                if(p instanceof Jogador){
                    System.out.println("Jogador:\n");
                    p.imprimirPessoa();
                 }
              }
            }else{
            
            System.out.println("Não ha jogadores/Tecnico cadastrados! ");
            }
        }
    public void relatorioServicosGerais(){
        
        Iterator I = new Lista_Iterator(this.funcionarios);
        
        System.out.println("Relatorois Serviço  Gerais: ");
        System.out.println("Lista de Médicos:\n ");
        
         while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof Medico)   
                p.imprimirPessoa();
          }
         
        System.out.println("\nLista de Motoristas:\n ");
        while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof Motorista){
                p.imprimirPessoa();
            } 
          }
        System.out.println("\nLista de Preparadores Fisicos:\n ");
        while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof PreparadorFisico){
                p.imprimirPessoa();
            } 
          }
        System.out.println("\nLista de Cozinheiros:\n ");
        while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof Cozinheiro){
                p.imprimirPessoa();
            } 
          }
        System.out.println("Listas de Advogados:\n ");
        while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof Advogado){
                p.imprimirPessoa();
            } 
          }
    }
    public void consultarAptdaoJogador(){
        
        String nome = null;
        System.out.println("Informe o nome do jogador que deseja analizar: ");
        nome = entrada.nextLine();
        
        Iterator I = new Lista_Iterator(this.funcionarios);
        
         while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof Jogador && p.getNome().equals(nome))   
                 System.out.println("Estado de Aptidão:"+ ((Jogador)p).JogadorDisponivel());
          }
    }
    public void alterarStatusSocioTorcedor(){
        
        String nome = null;
        System.out.println("Informe o nome do Socio torcedo a ser buscado: ");
        nome = entrada.nextLine();
        
        Iterator I = new Lista_Iterator(this.socioTorcedores);
        
         while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof SocioTorcedor && p.getNome().equals(nome))   
                 ((SocioTorcedor)p).alterarEstadoDePagamento();
          }
    }
    public void atualizarValorDaContribuicao(){
        
        String nome = null;
        System.out.println("Informe o nome do Socio Torcedo a ser buscado: ");
        nome = entrada.nextLine();
        
        Iterator I = new Lista_Iterator(this.socioTorcedores);
        
         while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
            if(p instanceof SocioTorcedor && p.getNome().equals(nome))   
                 ((SocioTorcedor)p).altualizarValorContribuicao();
          }
    }
    public void mostrar(){
        Iterator I = new Lista_Iterator(this.funcionarios);
        
            while(I.hasNext()){
            Pessoa p = (Pessoa) I.next();
               p.imprimirPessoa();
                System.out.println("\n");
          }
    }
    public void mostrarRecursosFisicos(){
        
        System.out.println("Transporte: ");
        
        Iterator I = new Lista_Iterator(this.transporte);
        
        while(I.hasNext()){
            
           Onibus O = (Onibus)I.next();
           O.MostrarOnibus();
        }
        System.out.println("\n");
        System.out.println("Centro de Treinamento");
        if(this.ct != null){
            this.ct.mostrarCT();
            System.out.println("Status: Recurso Disponivel");
        }else{
            System.out.println("Recurso Indisponivel");
        }
        System.out.println("\nEstadio");
        if(this.estadio != null){
            this.estadio.mostratEstadio();
            System.out.println("Status: Recurso Disponivel");
        }else{
            System.out.println("Recurso Indisponivel");
        }
    }
    public void mostrarSociosTorcedores(){
        
        System.out.println("Quantidade de socio torcedores: " + this.socioTorcedores.size());
        System.out.print("Quantidade Adimplente: ");
        int cont = 0;
        Iterator I = new Lista_Iterator(this.socioTorcedores);
        
        while(I.hasNext()){
            
           SocioTorcedor ST = (SocioTorcedor)I.next();
           if(ST.getEstadoDePagamento().equals("adimplente")){
               cont++;
           }
        }
        System.out.println(cont);
        cont = 0;
        System.out.println("Quantidade Inadimplente: ");
        while(I.hasNext()){
            
           SocioTorcedor ST = (SocioTorcedor)I.next();
           if(ST.getEstadoDePagamento().equals("adimplente")){
               cont++;
           }
        }
        System.out.println(cont);
        System.out.println("Dados Individuais: ");
        while(I.hasNext()){
            
           SocioTorcedor ST = (SocioTorcedor)I.next();
           ST.imprimirPessoa();
        }
        System.out.println(cont);
    }
}
