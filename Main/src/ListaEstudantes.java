import java.util.Comparator;
import java.util.LinkedList;
public class ListaEstudantes {
  private LinkedList<Estudante>estudantes= new LinkedList<>();
   
  //construtor
  public ListaEstudantes(){
    this.estudantes=new LinkedList<>();
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
    public LinkedList<Estudante> ordenacao(){
        estudantes.sort(Comparator.comparing(Estudante::getNome));//função sort serve para comparar duas Strings e ordenar em ordem alfabetica.
        return estudantes;
    }
     
    //obter os dados de um aluno pelo ID.
    public LinkedList<Estudante> obterAluno(){
        for(int i=0; i<estudantes.size(); i++){
            System.out.println(estudantes.get(i));
        }
        return estudantes;
    } 


}
