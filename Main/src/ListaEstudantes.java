import java.util.ArrayList;
import java.util.Comparator;
public class ListaEstudantes {
  ArrayList<Estudante>estudantes= new ArrayList<>();

  public ListaEstudantes(ArrayList<Estudante> estudantes){
    this.estudantes=estudantes;
  }

     //adicionar estudante./Ordenando nomes
    public void adicionarAluno(Estudante e){
        if (estudantes.contains(e)){
            System.out.println("esse aluno ja existe na lista de chamada");
            return;
        }
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
          if(e==null){
            return null;
          }
          return e;
        }
        return null;
    }
    //ordenar alunos por ordem alfabetica.
    public ArrayList<Estudante> ordenacao(){
        estudantes.sort(Comparator.comparing(Estudante::getNome));//função sort serve para comparar duas Strings e ordenar em ordem alfabetica.
        return estudantes;
    }
     
    //obter os dados de um aluno pelo ID.
    public ArrayList<Estudante> obterAluno(){
        for(int i=0; i<estudantes.size(); i++){
            System.out.println(estudantes.get(i));
        }
        return estudantes;
    } 


}
