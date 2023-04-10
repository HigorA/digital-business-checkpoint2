package br.com.fiap.catalogojogos.model.entity;

import br.com.fiap.catalogojogos.model.enums.Genero;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class CatalogoJogo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String desenvolvedora;
    private String distribuidora;
    private String idiomas;
    @Column(name = "numero_jogadores")
    private Integer numeroJogadores;
    @Column(name = "data_lancamento")
    private String dataLancamento;
    private Genero genero;
    private RequisitosSistema requisitosSistema;

    public CatalogoJogo() {
    }

    public CatalogoJogo(String titulo,
                        String desenvolvedora,
                        String distribuidora,
                        String idiomas,
                        Integer numeroJogadores,
                        String dataLancamento,
                        Genero genero,
                        RequisitosSistema requisitosSistema)
    {
        this.titulo = titulo;
        this.desenvolvedora = desenvolvedora;
        this.distribuidora = distribuidora;
        this.idiomas = idiomas;
        this.numeroJogadores = numeroJogadores;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
        this.requisitosSistema = requisitosSistema;
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
