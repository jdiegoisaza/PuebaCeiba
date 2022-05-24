package com.ceiba.examen.controller;

import com.ceiba.examen.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value="prueba")
    public Usuario getUsuario(){
        Usuario usuario= new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Isaza");
        usuario.setTelefono("3012951921");
        usuario.setEmail("jdiego.isaza@udea.edu.co");
        usuario.setPassword("123456");
        return usuario;
    }
    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario= new Usuario();
        usuario.setId(id);
        usuario.setNombre("Juan");
        usuario.setApellido("Isaza");
        usuario.setTelefono("3012951921");
        usuario.setEmail("jdiego.isaza@udea.edu.co");
        usuario.setPassword("123456");
        return usuario;
    }
}
