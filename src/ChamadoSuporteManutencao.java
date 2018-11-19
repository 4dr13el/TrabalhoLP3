
public class ChamadoSuporteManutencao extends Chamado {
    
    String numEquipamento;
    
    
    public String getNumEquipamento() {
	return numEquipamento;
    }

    public void setNumEquipamento(String numEquipamento) {
	this.numEquipamento = numEquipamento;
    }
    
    @Override
    public String toString() {
        return "Chamado [TITULO: " + titulo +", LOCAL: " + local + ", DESCRICAO: " + descricao+", NUMERO DO EQUIPAMENTO: "+numEquipamento+"]";
    }
}
