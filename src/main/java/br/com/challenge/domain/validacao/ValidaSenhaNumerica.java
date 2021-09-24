package br.com.challenge.domain.validacao;

import org.springframework.stereotype.Component;

import br.com.challenge.exception.ValidacaoException;

@Component
public class ValidaSenhaNumerica implements ValidacaoSenha{

	@Override
	public Boolean validarSenha(String senha) {
		String numeros = "(.*[0-9].*)";
		if(!senha.matches(numeros)) {
			throw new ValidacaoException("A senha deve conter ao menos um número!");
		}
		return true;
	}
}
