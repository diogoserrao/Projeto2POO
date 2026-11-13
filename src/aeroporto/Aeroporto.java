package aeroporto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Agrega e consulta os elementos base do aeroporto. */
public class Aeroporto {

    private final String nome;
    private final List<Aviao> avioes;
    private final List<Pista> pistas;
    private final List<CompanhiaAerea> companhias;

    public Aeroporto(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do aeroporto é obrigatório.");
        }
        this.nome = nome;
        this.avioes = new ArrayList<>();
        this.pistas = new ArrayList<>();
        this.companhias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCompanhia(CompanhiaAerea companhia) {
        if (companhia == null) {
            throw new IllegalArgumentException("A companhia aérea é obrigatória.");
        }
        companhias.add(companhia);
    }

    public void adicionarAviao(Aviao aviao) {
        if (aviao == null) {
            throw new IllegalArgumentException("O avião é obrigatório.");
        }
        if (pesquisarAviao(aviao.getMatricula()) != null) {
            throw new IllegalArgumentException("Já existe um avião com essa matrícula.");
        }
        avioes.add(aviao);
    }

    public void adicionarPista(Pista pista) {
        if (pista == null) {
            throw new IllegalArgumentException("A pista é obrigatória.");
        }
        pistas.add(pista);
    }

    public Aviao pesquisarAviao(String matricula) {
        for (Aviao aviao : avioes) {
            if (aviao.getMatricula().equalsIgnoreCase(matricula)) {
                return aviao;
            }
        }
        return null;
    }

    public List<Aviao> getAvioes() {
        return Collections.unmodifiableList(avioes);
    }

    public List<Pista> getPistas() {
        return Collections.unmodifiableList(pistas);
    }

    public List<CompanhiaAerea> getCompanhias() {
        return Collections.unmodifiableList(companhias);
    }
}
