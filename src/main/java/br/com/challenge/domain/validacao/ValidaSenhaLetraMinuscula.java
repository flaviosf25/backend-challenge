package br.com.challenge.domain.validacao;

import org.springframework.stereotype.Component;

import br.com.challenge.exception.ValidacaoException;

@Component
public class ValidaSenhaLetraMinuscula implements ValidacaoSenha{

	@Override
	public Boolean validarSenha(String senha) {
		String letraMinuscula = "(.*[a-z].*)";
		if(!senha.matches(letraMinuscula)) {
			throw new ValidacaoException("A senha deve conter ao menos uma letra minuscula!");
		}
		return true;
	}
}
