package com.uninassau.agenda.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uninassau.agenda.bean.dto.LoginDTO;
import com.uninassau.agenda.bean.form.LoginForm;
import com.uninassau.agenda.service.LoginService;
import com.uninassau.agenda.util.Dados;

@RestController
@RequestMapping ("/api/auth")
public class LoginResource {

	private LoginService loginService;
	
	public LoginResource(LoginService loginService) {
		this.loginService = loginService;
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public ResponseEntity<LoginDTO> login (@RequestBody LoginForm loginForm) {
		
		if (loginService.login(loginForm)) {
			return ResponseEntity.ok(new LoginDTO(Dados.NOME, Dados.LOGIN));
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

	
}
