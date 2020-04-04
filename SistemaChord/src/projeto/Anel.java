package projeto;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Anel {
	
	public static void main(String[] args) throws IOException {
    	No no;
		List<No> nos = new ArrayList<No>();
		
		Path arquivo = Paths.get("/home/geremiapc/workspace/SistemaChord/src/musicas");

        List<String> musicas = Files.readAllLines(arquivo);
        
        //gerar os valores que serão os principais
        Random gerador = new Random();
        List<Integer> r = new ArrayList<Integer>();

		int i = 0;
        
        for(i = 0; i < 8; i++) {
        	int laranja = gerador.nextInt(40);
        	if(r.contains(laranja)) {
        		i--;
        	}else{
        		r.add(laranja);
        	}
        }
        
        //bublesort para ordenar os valores que estão na lista
        int aux = 0;
        int h = 0;
        for(h = 0; h<r.size(); h++){
            for(int j = 0; j<(r.size()-1); j++){
                if(r.get(j) > r.get(j + 1)){
                    aux = r.get(j);
                    r.set(j, r.get(j+1));
                    r.set(j+1, aux);
                }
            }
        }

        i = 0;
        h = r.size();
        aux = 0;
        //gerar os nós do anel
        
        Map<Integer, String> teste = new HashMap<>();
        teste.put(15, "joao");
		for(String m: musicas){
			no = new No();
			no.setChave(i);
			no.setValor(m);
			if(r.contains(i)&&(aux==(h-1))) {
				System.out.println(no.getChave()+" ativo");
				no.setAtivo(true);
				no.setProx(r.get(0));
			}else if(r.contains(i)&&(aux<h)) {
				System.out.println(no.getChave()+" ativo");
				no.setAtivo(true);
				no.setProx(r.get(aux+1));
				aux++;
			}
			nos.add(no);
			i++;
        }
		
		Map<Integer, String> dependentes= new HashMap<>();
		h = 0;
		aux = 0;
		i = r.get(h)-1;
		do {
			if(i==-1) {
				i = nos.size()-1;
			}else if(i == r.get(0)) {
				nos.get(r.get(h)).setDependentes(dependentes);
				dependentes.clear();
				break;
			}
			System.out.println(nos.get(i).getChave()+"--"+nos.get(i).getDependentes());
			if(!nos.get(i).getAtivo()) {
				int key = nos.get(i).getChave();
				String value = nos.get(i).getValor();
				dependentes.put(key, value);
			}else if(nos.get(i).getAtivo()&&(aux==0)){
				nos.get(r.get(h)).setDependentes(dependentes);
				dependentes.clear();
				int key = nos.get(i).getChave();
				String value = nos.get(i).getValor();
				dependentes.put(key, value);
				h = r.size() - 1;
				aux = 1;
			}else if(nos.get(i).getAtivo()&&(h!=0)) {
				nos.get(r.get(h)).setDependentes(dependentes);
				dependentes.clear();
				int key = nos.get(i).getChave();
				String value = nos.get(i).getValor();
				dependentes.put(key, value);
				h--;
			}
			i--;
		}while(true);
		/*
		for(No teste : nos) {
			System.out.println(nos.get(i).getChave()+"--"+nos.get(i).getDependentes());
			i++;
		}*/
		
	}

}
