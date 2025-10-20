public class matricula{
    private double nota;
    //getters e setters da classe
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //constrututor estudante
    public matricula(double nota, Disciplina disciplina){
        this.nota=nota;
        disciplina.getCodigo();
    }
}
