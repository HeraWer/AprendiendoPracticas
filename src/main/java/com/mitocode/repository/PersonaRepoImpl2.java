package com.mitocode.repository;

import com.mitocode.demoweb.DemoWebApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepo{

    private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("NO SE REGISTRO A " + nombre);
    }
}
