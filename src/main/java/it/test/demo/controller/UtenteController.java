package it.test.demo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import it.test.demo.dto.RuoloDto;
import it.test.demo.dto.UtenteDto;
import it.test.demo.service.RuoloService;
import it.test.demo.service.UtenteService;

@RestController
@Api(value = "Utente")
@RequestMapping("/utente")
public class UtenteController {
	private static Logger LOG = Logger.getLogger(UtenteController.class.getName());

	@Autowired
	UtenteService utenteService;

	@Autowired
	RuoloService ruoloService;

	@ApiOperation(value = "Greets a person given her name")
	@GetMapping(value = "/getByUsername", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<UtenteDto> getByUsername(@RequestParam("username") String username) {
		LOG.info("INIT getByUsername - username: " + username);
		return utenteService.findByUsername(username);
	}

	@ApiOperation(value = "add a role")
	@PostMapping(value = "/addRuolo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void addRuolo(@RequestBody String roleName) {
		LOG.info("INIT addRuolo");
		RuoloDto r = new RuoloDto();
		r.setNome(roleName);
		r.setCancellato(false);
		ruoloService.add(r);
	}

	@ApiOperation(value = "add a user")
	@PostMapping(value = "/addUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void addUser(@RequestBody String username) {
		LOG.info("INIT addUser");

		UtenteDto user = new UtenteDto();
		user.setUsername(username);
		user.setCancellato(false);
		user.setPassword("Password1");
		user.setRuoloDto(new RuoloDto(0));
		utenteService.add(user);
	}

}
