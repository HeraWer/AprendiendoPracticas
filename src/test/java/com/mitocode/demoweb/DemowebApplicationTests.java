package com.mitocode.demoweb;

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemowebApplicationTests {

    @Autowired
    private IUsuarioRepo repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    void crearUsuarioTest() {
        Usuario us = new Usuario();
        us.setId(1);
        us.setNombre("mito");
        us.setClave(encoder.encode("123"));
        Usuario retorno = repo.save(us);

        assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
    }

}
