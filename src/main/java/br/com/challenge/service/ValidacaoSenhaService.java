package br.com.challenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.challenge.domain.validacao.ValidacaoSenha;
import br.com.challenge.exception.ValidacaoException;

@Service
public class ValidacaoSenhaService {

	private List<ValidacaoSenha> validacoes;

	public ValidacaoSenhaService(List<ValidacaoSenha> validacoes) {
		this.validacoes = validacoes;
	}
	
	public Boolean validarSenha(String senha) {
		if(senha == null) {
			throw new ValidacaoException("A senha não pode ser nula!");
		}
		this.validacoes.forEach(validacao -> validacao.validarSenha(senha));
		return true;
	}
	
}
