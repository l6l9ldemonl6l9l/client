package story_client.ds.controller;
import story_client.ds.entity.Deity;
import story_client.ds.service.DeitysService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Deity")
@AllArgsConstructor
@NoArgsConstructor
public class DeitysController {

    @Autowired
    private DeitysService DeitysService;

    @PostMapping
    public Deity createDeity(@RequestBody Deity Deity) {
        return DeitysService.addDeity(Deity);
    }

    @GetMapping
    public List<Deity> getAllDeitys() {
        return DeitysService.getAll();
    }

    @GetMapping(path = "{id}")
    public Deity getDeityById(@PathVariable(value = "id") UUID id) {
        Deity Deity = DeitysService.getById(id);
        return Deity;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteDeity(@PathVariable(value = "id") UUID id)  {
        DeitysService.deleteDeityById(id);
        return ResponseEntity.noContent().build();
    }

}