package co.com.bancolombia.model.animales.gateways;
import co.com.bancolombia.model.animales.Animales;
import java.util.List;

public interface AnimalesRepository {
    void create(Animales animales);
    Animales read(String idAnimal);
    default Animales update(String idAnimal, Animales animales) throws Exception{
        return animales;
    }
    void delete(String idAnimal);
    List<Animales> getAll();
}
