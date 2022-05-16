/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.service;

import BaseInglesFinal.demo.entity.Usuario;
import BaseInglesFinal.demo.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jorge
 */
public class UsuarioServiceIMPL implements UsuarioService{
@Autowired
private UsuarioRepository ur;
    @Override
    public Usuario createUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> findAllUsuario() {
     return (List<Usuario>)ur.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
    return ur.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
    ur.delete(usuario);
    }

    @Override
    public Usuario findUsuario(Usuario usuario) {
    return ur.findById(usuario.getId()).orElse(null);
    }

    @Override
    public Usuario findUsuarioById(Long id) {
     return ur.findById(id).orElse(null);
    }
    
}
