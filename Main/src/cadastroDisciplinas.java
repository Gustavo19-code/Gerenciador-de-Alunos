import java.util.LinkedHashSet;

public class cadastroDisciplinas{
    private LinkedHashSet<Disciplina> disciplinas= new LinkedHashSet<>();
    private LinkedHashSet<Disciplina> duplicadas= new LinkedHashSet<>();
    
    //construtor
    public cadastroDisciplinas(){
        this.disciplinas= new LinkedHashSet<>();
    }

    public void adicionarDisciplina(Disciplina d ){
        if(!disciplinas.add(d)){
            System.out.println("nao e possivel adicionar o aluno,pois ele ja existe no sistema");
            duplicadas.add(d);
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


    //funcao para obter as duplicatas das materias.
    public LinkedHashSet<Disciplina> obterDuplicatas(){
        return duplicadas;
    }

    

}
