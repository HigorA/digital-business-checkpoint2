package br.com.fiap.catalogojogos.model.entity;

import java.io.Serial;
import java.io.Serializable;

public class RequisitosSistema implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String sistemaOperacional;
    private String processador;
    private String memoria;
    private String placaDeVideo;
    private String armazenamento;

    public RequisitosSistema() {
    }

    public RequisitosSistema(String sistemaOperacional,
                             String processador,
                             String memoria,
                             String placaDeVideo,
                             String armazenamento)
    {
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.memoria = memoria;
        this.placaDeVideo = placaDeVideo;
        this.armazenamento = armazenamento;
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
