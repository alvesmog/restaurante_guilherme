package parentClasses;

public abstract class Alimento {
	
	protected String tipo;
	protected int precoDeVenda;
	protected String descricao;

	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getprecoDeVenda() {
		return precoDeVenda;
	}
	public void setprecoDeVenda(int precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
