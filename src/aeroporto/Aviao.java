package aeroporto;

/** Representa um avião registado no aeroporto. */
public class Aviao {

    private final String matricula;
    private final String modelo;
    private final int capacidade;
    private final CompanhiaAerea companhia;
    private int prioridadeEmergencia;

    public Aviao(String matricula, String modelo, int capacidade, CompanhiaAerea companhia) {
        if (matricula == null || matricula.isBlank() || modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("A matrícula e o modelo são obrigatórios.");
        }
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser superior a zero.");
        }
        if (companhia == null) {
            throw new IllegalArgumentException("A companhia aérea é obrigatória.");
        }

        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.companhia = companhia;
        this.prioridadeEmergencia = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public CompanhiaAerea getCompanhia() {
        return companhia;
    }

    public int getPrioridadeEmergencia() {
        return prioridadeEmergencia;
    }

    public void definirPrioridade(int prioridade) {
        if (prioridade < 0) {
            throw new IllegalArgumentException("A prioridade não pode ser negativa.");
        }
        this.prioridadeEmergencia = prioridade;
    }
}
