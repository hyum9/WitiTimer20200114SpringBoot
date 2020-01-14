package com.example.demo.contracts;

import java.util.List;

import com.example.demo.entity.Usuario;

public interface IUsuarioContract {
	
	public List<Usuario>findAll();
	public Usuario findByNombreEndsWith(String nombre, String password);
	public Usuario findById(Long Id);
	public Usuario save(Usuario usuario);
	public void delete(Long id);

}
