package br.com.unlocksafely.resource;

import br.com.unlocksafely.entity.Administrador;
import br.com.unlocksafely.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrador")
public class AdministradorResource {
    @Autowired
    private AdministradorService administradorService;

    @GetMapping("/findAll")
    public Iterable<Administrador> findAll() {
        return administradorService.findAdministrators();
    }

    @PostMapping
    public Administrador addAdministrator(@RequestBody Administrador adm) {
        return administradorService.saveAdministrator(adm);
    }

    @PutMapping("/{id}")
    public Administrador updateAdministrator(@PathVariable Long id, @RequestBody Administrador adm) {
        return administradorService.updateAdministrator(id, adm);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrator(@PathVariable Long id) {
        administradorService.deleteAdministrator(id);
    }
}
