
public class ChamadoSistemas extends Chamado {
    String contaUsuario;
    
    
    public String getContaUsuario() {
    return contaUsuario;
    }

    public void setContaUsuario(String contaUsuario) {
    this.contaUsuario = contaUsuario;
    }
   
    @Override
    public String toString() {
        return "Chamado [TITULO: " + titulo +", LOCAL: " + local + ", DESCRICAO: " + descricao+", Conta do Usuário: "+contaUsuario+"]";
    }
}
