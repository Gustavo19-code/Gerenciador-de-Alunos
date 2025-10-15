public class Estudante {
    private String Id;
    private String nome;

    //construtor
    public Estudante(String nome,String Id){
        this.nome=nome;
        this.Id=Id;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
