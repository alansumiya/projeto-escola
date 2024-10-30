package com.projetoescola.escola.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoescola.escola.entities.Aluno;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoResource {
	@GetMapping
	public ResponseEntity<Aluno> findAll(){
		Aluno a = new Aluno(910, "Manoel", "Rua Chile, 30", 444, "Santos");
		return ResponseEntity.ok().body(a);
	}

}
