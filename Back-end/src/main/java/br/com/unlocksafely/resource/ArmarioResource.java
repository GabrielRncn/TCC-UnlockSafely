package br.com.unlocksafely.resource;

import br.com.unlocksafely.entity.Armario;
import br.com.unlocksafely.entity.Usuario;
import br.com.unlocksafely.service.ArmarioService;
import br.com.unlocksafely.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/armario")
public class ArmarioResource {
    @Autowired
    private ArmarioService armarioService;

    @GetMapping("/findAll")
    public Iterable<Armario> findAll() {
        return armarioService.findCabinets();
    }

    @PostMapping
    public Armario addCabinet(@RequestBody Armario armario) {
        return armarioService.saveCabinet(armario);
    }

    @PutMapping("/{id}")
    public Armario updateCabinet(@PathVariable Long id, @RequestBody Armario armario) {
        return armarioService.updateCabinet(id, armario);
    }

    @DeleteMapping("/{id}")
    public void deleteCabinet(@PathVariable Long id) {
        armarioService.deleteCabinet(id);
    }
}
