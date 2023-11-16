package co.com.bancolombia.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AnimalesEntity {
    @Id
    private String idAnimal;
    @Column
    private String especie;
    @Column
    private String habitat;
    @Column
    private String genero;
    @Column
    private Long numeroPatas;
    @Column
    private Boolean domestico;
}
