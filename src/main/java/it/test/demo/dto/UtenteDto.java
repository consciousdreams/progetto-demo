package it.test.demo.dto;

import java.io.Serializable;

import it.test.demo.entity.Utente;

public class UtenteDto implements Serializable {

	private static final long serialVersionUID = 8692098784648478474L;

	private Integer id;
	private String username;
	private String password;
	private RuoloDto ruoloDto;
	private Boolean cancellato;

	public UtenteDto() {
		super();
	}

	public UtenteDto(Utente utenteEntity) {
		this.id = utenteEntity.getId();
		this.password = utenteEntity.getPassword();
		this.ruoloDto = new RuoloDto(utenteEntity.getRuolo());
		this.username = utenteEntity.getUsername();
		this.cancellato = utenteEntity.getCancellato();
	}

	public Utente getUtenteEntityByDto() {
		Utente utente = new Utente();
		utente.setCancellato(this.cancellato);
		utente.setId(this.id);
		utente.setPassword(this.password);
		utente.setUsername(this.username);
		utente.setRuolo(this.ruoloDto.getRuoloEntityFromDto());
		return utente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RuoloDto getRuoloDto() {
		return ruoloDto;
	}

	public void setRuoloDto(RuoloDto ruoloDto) {
		this.ruoloDto = ruoloDto;
	}

	public Boolean getCancellato() {
		return cancellato;
	}

	public void setCancellato(Boolean cancellato) {
		this.cancellato = cancellato;
	}

	@Override
	public String toString() {
		return "UtenteDto [id=" + id + ", username=" + username + ", password=" + password + ", ruoloDto=" + ruoloDto
				+ ", cancellato=" + cancellato + "]";
	}
}
