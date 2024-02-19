package br.com.unlocksafely.service;

import br.com.unlocksafely.entity.Administrador;
import br.com.unlocksafely.entity.Armario;
import br.com.unlocksafely.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {
    @Autowired
    private AdministradorRepository administradorRepository;

    public Iterable<Administrador> findAdministrators() {
        return administradorRepository.findAll();
    }

    public Administrador saveAdministrator(Administrador adm) {
        return administradorRepository.save(adm);
    }

    public Administrador updateAdministrator(Long id, Administrador adm) {
        adm.setId(id);
        return administradorRepository.save(adm);
    }

    public void deleteAdministrator(Long id) {
        administradorRepository.deleteById(id);
    }
}
