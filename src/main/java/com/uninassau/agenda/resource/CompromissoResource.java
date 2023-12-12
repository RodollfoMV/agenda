package com.uninassau.agenda.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uninassau.agenda.bean.dto.CompromissoDTO;
import com.uninassau.agenda.util.Dados;

@RestController
@RequestMapping ("/api/compromisso")
public class CompromissoResource {

	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity<List<CompromissoDTO>> listar () {
		
		
		return ResponseEntity.ok(List.of(
				new CompromissoDTO(Dados.DATA_HORA1, Dados.TITULO1, Dados.DESCRICAO1, Dados.LOCAL1, Dados.RESPONSAVEL1),
				new CompromissoDTO(Dados.DATA_HORA2, Dados.TITULO2, Dados.DESCRICAO2, Dados.LOCAL2, Dados.RESPONSAVEL2),
				new CompromissoDTO(Dados.DATA_HORA3, Dados.TITULO3, Dados.DESCRICAO3, Dados.LOCAL3, Dados.RESPONSAVEL3)
				));
		
	}
}
