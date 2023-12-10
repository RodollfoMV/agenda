package com.uninassau.agenda.service;

import org.springframework.stereotype.Service;

import com.uninassau.agenda.bean.form.LoginForm;
import com.uninassau.agenda.util.Dados;

@Service
public class LoginService {

	
	public boolean login (LoginForm loginForm) {
		
		if (loginForm.getLogin().equals(Dados.LOGIN) && 
				loginForm.getSenha().equals(Dados.PASSWORD)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
		
	}
	
	
}
