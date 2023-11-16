package co.com.bancolombia.model.animales;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animales {
    private String idAnimal;
    private String especie;
    private String habitat;
    private String genero;
    private Long numeroPatas;
    private Boolean domestico;
}