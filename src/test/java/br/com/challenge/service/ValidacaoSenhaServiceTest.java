package br.com.challenge.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.challenge.domain.validacao.ValidacaoSenha;
import br.com.challenge.exception.ValidacaoException;

public class ValidacaoSenhaServiceTest {
	
	private ValidacaoSenhaService service;
	
	@Mock
	private ValidacaoSenha validacaoSenha;
	
	@Mock
	private List<ValidacaoSenha> validacoes;

	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.service = new ValidacaoSenhaService(validacoes);
	}
	
	@Test
	public void validarSenhaTest() {
		Mockito.when(validacaoSenha.validarSenha(Mockito.anyString())).thenReturn(Boolean.TRUE);
		Boolean retorno = service.validarSenha(Mockito.anyString());
		assertTrue(retorno);
	}
	
	@Test
	public void validarSenhaExceptionTest() {
		Mockito.when(service.validarSenha(Mockito.anyString()))
			.thenThrow(ValidacaoException.class);
	}
	
}
