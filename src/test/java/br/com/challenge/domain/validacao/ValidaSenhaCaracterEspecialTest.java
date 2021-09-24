package br.com.challenge.domain.validacao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.challenge.exception.ValidacaoException;

public class ValidaSenhaCaracterEspecialTest {
	
	@Mock
	private ValidaSenhaCaracterEspecial senhaCaracterEspecial;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.senhaCaracterEspecial = new ValidaSenhaCaracterEspecial();
	}
	
	@Test
	void naoDevePermitirSenhaSemCaracterEspecial() {
		assertThrows(ValidacaoException.class,
				() -> senhaCaracterEspecial.validarSenha("axdcvert"));
		
	}
}
