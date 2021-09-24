package br.com.challenge.domain.validacao;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import br.com.challenge.exception.ValidacaoException;

@Component
public class ValidaSenhaCaracterRepetido implements ValidacaoSenha {

	@Override
	public Boolean validarSenha(String senha) {
		
		senha.chars()
			.mapToObj(c -> (char) c)
			.collect(Collectors.groupingBy(Object::toString, Collectors.counting()))
			.forEach((key, value) -> {
				if(value > 1) {
					throw new ValidacaoException("A senha não deve conter caracteres repetidos!");
				}
			});
		
		return true;
	}
}
