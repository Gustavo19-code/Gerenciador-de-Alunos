import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class historicoNotas {
    private final Map<Integer,Map<String,Double>> matriculas;

    public historicoNotas(){
        this.matriculas=new HashMap<>();
    }

    public void adicionarMatricula(int IDestudante,String codigoEstudante, Double nota){
        matriculas.putIfAbsent(IDestudante, new HashMap<>());//garante que o objeto estudante exista no mapa principal(matriculas).

        matriculas.get(IDestudante).put(codigoEstudante, nota);//adiciona as informacoes(codigo e nota) ao ID adicionado no mapa anteriormente.
    }

    public List<Map.Entry<String,Double>> obterMatricula(int IDestudante){
        Map<String,Double> disciplinas= matriculas.get(IDestudante);
        
        if(disciplinas==null){
            return new ArrayList<>();
        }
         return new ArrayList<>(disciplinas.entrySet());
    }


}
