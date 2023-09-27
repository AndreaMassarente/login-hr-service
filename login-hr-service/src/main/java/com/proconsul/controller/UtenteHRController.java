package com.proconsul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.proconsul.dto.UtenteHRDTO;
import com.proconsul.entity.UtenteHR;
import com.proconsul.exception.UtenteHRNonTrovatoException;
import com.proconsul.service.UtenteHRService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("rest/api/hr")
public class UtenteHRController {

	// rest controller
	@Autowired
	private UtenteHRService utenteHRService;

	@Autowired
	private RestTemplate restTemplate;

	/*
	 * METODO DA USARE PER MAPPARE L'OPERAZIONE DI LOGIN HR NEL CASO IN CUI SI
	 * SCEGLIERA' DI FARLO TRAMITE COMUNICAZIONE CON UN ALTRO MICROSERVIZIO
	 */
//	@PostMapping("/login-hr")
//	public Object utenteHRLogin(@RequestBody UtenteHRDTO utenteHRDTO) throws UtenteHRNonTrovatoException {
//
//		UtenteHR utenteHR = utenteHRService.utenteHRLogin(utenteHRDTO);		
//
//		return restTemplate.postForObject(utenteHRService.utenteIsAdmin(utenteHR), utenteHR, Object.class);
//	}

	@PostMapping("/login-hr")
	public UtenteHR utenteHRLogin(@RequestBody UtenteHRDTO utenteHRDTO) throws UtenteHRNonTrovatoException {

		return utenteHRService.utenteHRLogin(utenteHRDTO);
	}
}
