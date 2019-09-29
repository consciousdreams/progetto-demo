package it.test.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.test.demo.entity.Ruolo;

@Repository
public interface RuoloRepository extends CrudRepository<Ruolo, Integer> {

	List<Ruolo> findByNome(String nome);

}
