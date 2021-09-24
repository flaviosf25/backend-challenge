package br.com.challenge.domain.validacao;

import org.springframework.stereotype.Component;
import br.com.challenge.exception.ValidacaoException;

@Component
public class ValidaSenhaComEspacoEmBranco implements ValidacaoSenha {

	@Override
	public Boolean validarSenha(String senha) {
		if (senha.contains(" ")) {
			throw new ValidacaoException("A senha não deve conter espaços em branco!");
		}
		return true;
	}
}
