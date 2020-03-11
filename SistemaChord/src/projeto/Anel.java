package projeto;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Anel {
	
	public static void main(String[] args) throws IOException {
    	No no;
		List<No> nos = new ArrayList<No>();
		
		Path arquivo = Paths.get("/home/geremiapc/workspace/SistemaChord/src/musicas");

        List<String> musicas = Files.readAllLines(arquivo);
        
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
        
        i = 0;
        
		for(String m: musicas){
			no = new No();
			no.setChave(i);
			no.setValor(m);
			nos.add(no);
			if(r.contains(i)) {
				no.setAtivo(true);
				//no.setProx();
			}
			i++;
        }
	}

}
