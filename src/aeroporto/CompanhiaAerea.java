package aeroporto;

/** Representa uma companhia aérea. */
public class CompanhiaAerea {

    private final String nome;
    private final String codigo;

    public CompanhiaAerea(String nome, String codigo) {
        if (nome == null || nome.isBlank() || codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O nome e o código são obrigatórios.");
        }

        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
