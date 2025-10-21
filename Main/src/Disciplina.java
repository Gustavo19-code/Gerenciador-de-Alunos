public class Disciplina {
    private String codigo;
   private String  disciplina;


   //construtuor
    public Disciplina(String disciplina,String codigo){
        this.disciplina=disciplina;
        this.codigo=codigo;
    }


    //getters e setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //funcao para verificar as materias duplicadas na lista
    public boolean enquals(Object o){
        if(this==o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        Disciplina that =(Disciplina) o;
        return codigo!= null ? codigo.equals(that.codigo) : that.codigo==null;
    }

    public int hashCode(){
        return codigo!=null ? codigo.hashCode(): 0; 
    }

    public String toString(){
        return codigo + "("+disciplina+")";

    }

}