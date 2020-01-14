package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.contracts.IUsuarioContract;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioContract{

	@Autowired
	private IUsuarioRepository _usuarioRepository;
	
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>)_usuarioRepository.findAll();
	}

	@Override
	public Usuario findByNombreEndsWith(String nombre, String password) {
		// TODO Auto-generated method stub
		return _usuarioRepository.findByNombreEndsWith(nombre, password);
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return _usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return _usuarioRepository.save(usuario);
	}

	@Override
	public void delete(Long id) {
		_usuarioRepository.deleteById(id);	
	}


}
