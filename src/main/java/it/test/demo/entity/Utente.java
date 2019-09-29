package it.test.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente implements Serializable {

	private static final long serialVersionUID = 5486235154242048599L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "username", nullable = false, unique = true)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "cancellato", columnDefinition = "TINYINT", nullable = false)
	private Boolean cancellato = Boolean.FALSE;

	@ManyToOne
	@JoinColumn(name = "fk_autenticazione_ruolo", nullable = false)
	private Ruolo ruolo;

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

	public Boolean getCancellato() {
		return cancellato;
	}

	public void setCancellato(Boolean cancellato) {
		this.cancellato = cancellato;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", username=" + username + ", password=" + password + ", ruolo=" + ruolo
				+ ", cancellato=" + cancellato + "]";
	}

}
