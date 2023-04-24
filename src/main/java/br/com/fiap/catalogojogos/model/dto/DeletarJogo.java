// Higor Alves Santos RM93359
package br.com.fiap.catalogojogos.model.dto;

import jakarta.validation.constraints.NotNull;

public record DeletarJogo(
        @NotNull
        Long id
) {
}
