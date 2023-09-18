package com.proconsul.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.proconsul.exception.ErrorMessage;
import com.proconsul.exception.UtenteHRNonTrovatoException;

@RestControllerAdvice
public class ExceptionAdvise {
	
	@ExceptionHandler(UtenteHRNonTrovatoException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMessage exceptionHandler(Exception ex, WebRequest request) {

		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND.value(), new Date(), ex.getMessage(),
				request.getDescription(false));

		return message;
	}
	

}
