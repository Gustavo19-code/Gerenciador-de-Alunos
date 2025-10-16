import java.util.LinkedHashSet;

public class cadastroDisciplinas{
    LinkedHashSet<Disciplina> disciplinas= new LinkedHashSet<>();

    public void adicionarDisciplina(Disciplina d ){
        if(d!=null){
            disciplinas.add(d);
        }

    }

    public void removerDisciplina(Disciplina d){
        if(d!=null){
            disciplinas.remove(d);
        }
    }

    public LinkedHashSet<Disciplina> obterDisciplinas(){
        for(Disciplina d: disciplinas){
            return disciplinas;
        }
        return disciplinas;
    }

    

}
