package br.com.fiap.catalogojogos.model.dto;

import br.com.fiap.catalogojogos.model.enums.Genero;
import jakarta.validation.constraints.NotNull;

public record AtualizarJogo(
        @NotNull Long id,
        String titulo,
        String desenvolvedora,
        String distribuidora,
        String idiomas,
        Integer numeroJogadores,
        String dataLancamento,
        Genero genero,
        DadosRequisitosSistema dadosRequisitosSistema
) {
}
