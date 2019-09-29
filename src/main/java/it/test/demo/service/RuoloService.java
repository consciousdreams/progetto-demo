package it.test.demo.service;

import java.util.List;

import it.test.demo.dto.RuoloDto;

public interface RuoloService {

	public void add(RuoloDto ruoloDto);

	public void delete(RuoloDto ruoloDto);

	public RuoloDto getRuoloDtoById(Integer id);

	public List<RuoloDto> findByNome(RuoloDto ruoloDto);

}
