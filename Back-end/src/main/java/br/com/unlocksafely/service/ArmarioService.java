package br.com.unlocksafely.service;

import br.com.unlocksafely.entity.Armario;
import br.com.unlocksafely.repository.ArmarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArmarioService {
    @Autowired
    private ArmarioRepository armarioRepository;

    public Iterable<Armario> findCabinets() {
        return armarioRepository.findAll();
    }

    public Armario saveCabinet(Armario armario) {
        return armarioRepository.save(armario);
    }

    public Armario updateCabinet(Long id, Armario armario) {
        armario.setId(id);
        return armarioRepository.save(armario);
    }

    public void deleteCabinet(Long id) {
        armarioRepository.deleteById(id);
    }
}
