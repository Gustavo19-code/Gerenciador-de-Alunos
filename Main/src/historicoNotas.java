import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public void remvoerMatricula(int IDestudante, String codigoDisciplina){
       Map<String,Double> disciplinas= matriculas.get(IDestudante);

       if(disciplinas!=null){
          disciplinas.remove(codigoDisciplina);
        }
        if(disciplinas.isEmpty()){
            matriculas.remove(IDestudante);
        }

    }

    public double mediaDaDisciplina(String codigoDisciplina) {
        
        List<Double> notasDisciplina = matriculas.values().stream()
                .map(disciplinasEstudante -> disciplinasEstudante.get(codigoDisciplina))
                .filter(nota -> nota != null)
                .collect(Collectors.toList());

        if (notasDisciplina.isEmpty()) {
            return 0.0;
        }

        // Calcula a soma e a média das notas
        double somaNotas = notasDisciplina.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        return somaNotas / notasDisciplina.size();
    }

    public double mediaEstudante(int IDestudante){
        Map<String,Double> disciplinas= matriculas.get(IDestudante);

        if(disciplinas==null|| disciplinas.isEmpty()){
            return 0.0;
        }
        
        double somaNotas = disciplinas.values().stream()
                .mapToDouble(Double::doubleValue)
                .sum();

                return somaNotas/disciplinas.size();
    }

    




}
