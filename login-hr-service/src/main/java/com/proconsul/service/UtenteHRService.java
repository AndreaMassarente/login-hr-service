package com.proconsul.service;

import com.proconsul.dto.UtenteHRDTO;
import com.proconsul.entity.UtenteHR;
import com.proconsul.exception.UtenteHRNonTrovatoException;

public interface UtenteHRService {

	public UtenteHR utenteHRLogin(UtenteHRDTO utenteHRDTO) throws UtenteHRNonTrovatoException;
	
	public String utenteIsAdmin(UtenteHR utenteHR);
}
