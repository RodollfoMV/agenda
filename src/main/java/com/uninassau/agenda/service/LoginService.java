package com.uninassau.agenda.service;

import org.springframework.stereotype.Service;

import com.uninassau.agenda.bean.dto.LoginDTO;
import com.uninassau.agenda.bean.form.LoginForm;
import com.uninassau.agenda.util.Dados;

@Service
public class LoginService {

	
	public LoginDTO login (LoginForm loginForm) {
		
		if (loginForm.getLogin().equals(Dados.LOGIN1) && loginForm.getSenha().equals(Dados.PASSWORD1)) {
			return new LoginDTO(Dados.NOME1, Dados.LOGIN1);
		} else if (loginForm.getLogin().equals(Dados.LOGIN2) && loginForm.getSenha().equals(Dados.PASSWORD2)) {
			return new LoginDTO(Dados.NOME2, Dados.LOGIN2);
		} else {
			throw new SecurityException();
		}
		
	}
	
}
