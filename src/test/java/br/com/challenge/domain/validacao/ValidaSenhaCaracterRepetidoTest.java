package br.com.challenge.domain.validacao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.challenge.exception.ValidacaoException;

public class ValidaSenhaCaracterRepetidoTest {
	
	@Mock
	private ValidaSenhaCaracterRepetido senhaCaracterRepetido;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.senhaCaracterRepetido = new ValidaSenhaCaracterRepetido();
	}
	
	@Test
	void naoDevePermitirSenhaComCaracterRepetido() {
		assertThrows(ValidacaoException.class,
				() -> senhaCaracterRepetido.validarSenha("axdcverta"));
		
	}
}
