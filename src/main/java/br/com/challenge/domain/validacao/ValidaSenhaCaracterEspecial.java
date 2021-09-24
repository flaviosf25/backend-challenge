package br.com.challenge.domain.validacao;

import org.springframework.stereotype.Component;

import br.com.challenge.exception.ValidacaoException;

@Component
public class ValidaSenhaCaracterEspecial implements ValidacaoSenha{

	@Override
	public Boolean validarSenha(String senha) {
		String caracterEspecial = "(.*[!,@,#,$,%,^,&,*,(,),-,+].*$)";
		if(!senha.matches(caracterEspecial)) {
			throw new ValidacaoException("A senha deve conter ao menos um caracter especial!");
		}
		return true;
	}
}
