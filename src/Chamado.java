/* 
*/
public abstract class Chamado {
    protected int Id;
    protected String titulo;
    protected String local;
    protected String descricao;
    
    public void setId(int Id) {
	this.Id = Id;
    }
    public int getId() {
	return Id;
    }
    
    
    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }
    
    public String getLocal() {
	return local;
    }

    public void setLocal(String local) {
	this.local = local;
    }
    
    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }
    
    
    
    
}