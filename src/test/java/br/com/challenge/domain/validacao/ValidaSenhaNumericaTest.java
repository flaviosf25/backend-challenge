package br.com.challenge.domain.validacao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.challenge.exception.ValidacaoException;

public class ValidaSenhaNumericaTest {
	
	@Mock
	private ValidaSenhaNumerica senhaNumerica;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.senhaNumerica = new ValidaSenhaNumerica();
	}
	
	@Test
	void naoDevePermitirSenhaSemNumeros() {
		assertThrows(ValidacaoException.class,
				() -> senhaNumerica.validarSenha("abc"));
		
	}
}
