package br.com.willbigas.listadeconvidados.repository;

import br.com.willbigas.listadeconvidados.model.Convidado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Integer> {

}
