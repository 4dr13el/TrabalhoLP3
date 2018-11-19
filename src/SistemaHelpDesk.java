
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaHelpDesk {
    ArrayList<Chamado> vetChamado = new ArrayList<Chamado>();
    
  
     
    public void criarChamadoSuporteManutencao(){
       
        ChamadoSuporteManutencao novoChamado = new ChamadoSuporteManutencao();
                    
        Scanner leTitulo = new Scanner(System.in);
        Scanner leLocal = new Scanner(System.in);
        Scanner leDescricao = new Scanner(System.in);
        Scanner leNumEquipamento = new Scanner(System.in);
        
        novoChamado.setId(1);
        
        System.out.print("Informe o titulo do chamado: ");
        novoChamado.setTitulo(leTitulo.nextLine()); 
        
        System.out.print("Informe o local do chamado: ");
        novoChamado.setLocal(leLocal.next()); 
        
        System.out.print("Informe o Problema: ");
        novoChamado.setDescricao(leDescricao.nextLine());
        
        System.out.print("Informe o Numero do equipamento: ");
        novoChamado.setNumEquipamento(leNumEquipamento.next());
        
        vetChamado.add(novoChamado);
    }
    
    public void listarChamadoSuporteManutencao(){
        Scanner leia = new Scanner(System.in);
        
        for(int i=0; i<vetChamado.size(); i++){
            Chamado novoChamado = vetChamado.get(i);
            if(novoChamado.getId()==1){
                System.out.println((i+1)+"-"+ vetChamado.get(i));
            }
            
        }
        System.out.print("Pressione ENTER para continuar...");
        leia.nextLine();
    }
    
    public void alterarChamadoSuporteManutencao(){
        Scanner leIndice = new Scanner(System.in);
        Scanner leTitulo = new Scanner(System.in);
        Scanner leLocal = new Scanner(System.in);
        Scanner leDescricao = new Scanner(System.in);
        
        
        listarChamadoSuporteManutencao();
        
        System.out.println("Informe o Indice do Chamado que desejar alterar:  ");
        int i = leIndice.nextInt();
        i--;
    
        Chamado novoChamado = vetChamado.get(i);
    
        System.out.print(novoChamado.getTitulo()+ ", modificar para: ");
        novoChamado.setTitulo(leTitulo.next());
    
        System.out.print(novoChamado.getLocal()+ ", modificar para: ");
        novoChamado.setLocal(leLocal.next());
        
        System.out.print(novoChamado.getDescricao()+ ", modificar para: ");
        novoChamado.setLocal(leDescricao.next());
        
        System.out.print(novoChamado.getLocal()+ ", modificar para: ");
        novoChamado.setLocal(leLocal.next());
        
    
        System.out.printf("\n Chamado: %d  Alterado com sucesso!",++i); 
    }
        

    public void removerChamadoSuporte(){
        Scanner leia = new Scanner(System.in);
        listarChamadoSuporteManutencao();
        
        System.out.println("Informe o Indice que deseja remover: ");
        vetChamado.remove(leia.nextInt()-1);
                
        System.out.println("\nChamado removido do sistema!");
    }

public void criarChamadoSistemas(){
       
        ChamadoSistemas novoChamado = new ChamadoSistemas();
                    
        Scanner leTitulo = new Scanner(System.in);
        Scanner leLocal = new Scanner(System.in);
        Scanner leDescricao = new Scanner(System.in);
        Scanner leConta = new Scanner(System.in);
        
        novoChamado.setId(2);
        
        System.out.print("Informe o titulo do chamado: ");
        novoChamado.setTitulo(leTitulo.nextLine()); 
        
        System.out.print("Informe o local do chamado: ");
        novoChamado.setLocal(leLocal.next()); 
        
        System.out.print("Informe o Problema: ");
        novoChamado.setDescricao(leDescricao.nextLine());
        
        System.out.print("Informe o nome da conta do usuario: ");
        novoChamado.setContaUsuario(leConta.next());
        
        
        vetChamado.add(novoChamado);
    }
    
    public void listarChamadoSistemas(){
        Scanner leia = new Scanner(System.in);
        
        for(int i=0; i<vetChamado.size(); i++){
            Chamado novoChamado = vetChamado.get(i);
            if(novoChamado.getId()==2){
                System.out.println((i+1)+"-"+ vetChamado.get(i));
            }       
        }
        System.out.print("Pressione ENTER para continuar...");
        leia.nextLine();
    }
    
    public void alterarChamadoSistemas(){
        Scanner leIndice = new Scanner(System.in);
        Scanner leTitulo = new Scanner(System.in);
        Scanner leLocal = new Scanner(System.in);
        Scanner leDescricao = new Scanner(System.in);
        
        
        listarChamadoSistemas();
        
        System.out.print("Informe o Indice do Chamado que desejar alterar:  ");
        int i = leIndice.nextInt();
        i--;
    
        Chamado novoChamadoSis = vetChamado.get(i);
       
    
        System.out.print(novoChamadoSis.getTitulo()+ ", modificar Titulo para: ");
        novoChamadoSis.setTitulo(leTitulo.next());
    
        System.out.print(novoChamadoSis.getLocal()+ ", modificar Local para: ");
        novoChamadoSis.setLocal(leLocal.next());
        
        System.out.print(novoChamadoSis.getDescricao()+ ", modificar Descrição para: ");
        novoChamadoSis.setLocal(leDescricao.next());
        
        System.out.printf("\n Chamado: %d  Alterado com sucesso!",++i); 
    }
        

    public void removerChamadoSistemas(){
        Scanner leia = new Scanner(System.in);
        listarChamadoSistemas();
        
        System.out.println("Informe o Indice que deseja remover: ");
        vetChamado.remove(leia.nextInt()-1);
                
        System.out.println("\nChamado removido do sistema!");
    }    
    
}
