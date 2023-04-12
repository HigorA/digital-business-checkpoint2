package br.com.fiap.catalogojogos.model.dto;

import br.com.fiap.catalogojogos.model.enums.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record CadastroJogo(
        @NotBlank String titulo,
        @NotBlank String desenvolvedora,
        String distribuidora,
        @NotBlank String idiomas,
        @Min(1) @Max(4) Integer numeroJogadores,
        @Pattern(regexp = "\\d{4}") String dataLancamento,
        @NotNull Genero genero,
        @NotNull @Valid DadosRequisitosSistema dadosRequisitosSistema
) {
}
