package br.com.challenge.domain.validacao;

import org.springframework.stereotype.Component;

import br.com.challenge.exception.ValidacaoException;

@Component
public class ValidaSenhaTamanho implements ValidacaoSenha{

	@Override
	public Boolean validarSenha(String senha) {
		if(senha.length() < 9) {
			throw new ValidacaoException("A senha não pode ser menor que nove caracteres!");
		}
		return true;
	}
}
