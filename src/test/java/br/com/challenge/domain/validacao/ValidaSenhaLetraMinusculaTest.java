package br.com.challenge.domain.validacao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.challenge.exception.ValidacaoException;

public class ValidaSenhaLetraMinusculaTest {
	
	@Mock
	private ValidaSenhaLetraMinuscula senhaLetraMinuscula;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.senhaLetraMinuscula = new ValidaSenhaLetraMinuscula();
	}
	
	@Test
	void naoDevePermitirSenhaSemLetraMinuscula() {
		assertThrows(ValidacaoException.class,
				() -> senhaLetraMinuscula.validarSenha("AXDCVFT"));
		
	}
}
