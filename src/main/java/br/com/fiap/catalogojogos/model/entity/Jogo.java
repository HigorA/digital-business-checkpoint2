package br.com.fiap.catalogojogos.model.entity;

import br.com.fiap.catalogojogos.model.dto.AtualizarJogo;
import br.com.fiap.catalogojogos.model.dto.CadastroJogo;
import br.com.fiap.catalogojogos.model.enums.Genero;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Jogo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String desenvolvedora;

    @Column
    private String distribuidora;

    @Column
    private String idiomas;

    @Column(name = "numero_jogadores")
    private Integer numeroJogadores;

    @Column(name = "data_lancamento")
    private String dataLancamento;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Embedded
    private RequisitosSistema requisitosSistema;

    @Column
    private Boolean ativo;

    public Jogo() {
    }

    public Jogo(CadastroJogo jogo) {
        this.ativo = true;
        this.titulo = jogo.titulo();
        this.desenvolvedora = jogo.desenvolvedora();
        this.distribuidora = jogo.distribuidora();
        this.idiomas = jogo.idiomas();
        this.numeroJogadores = jogo.numeroJogadores();
        this.dataLancamento = jogo.dataLancamento();
        this.genero = jogo.genero();
        this.requisitosSistema = new RequisitosSistema(jogo.dadosRequisitosSistema());
    }

    public void excluir() {
        this.ativo = false;
    }

    public void atualizarInformacoes(AtualizarJogo atualizarJogo) {
        if (atualizarJogo.titulo() != null) {
            this.titulo = atualizarJogo.titulo();
        }
        if (atualizarJogo.desenvolvedora() != null) {
            this.desenvolvedora = atualizarJogo.desenvolvedora();
        }
        if (atualizarJogo.distribuidora() != null) {
            this.distribuidora = atualizarJogo.distribuidora();
        }
        if (atualizarJogo.idiomas() != null) {
            this.idiomas = atualizarJogo.idiomas();
        }
        if (atualizarJogo.numeroJogadores() != null) {
            this.numeroJogadores = atualizarJogo.numeroJogadores();
        }
        if (atualizarJogo.dataLancamento() != null) {
            this.dataLancamento = atualizarJogo.dataLancamento();
        }
        if (atualizarJogo.genero() != null) {
            this.genero = atualizarJogo.genero();
        }
        if (atualizarJogo.dadosRequisitosSistema() != null) {
            this.requisitosSistema.atualizarRequsitos(atualizarJogo.dadosRequisitosSistema());
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(Integer numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public RequisitosSistema getRequisitosSistema() {
        return requisitosSistema;
    }

    public void setRequisitosSistema(RequisitosSistema requisitosSistema) {
        this.requisitosSistema = requisitosSistema;
    }

    @Override
    public String toString() {
        return "CatalogoJogo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", desenvolvedora='" + desenvolvedora + '\'' +
                ", distribuidora='" + distribuidora + '\'' +
                ", idiomas='" + idiomas + '\'' +
                ", numeroJogadores=" + numeroJogadores +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", genero=" + genero +
                ", requisitosSistema=" + requisitosSistema +
                '}';
    }
}
