package it.test.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.test.demo.entity.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, Integer> {

	List<Utente> findByUsername(String username);

}
