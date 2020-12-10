package story_client.ds.controller;
import story_client.ds.entity.FairyAnimal;
import story_client.ds.service.FairyAnimalsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/FairyAnimal")
@AllArgsConstructor
@NoArgsConstructor
public class FairyAnimalsController {

    @Autowired
    private FairyAnimalsService FairyAnimalsService;

    @PostMapping
    public FairyAnimal createFairyAnimal(@RequestBody FairyAnimal FairyAnimal) {
        return FairyAnimalsService.addFairyAnimal(FairyAnimal);
    }

    @GetMapping
    public List<FairyAnimal> getAllFairyAnimals() {
        return FairyAnimalsService.getAll();
    }

    @GetMapping(path = "{id}")
    public FairyAnimal getFairyAnimalById(@PathVariable(value = "id") UUID id) {
        FairyAnimal FairyAnimal = FairyAnimalsService.getById(id);
        return FairyAnimal;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteFairyAnimal(@PathVariable(value = "id") UUID id)  {
        FairyAnimalsService.deleteFairyAnimalById(id);
        return ResponseEntity.noContent().build();
    }

}