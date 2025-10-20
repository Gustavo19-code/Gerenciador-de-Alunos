import java.util.LinkedHashSet;

public class cadastroDisciplinas{
    private LinkedHashSet<Disciplina> disciplinas= new LinkedHashSet<>();

    public cadastroDisciplinas(LinkedHashSet<Disciplina> disciplina){
        this.disciplinas= disciplina;
    }

    public void adicionarDisciplina(Disciplina d ){
        if(disciplinas.contains(d)){
            System.out.println("nao e possivel adicionar o aluno,pois ele ja existe no sistema");
        }
        disciplinas.add(d);
    }

    public void removerDisciplina(Disciplina d){
        if(d!=null){
            disciplinas.remove(d);
        }
    }

    public LinkedHashSet<Disciplina> obterDisciplinas(){
       for(Disciplina d: disciplinas){
        System.out.println(" "+d);
       }
       return disciplinas;
    }
    
    //funcao para verificar se existe uma disciplina na lista de disciplinas.
    public boolean verificarDisciplina(Disciplina d ){
        if(disciplinas.contains(d)){
            return true;
        }
        return false;
    }

    

}
