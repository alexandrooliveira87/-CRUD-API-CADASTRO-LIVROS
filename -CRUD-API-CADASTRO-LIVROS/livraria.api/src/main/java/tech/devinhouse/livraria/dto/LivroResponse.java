package tech.devinhouse.livraria.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class LivroResponse {

    @NotEmpty(message = "{campo.obrigatorio}")
    private  Integer id;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String titulo;

    @NotEmpty(message = "{campo.obrigatorio}")
    @Size(min=10, max=20, message = "{campo.invalido}")
    private String isbn;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String idioma;

    @NotEmpty(message = "{campo.obrigatorio}")
    private Integer nroDePaginas;

    private LocalDateTime dataInclusao;

}
