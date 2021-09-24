package br.com.challenge.domain.validacao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.challenge.exception.ValidacaoException;

public class ValidaSenhaTamanhoTest {
	
	@Mock
	private ValidaSenhaTamanho senhaTamanho;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.senhaTamanho = new ValidaSenhaTamanho();
	}
	
	@Test
	void naoDevePermitirSenhaComMenosDeNoveCaracteres() {
		assertThrows(ValidacaoException.class,
				() -> senhaTamanho.validarSenha("12345678"));
		
	}
}
