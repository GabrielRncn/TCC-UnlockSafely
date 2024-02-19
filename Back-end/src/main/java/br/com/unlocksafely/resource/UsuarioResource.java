package br.com.unlocksafely.resource;

import br.com.unlocksafely.entity.Usuario;
import br.com.unlocksafely.repository.UsuarioRepository;
import br.com.unlocksafely.service.UsuarioService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/findAll")
    public Iterable<Usuario> findAll(){
        return usuarioService.findUsers();
    }

    @PostMapping
    public Usuario addUser(@RequestBody Usuario usuario){
        return usuarioService.saveUser(usuario);
    }

    @PutMapping("/{id}")
    public Usuario updateUser(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.updateUser(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        usuarioService.deleteUser(id);
    }
}
