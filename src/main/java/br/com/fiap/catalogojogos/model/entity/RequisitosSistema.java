// Higor Alves Santos RM93359
package br.com.fiap.catalogojogos.model.entity;

import br.com.fiap.catalogojogos.model.dto.DadosRequisitosSistema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
public class RequisitosSistema implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column
    private String sistemaOperacional;
    @Column
    private String processador;
    @Column
    private String memoria;
    @Column
    private String placaDeVideo;
    @Column
    private String armazenamento;

    public RequisitosSistema() {
    }

    public RequisitosSistema(DadosRequisitosSistema dadosRequisitosSistema) {
        this.sistemaOperacional = dadosRequisitosSistema.sistemaOperacional();
        this.processador = dadosRequisitosSistema.processador();
        this.memoria = dadosRequisitosSistema.memoria();
        this.placaDeVideo = dadosRequisitosSistema.placaDeVideo();
        this.armazenamento = dadosRequisitosSistema.armazenamento();
    }

    public void atualizarRequsitos(DadosRequisitosSistema dadosRequisitosSistema) {
        if (dadosRequisitosSistema.sistemaOperacional() != null) {
            this.sistemaOperacional = dadosRequisitosSistema.sistemaOperacional();
        }
        if (dadosRequisitosSistema.processador() != null) {
            this.processador = dadosRequisitosSistema.processador();
        }
        if (dadosRequisitosSistema.memoria() != null) {
            this.memoria = dadosRequisitosSistema.memoria();
        }
        if (dadosRequisitosSistema.placaDeVideo() != null) {
            this.placaDeVideo = dadosRequisitosSistema.placaDeVideo();
        }
        if (dadosRequisitosSistema.armazenamento() != null) {
            this.armazenamento = dadosRequisitosSistema.armazenamento();
        }


    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "RequisitosSistema{" +
                "sistemaOperacional='" + sistemaOperacional + '\'' +
                ", processador='" + processador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", placaDeVideo='" + placaDeVideo + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                '}';
    }
}
