package br.com.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.challenge.domain.Senha;
import br.com.challenge.service.ValidacaoSenhaService;

@Controller
@RequestMapping("validar-senha")
public class ValidacaoSenhaController {
	
	private ValidacaoSenhaService service;
	
	@Autowired
	public ValidacaoSenhaController(ValidacaoSenhaService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Boolean> validarSenha(@RequestBody Senha senha){
		Boolean senhaValidada = service.validarSenha(senha.getSenha());
		return ResponseEntity.status(HttpStatus.OK).body(senhaValidada);
	}

}
