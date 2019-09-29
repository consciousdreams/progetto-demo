package it.test.demo.dto;

import java.io.Serializable;

import it.test.demo.entity.Ruolo;

public class RuoloDto implements Serializable {

	private static final long serialVersionUID = 8553432597271228461L;

	private Integer id;
	private String nome;
	private Boolean cancellato;

	public RuoloDto() {
		super();
	}

	public RuoloDto(Integer id) {
		super();
		this.id = id;
	}

	public RuoloDto(Ruolo ruoloEntity) {
		this.id = ruoloEntity.getId();
		this.nome = ruoloEntity.getNome();
		this.cancellato = ruoloEntity.getCancellato();
	}

	public Ruolo getRuoloEntityFromDto() {
		Ruolo ruolo = new Ruolo();
		ruolo.setId(this.id);
		ruolo.setNome(this.nome);
		ruolo.setCancellato(this.cancellato);
		return ruolo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getCancellato() {
		return cancellato;
	}

	public void setCancellato(Boolean cancellato) {
		this.cancellato = cancellato;
	}

	@Override
	public String toString() {
		return "RuoloDto [id=" + id + ", nome=" + nome + ", cancellato=" + cancellato + "]";
	}
}
