
import java.util.Scanner;

public class SisHelpDesk {
    
    public static void main(String[] args) {
        
        SistemaHelpDesk sisIfam = new SistemaHelpDesk();
        Scanner leOpcao = new Scanner(System.in);
       
        int opcao;
        
        
        do{
            System.out.printf("\t\t%s ","Bem vindo ao sistema Help Desk\n\n");
            System.out.print("Digite o tipo de chamado:\n");
            System.out.println("[1]-Chamado para Area de Suporte e Manutenção");
            System.out.println("[2]-Chamado para Area de Sistemas");
            System.out.println("[3]-Chamado para Area de Infra estrutura de Redesl\n");
            System.out.print("Digite uma opção para continuar:");
            opcao = leOpcao.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.printf("\t\t%s ","Bem vindo ao atendimento de Suporte e Manutenção\n");
                    System.out.println("[1]-Criar chamado");
                    System.out.println("[2]-Listar chamado");
                    System.out.println("[3]-Alterar dados de chamado");
                    System.out.println("[4]-Remover chamado");
                    
                    System.out.print("Digite uma opção para continuar:");
                    opcao = leOpcao.nextInt();
                    switch(opcao){
                        case 1:
                            sisIfam.criarChamadoSuporteManutencao();
                        break;
                        
                        case 2:
                            sisIfam.listarChamadoSuporteManutencao();
                        break;
                        
                        case 3:
                            sisIfam.alterarChamadoSuporteManutencao();
                        break;
                        
                        case 4:
                            sisIfam.removerChamadoSuporte();
                        break;
                        
                    }
                break;
                   
                case 2:
                    System.out.printf("\t\t%s ","Bem vindo ao atendimento de Sistemas do IFAM\n");
                    System.out.println("[1]-Criar chamado");
                    System.out.println("[2]-Listar chamado");
                    System.out.println("[3]-Alterar dados de chamado");
                    System.out.println("[4]-Remover chamado");
                    
                    System.out.print("Digite uma opção para continuar:");
                    opcao = leOpcao.nextInt();
                    switch(opcao){
                        case 1:
                            sisIfam.criarChamadoSistemas();
                        break;
                        
                        case 2:
                            sisIfam.listarChamadoSistemas();
                        break;
                        
                        case 3:
                            sisIfam.alterarChamadoSistemas();
                        break;
                        
                        case 4:
                            sisIfam.removerChamadoSistemas();
                        break;
                        
                    }
                break;
                
                case 3:
                    
                break;
                
                default:
                    System.out.print("OPÇÃO INVALIDA!!");
                break;
            }
            
        }while(opcao !=0);
        
        
    }
    
}