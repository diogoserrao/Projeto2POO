package aeroporto;

/** Representa uma pista e o avião que a está a utilizar. */
public class Pista {

    private final String identificacao;
    private Aviao aviaoAtual;

    public Pista(String identificacao) {
        if (identificacao == null || identificacao.isBlank()) {
            throw new IllegalArgumentException("A identificação da pista é obrigatória.");
        }
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public boolean estaDisponivel() {
        return aviaoAtual == null;
    }

    public void ocupar(Aviao aviao) {
        if (aviao == null) {
            throw new IllegalArgumentException("O avião é obrigatório.");
        }
        if (!estaDisponivel()) {
            throw new IllegalStateException("A pista " + identificacao + " já está ocupada.");
        }
        aviaoAtual = aviao;
    }

    public void libertar() {
        aviaoAtual = null;
    }

    public Aviao getAviaoAtual() {
        return aviaoAtual;
    }
}
