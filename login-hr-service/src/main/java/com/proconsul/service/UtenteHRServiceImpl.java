package com.proconsul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.proconsul.dto.UtenteHRDTO;
import com.proconsul.entity.UtenteHR;
import com.proconsul.entity.UtenteHRId;
import com.proconsul.exception.UtenteHRNonTrovatoException;
import com.proconsul.repository.UtenteHRRepository;

@Service
public class UtenteHRServiceImpl implements UtenteHRService {

	@Autowired
	private UtenteHRRepository utenteHRRepository;

	@Value("${messaggio.utente.non.registrato}")
	private String messaggioUtenteNonRegistrato;

	@Override
	public UtenteHR utenteHRLogin(UtenteHRDTO utenteHRDTO) throws UtenteHRNonTrovatoException {

		UtenteHRId utenteHRId = new UtenteHRId(utenteHRDTO.getEmail(), utenteHRDTO.getPassword());

		return utenteHRRepository.findById(utenteHRId)
				.orElseThrow(() -> new UtenteHRNonTrovatoException(messaggioUtenteNonRegistrato));

	}

	/*
	 * DA USARE NEL CASO IN CUI SI SCEGLIERA' DI GESTIRE LA LOGICA DI
	 * REINDIRIZZAMENTO TRAMITE COMUNICAZIONE CON UN ALTRO MICORSERVIZIO
	 * 
	 */
	@Override
	public String utenteIsAdmin(UtenteHR utenteHR) {

		/*
		 * DA VERIFICARE L'URL SPECIFICA DEL MICROSERVIZIO CHIAMATO
		 */
		String urlRicerca = "http://localhost:8207/rest/api/ricerca";

		if (!utenteHR.isUtente()) {
			urlRicerca = "http://localhost:8207/rest/api/admin";
		}

		return urlRicerca;
	}

}
