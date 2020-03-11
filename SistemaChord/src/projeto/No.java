package projeto;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class No {
	int chave;
	String valor;
	int Prox;
	Boolean Ativo;
	private Map<Integer, String> musicas;
	List<Map> dependentes;
	
	public List<Map> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Map> dependentes) {
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
		return Prox;
	}

	public void setProx(int prox) {
		Prox = prox;
	}

	public Boolean getAtivo() {
		return Ativo;
	}

	public void setAtivo(Boolean ativo) {
		Ativo = ativo;
	}

	public Map<Integer, String> getMusicas() {
		return musicas;
	}

	public void setMusicas(Map<Integer, String> musicas) {
		this.musicas = musicas;
	}

	public No() {
		musicas = new HashMap<Integer, String>();
		this.montarPlaylist();
	}
	
	public void montarPlaylist() {
		
	}
}
