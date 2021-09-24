package br.com.challenge.domain.validacao;

import org.springframework.stereotype.Component;

import br.com.challenge.exception.ValidacaoException;

@Component
public class ValidaSenhaLetraMaiuscula implements ValidacaoSenha{

	@Override
	public Boolean validarSenha(String senha) {
		String letraMaiuscula = "(.*[A-Z].*)";
		if(!senha.matches(letraMaiuscula)) {
			throw new ValidacaoException("A senha deve conter ao menos uma letra maiuscula!");
		}
		return true;
	}
}
