package exemplos;


import java.util.ArrayList;
import java.util.List;

public class Listas {
    List<Integer> nos;

    public Listas(){
        this.nos = new ArrayList<Integer>();
    }

    public List<Integer> getNos(){
        return this.nos;
    }

    public void insereNo(Integer k){
        this.nos.add(k);
    }

    public static void main(String[] args) {
        Listas lst = new Listas();

        lst.insereNo(123);
        lst.insereNo(435);
        lst.insereNo(99);
        lst.insereNo(5);
        lst.insereNo(100);

        List<Integer> lista = lst.getNos();

        for(int k : lista){
            System.out.println("K: " + k);
        }

        System.out.println(lista.get(3));

    }
}
