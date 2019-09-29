package it.test.demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.test.demo.dto.RuoloDto;
import it.test.demo.entity.Ruolo;
import it.test.demo.repository.RuoloRepository;

@Service
public class RuoloServiceImpl implements RuoloService {
	private static Logger LOG = Logger.getLogger(RuoloServiceImpl.class.getName());

	@Autowired
	RuoloRepository ruoloRepository;

	@Override
	public void add(RuoloDto ruoloDto) {
		ruoloRepository.save(ruoloDto.getRuoloEntityFromDto());
	}

	@Override
	public void delete(RuoloDto ruoloDto) {
		ruoloRepository.deleteById(ruoloDto.getId());
	}

	@Override
	public RuoloDto getRuoloDtoById(Integer id) {
		Optional<Ruolo> ruolo = ruoloRepository.findById(id);
		try {
			return new RuoloDto(ruolo.get());
		} catch (Exception e) {
			LOG.error(e);
			return null;
		}

	}

	@Override
	public List<RuoloDto> findByNome(RuoloDto ruoloDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
