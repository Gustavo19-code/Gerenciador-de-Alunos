public class Main {
    public static void main(String[] args) {
        Estudante e = new Estudante("gustavo ", "23");
        Estudante a = new Estudante("laurinha", "44");
        ListaEstudantes lista= new ListaEstudantes();

        lista.adicionarAluno(e);
        lista.adicionarAluno(a);

        lista.ordenacao();
    }
    
}
