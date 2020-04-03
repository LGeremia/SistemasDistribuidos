package projeto;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
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
        System.out.println("Vetor organizado:");
        for(h = 0; h<r.size(); h++){
            System.out.println(" "+r.get(h));
        }

        i = 0;
        h = r.size();
        aux = 0;
        //gerar os nós do anel
		for(String m: musicas){
			no = new No();
			no.setChave(i);
			no.setValor(m);
			if(r.contains(i)&&(aux==(h-1))) {
				no.setProx(r.get(0));
			}else if(r.contains(i)&&(aux<h)) {
				no.setAtivo(true);
				no.setProx(r.get(aux+1));
				aux++;
			} 
			System.out.println(i + "//" + no.getProx());
			nos.add(no);
			i++;
        }
	}

}
