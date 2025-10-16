import java.util.ArrayList;
import java.util.Comparator;
public class ListaEstudantes {
  ArrayList<Estudante>estudantes= new ArrayList<>();

     //adicionar estudante./Ordenando nomes
    public void adicionarAluno(Estudante e){
        estudantes.add(e);
        System.out.println("adicionado com sucesso");
    }
    //remover estudante.
    public void removerAluno(Estudante e ){
        estudantes.remove(e);
    }

    //Buscar Estudante.
    public Estudante Buscar(){
        for (Estudante e: estudantes){
           if(e!=null){
               return e;
           }
           return null;
        }
        return null;
    }

    public ArrayList<Estudante> ordenacao(){
        estudantes.sort(Comparator.comparing(Estudante::getNome));//função sort serve para comparar duas Strings e ordenar em ordem alfabetica.
        return estudantes;
    }

    public ArrayList<Estudante> obterAluno(){
        for(int i=0; i<estudantes.size(); i++){
            System.out.println(estudantes.get(i));
        }
        return estudantes;
    }

}
