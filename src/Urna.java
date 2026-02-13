import java.util.HashMap;
import java.util.Map;

public class Urna {
    private Map<Integer, Integer> conteoVotos;
    private int totalVotos;

    public Urna() {
        this.conteoVotos = new HashMap<>();
        this.totalVotos = 0;
    }

    public void votar(int candidato) {
        conteoVotos.put(candidato, conteoVotos.getOrDefault(candidato, 0) + 1);
        totalVotos++;
    }

    public void MostrarResultados() {
        if (totalVotos == 0) {
            System.out.println("No se han registrado votos.");
            return;
        }

    System.out.println("---Resultados finales---");
    System.out.println("Votos totales:" + totalVotos);

    for(Map.Entry<Integer, Integer> entrada : conteoVotos.entrySet()) {
        int candidato = entrada.getKey();
        int votos = entrada.getValue();
        double porcentaje = (votos * 100.0) / totalVotos;

        System.out.printf("Candidato %d: %d votos (%.2f%%)%n",
                        candidato, votos, porcentaje);
    }
    }
}

