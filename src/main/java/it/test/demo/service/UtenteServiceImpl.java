package it.test.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.test.demo.dto.UtenteDto;
import it.test.demo.entity.Utente;
import it.test.demo.repository.UtenteRepository;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	UtenteRepository utenteRepo;

	@Override
	public void add(UtenteDto utenteDto) {
		utenteRepo.save(utenteDto.getUtenteEntityByDto());
	}

	@Override
	public void delete(UtenteDto utenteDto) {
		utenteRepo.delete(utenteDto.getUtenteEntityByDto());
	}

	@Override
	public List<UtenteDto> findByUsername(String username) {
		List<Utente> list = utenteRepo.findByUsername(username);
		List<UtenteDto> listDto = null;
		if (list != null && !list.isEmpty()) {
			listDto = new ArrayList<UtenteDto>();
			for (Utente u : list) {
				listDto.add(new UtenteDto(u));
			}
		}
		return listDto;
	}

}
