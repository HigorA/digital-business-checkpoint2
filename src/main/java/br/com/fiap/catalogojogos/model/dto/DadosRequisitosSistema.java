// Higor Alves Santos RM93359
package br.com.fiap.catalogojogos.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosRequisitosSistema(
        String sistemaOperacional,
        @NotBlank String processador,
        @NotBlank String memoria,
        @NotBlank String placaDeVideo,
        @NotBlank String armazenamento
) {
}
