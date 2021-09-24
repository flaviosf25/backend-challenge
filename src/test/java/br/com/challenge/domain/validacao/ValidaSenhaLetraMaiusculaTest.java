package br.com.challenge.domain.validacao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.challenge.exception.ValidacaoException;

public class ValidaSenhaLetraMaiusculaTest {
	
	@Mock
	private ValidaSenhaLetraMaiuscula senhaLetraMaiuscula;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.senhaLetraMaiuscula = new ValidaSenhaLetraMaiuscula();
	}
	
	@Test
	void naoDevePermitirSenhaSemLetraMaiuscula() {
		assertThrows(ValidacaoException.class,
				() -> senhaLetraMaiuscula.validarSenha("asdfv"));
		
	}
}
