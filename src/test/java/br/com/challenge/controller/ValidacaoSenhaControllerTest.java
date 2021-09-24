package br.com.challenge.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.challenge.domain.Senha;
import br.com.challenge.exception.ValidacaoException;
import br.com.challenge.service.ValidacaoSenhaService;

public class ValidacaoSenhaControllerTest {
	
	private ValidacaoSenhaController controller;
	
	@Mock
	private ValidacaoSenhaService service;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.controller = new ValidacaoSenhaController(service);
	}
	
	@Test
	public void validarSenhaTest() {
		Mockito.when(service.validarSenha(Mockito.anyString())).thenReturn(Boolean.TRUE);
		ResponseEntity<Boolean> retorno = controller.validarSenha(new Senha());
		assertEquals(HttpStatus.OK, retorno.getStatusCode());
	}

	@Test
	public void validarSenhaExceptionTest() {
		Mockito.when(controller.validarSenha(new Senha()))
		.thenThrow(ValidacaoException.class);
	}

}
