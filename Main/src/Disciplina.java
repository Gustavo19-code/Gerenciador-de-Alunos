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
}
