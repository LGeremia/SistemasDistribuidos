package projeto;
import java.util.HashMap;
import java.util.Map;

public class No {
	private int chave;
	private String valor;
	private int prox;
	private Boolean ativo;
	private Map<Integer, String> dependentes;
	
	public Map<Integer, String> getDependentes() {
		return dependentes;
	}

	public void setDependentes(Map<Integer, String> dependentes) {
		this.dependentes = dependentes;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public int getProx() {
		return prox;
	}

	public void setProx(int prox) {
		this.prox = prox;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public No() {
		this.chave = -1;
		this.valor = new String();
		this.dependentes = new HashMap<>();
		this.montarPlaylist();
		this.ativo = false;
		this.prox = -1;
	}
	
	public void montarPlaylist() {
		
	}
}
