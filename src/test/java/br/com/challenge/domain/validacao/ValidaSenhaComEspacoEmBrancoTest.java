package br.com.challenge.domain.validacao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.challenge.exception.ValidacaoException;

public class ValidaSenhaComEspacoEmBrancoTest {
	
	@Mock
	private ValidaSenhaComEspacoEmBranco senhaComEspacoEmBranco;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.senhaComEspacoEmBranco = new ValidaSenhaComEspacoEmBranco();
	}
	
	@Test
	void naoDevePermitirSenhaComEspacoEmBranco() {
		assertThrows(ValidacaoException.class,
				() -> senhaComEspacoEmBranco.validarSenha(" "));
		
	}
}
