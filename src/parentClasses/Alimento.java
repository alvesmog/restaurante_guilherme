package parentClasses;

public abstract class Alimento {
	
	protected String tipo;
	protected String unidadeDeVenda;
	protected String descricao;

	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUnidadeDeVenda() {
		return unidadeDeVenda;
	}
	public void setUnidadeDeVenda(String unidadeDeVenda) {
		this.unidadeDeVenda = unidadeDeVenda;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
