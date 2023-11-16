package co.com.bancolombia.usecase.animalescasos;
import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
public class AnimalesCasosUseCase {
    //Variable de tipo Animales Repository
    private AnimalesRepository animalesRepository;

    //Metodo para crear animal
    public void create(Animales animales){
        animalesRepository.create(animales);
    }
    //Metodo para leer animales por id
    public Animales read(String idAnimal){
        return animalesRepository.read((idAnimal));
    }
    //Metodo para actualizar animal por id
    public Animales update(String idAnimal, Animales animales) throws Exception{
        animalesRepository.update(idAnimal, animales);
        return animales;
    }
    //Metodo para eliminar animal por id
    public void delete(String idAnimal){
        animalesRepository.delete(idAnimal);
    }
    //Metodo para devolver lista de animales
    public List<Animales> getAll(){
        return animalesRepository.getAll();
    }
}
