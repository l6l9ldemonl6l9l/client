package story_client.ds.controller;
import story_client.ds.entity.Terrain;
import story_client.ds.service.TerrainsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Terrain")
@AllArgsConstructor
@NoArgsConstructor
public class TerrainsController {

    @Autowired
    private TerrainsService TerrainsService;

    @PostMapping
    public Terrain createTerrain(@RequestBody Terrain Terrain) {
        return TerrainsService.addTerrain(Terrain);
    }

    @GetMapping
    public List<Terrain> getAllTerrains() {
        return TerrainsService.getAll();
    }

    @GetMapping(path = "{id}")
    public Terrain getTerrainById(@PathVariable(value = "id") UUID id) {
        Terrain Terrain = TerrainsService.getById(id);
        return Terrain;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteTerrain(@PathVariable(value = "id") UUID id)  {
        TerrainsService.deleteTerrainById(id);
        return ResponseEntity.noContent().build();
    }

}
