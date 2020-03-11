package projeto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivo {

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("/home/geremiapc/workspace/SistemaChord/src/musicas");

        List<String> musicas = Files.readAllLines(arquivo);

        int i = 0;
        for(String m: musicas){
            i++;
            System.out.println(i + " - " + m);
        }
    }
}
