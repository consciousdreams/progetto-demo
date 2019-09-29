package it.test.demo.service;

import java.util.List;

import it.test.demo.dto.UtenteDto;

public interface UtenteService {

	public void add(UtenteDto utenteDto);

	public void delete(UtenteDto utenteDto);

	public List<UtenteDto> findByUsername(String username);
}
