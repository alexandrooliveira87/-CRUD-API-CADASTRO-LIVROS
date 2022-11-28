package tech.devinhouse.livraria.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class LivroRequest {

    @NotEmpty(message = "{campo.obrigatorio}")
    private String titulo;

    @NotEmpty(message = "{campo.obrigatorio}")
    @Size(min=10, max=20, message = "{campo.invalido}")
    private String isbn;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String idioma;

    @NotNull(message = "{campo.obrigatorio}")
    private Integer nroDePaginas;

}
