package br.com.fiap.catalogojogos.model.dto;

import br.com.fiap.catalogojogos.model.entity.Jogo;
import br.com.fiap.catalogojogos.model.enums.Genero;

public record ListagemJogo(
        Long id,
        String titulo,
        String desenvolvedora,
        Integer numeroJogadores,
        Genero genero,
        String armazenamento
) {

    public ListagemJogo(Jogo jogo) {
        this(
            jogo.getId(),
            jogo.getTitulo(),
            jogo.getDesenvolvedora(),
            jogo.getNumeroJogadores(),
            jogo.getGenero(),
            jogo.getRequisitosSistema().getArmazenamento()
        );
    }
}
