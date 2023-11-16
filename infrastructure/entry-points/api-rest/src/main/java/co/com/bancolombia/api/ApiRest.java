package co.com.bancolombia.api;
import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.usecase.animalescasos.AnimalesCasosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


@RestController
@ResponseBody
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final AnimalesCasosUseCase animalesCasosUseCase;

    @GetMapping(path = "/animales/{idAnimal}")
    public Animales read(@PathVariable String idAnimal){
        return animalesCasosUseCase.read(idAnimal);}

    @PostMapping(path = "/animales")
    public void create(@RequestBody Animales animales){
        animalesCasosUseCase.create(animales);}

    @PutMapping(path = "/animales/{idAnimal}")
    public void update(@PathVariable String idAnimal, @RequestBody Animales animales){
        try{
            animalesCasosUseCase.update(idAnimal, animales);
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @DeleteMapping(path = "/animales/{idAnimal}")
    public void delete(@PathVariable String idAnimal){
        animalesCasosUseCase.delete(idAnimal);
    }

    @GetMapping(path = "/animales")
    public List<Animales> getAll(){
        return animalesCasosUseCase.getAll();
    }

    @GetMapping(path ="/root")
    public String comunicacionPostman(){
        return "Online";
    }

}
