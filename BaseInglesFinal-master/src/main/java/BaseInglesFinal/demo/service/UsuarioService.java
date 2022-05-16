/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.service;

import BaseInglesFinal.demo.entity.Usuario;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface UsuarioService {
    
     public Usuario createUsuario(Usuario usuario);
    public List<Usuario> findAllUsuario();
    public Usuario saveUsuario(Usuario usuario);
    public void deleteUsuario(Usuario usuario);
    public Usuario findUsuario(Usuario usuario); 
    public Usuario findUsuarioById(Long id); 
    

}
