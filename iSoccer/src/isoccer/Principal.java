
package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcao;
        int op;
        
        AlagoasFC clube = new AlagoasFC();
        
        cabecalho();
        
        loginAdministrador();
        while(true)
        {
           try
           {    
               menu();
                opcao = entrada.nextInt();entrada.nextLine();
                
                if(opcao == 0){
                    break;
                }
                    if(opcao == 1)
                        clube.adicionarFuncionario();
                    if(opcao == 2)
                        clube.adicionarSocioTorcedor();
                    else if(opcao == 3)
                     clube.adicionarOnibus();
                    else if(opcao == 4)
                        clube.adicionarEstadio();
                    else if (opcao == 5)
                        clube.adicionarCentroDeTreinamento();
                    else if(opcao == 6){
                        
                        System.out.println("Informe a subcategoria desejada: ");
                        op = entrada.nextInt();entrada.nextLine();
                        
                        switch (op) {
                            case 1:
                                clube.relatorioDoTime();
                                break;
                            case 2:
                                clube.consultarAptdaoJogador();
                                break;
                            case 3:
                                clube.relatorioServicosGerais();
                                break;
                            default:
                                break;
                        }
                    }
                    else if(opcao == 7)
                            clube.alterarStatusSocioTorcedor();
                    else if(opcao == 8)
                            clube.atualizarValorDaContribuicao();
                    else if (opcao == 9)
                            clube.mostrarRecursosFisicos();
                    else if(opcao == 10)
                    clube.mostrarSociosTorcedores();
                   
           }catch(InputMismatchException E){
               System.out.println("Tipo de entrada inserida incompativel com a esperada!");
               entrada.nextLine();
           }
        }
    }
    public static void menu(){
        
        System.out.println("--------------Menu Principal ---------- \n");
        System.out.println("Informe a opção desejada:\n ");
        System.out.println("1 - Adicionar Funcionario;");
        System.out.println("2 - Adicionar Socio Torcedor;");
        System.out.println("3 - Adicionar/Verificar recurso Onibus;");
        System.out.println("4 - Adicionar/Verificar recurso Estádio;");
        System.out.println("5 - Adicionar/Verifivar recurso Centro de Treinamento;");
        System.out.println("6 - Informações dos Funcionarios;");
        System.out.println("    1 - Relatorio do time;");
        System.out.println("    2 - Consultar Aptidão de Jogador;");
        System.out.println("    3 - Funcionarios do Serviço Gerais;");
        System.out.println("7 - Alterar Status do SocioTorcedor;");
        System.out.println("8 - Atualizar valor de Contribuição do Socio Torcedor;");
        System.out.println("9 - Mostrar Recursos fisicos;");
        System.out.println("10 - Mostrar Resumo dos Socios Torcedores;");
        System.out.println("---------------------------------------\n");
        
    }
    public static void cabecalho(){
        
        System.out.println("BEM VINDO AO \n");
        System.out.println("   - - -     - - -     - -     - -      - - -   - - -");
        System.out.println("-  |        |      |  |    |  |    |   |       |      |");
        System.out.println("|  |        |      |  |       |        |       |      |");
        System.out.println("|   - - -   |      |  |       |        - - -   | - - -");
        System.out.println("|       |   |      |  |       |        |       |  \\");
        System.out.println("|       |   |      |  |    |  |    |   |       |   \\");
        System.out.println("-   - - -     - - -     - -     - -     - - -  |    \\\n\n");
    }
    public static void menuRelatorio(AlagoasFC time){
        
        System.out.println("Informe qual o tipo de Serviço que deseja analizar:\n ");
        System.out.println("1 - Relatorio do Time;");
        System.out.println("2 - Relatorio de Servições Gerais;");
        System.out.println("3 - Relatorio dos Recursos Físicos;");
        System.out.println("4 - Relatorio dos Socios Torcedores;\n ");
        
        int op = 0;
        op = entrada.nextInt();
        
        switch(op){
            case 1:
                time.relatorioDoTime();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
    public static void loginAdministrador(){
        System.out.println("Admnistrador informe o login e a senha abaixo:\n");
        System.out.println("Login: adm");
        System.out.println("senha: adm2019\n");
        
        String dado = null;
        int cont = 0;
        
        do{
            try{
                if(cont == 0){
                    System.out.println("Informe o login do Administrador: ");
                }else{
                    System.out.println("Login Incorreto, informe-o novamente: ");
                }
                dado = entrada.nextLine();
            }catch(InputMismatchException e){
                System.out.println("O Tipo de dado inserido não e compatível com o esperado!");
                entrada.nextLine();
            }
            cont++;
        }while(!dado.equals("adm"));
        
        cont = 0;
        do{
            try{
                if(cont == 0){
                    System.out.println("Informe a senha do Administrador: ");
                }else{
                    System.out.println("Senha Incorreta, informe-a novamente: ");
                }
                dado = entrada.nextLine();
            }catch(InputMismatchException e){
                System.out.println("O Tipo de dado inserido não e compatível com o esperado!");
                entrada.nextLine();
            }
            cont++;
        }while(!dado.equals("adm2019"));
    }
    
}
