package com.mitocode.repo;

import com.mitocode.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String nombre);
}
