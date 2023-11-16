package co.com.bancolombia.jpa;
import java.util.List;
import java.util.UUID;

import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;
import co.com.bancolombia.model.animales.Animales;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JpaAnimalesImpl implements AnimalesRepository {
  private JPARepositoryAdapter jpaRepositoryAdapter;
  @Override
  public void create(Animales animales){
    jpaRepositoryAdapter.save(animales);
  }
  @Override
  public Animales read(String idAnimal){
    return jpaRepositoryAdapter.findById((idAnimal));
  }

  @Override
  public Animales update(String idAnimal, Animales animales) throws Exception{
    Animales animalBd = jpaRepositoryAdapter.findById((idAnimal));

    if (animalBd == null) throw new Exception("Animal " + idAnimal + " no encontrado");
    animalBd.setEspecie(animales.getEspecie());
    animalBd.setHabitat(animales.getHabitat());
    animalBd.setGenero(animales.getGenero());
    animalBd.setNumeroPatas(animales.getNumeroPatas());
    animalBd.setDomestico(animales.getDomestico());

    jpaRepositoryAdapter.save(animalBd);
    return animalBd;
  }

  @Override
  public void delete(String idAnimal){
    jpaRepositoryAdapter.deleteById(idAnimal);
  }

  @Override
  public List<Animales> getAll(){
    return jpaRepositoryAdapter.findAll();
  }
}
