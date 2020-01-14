package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.contracts.IUsuarioContract;
import com.example.demo.entity.Usuario;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	private IUsuarioContract _usuarioContract;
	
	@PostMapping("/usuarios/login")
	public Usuario login(@RequestBody Usuario usuario) {
		
		Usuario u = _usuarioContract.findByNombreEndsWith(usuario.getNombreUsuario(), usuario.getPasswordUsuario());
		if(u!=null)
		{
			return u;
		}
		Usuario us = new Usuario();
		us.setNombre("No existe");
		return us;
	}
	
	
	
	

}
