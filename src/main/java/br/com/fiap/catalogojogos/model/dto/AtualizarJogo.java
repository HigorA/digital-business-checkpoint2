// Higor Alves Santos RM93359
package br.com.fiap.catalogojogos.model.dto;

import br.com.fiap.catalogojogos.model.enums.Genero;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record AtualizarJogo(
        @NotNull Long id,
        String titulo,
        String desenvolvedora,
        String distribuidora,
        String idiomas,
        @Min(1) @Max(4)
        Integer numeroJogadores,
        @Pattern(regexp = "\\d{4}")
        String dataLancamento,
        Genero genero,
        DadosRequisitosSistema dadosRequisitosSistema
) {
}
