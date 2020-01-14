package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

	@Query("select u from Usuario u where u.nombreUsuario=?1 and u.passwordUsuario=?2")
	Usuario findByNombreEndsWith(String nombre, String password);
}
