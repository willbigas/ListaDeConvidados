package br.com.willbigas.listadeconvidados.service;

import br.com.willbigas.listadeconvidados.model.Convidado;
import br.com.willbigas.listadeconvidados.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class ConvidadoService implements Serializable {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    public Iterable<Convidado> listarTodos() {
        return convidadoRepository.findAll();
    }

    public Convidado salvar(Convidado convidado) {
        return convidadoRepository.save(convidado);
    }
}
