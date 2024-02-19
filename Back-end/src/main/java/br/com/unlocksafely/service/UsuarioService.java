package br.com.unlocksafely.service;

import br.com.unlocksafely.entity.Usuario;
import br.com.unlocksafely.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> findUsers(){
        return usuarioRepository.findAll();
    }

    public Usuario saveUser(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUser(Long id, Usuario usuario){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void deleteUser(Long id){
        usuarioRepository.deleteById(id);
    }
}
