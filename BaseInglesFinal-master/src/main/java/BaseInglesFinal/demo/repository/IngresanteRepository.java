/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.repository;

import BaseInglesFinal.demo.entity.Ingresante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jorge
 */
@Repository
public interface IngresanteRepository  extends JpaRepository<Ingresante, Long>{
    @Query("SELECT a FROM Ingresante a WHERE a.numDoc=:doc")
    Ingresante findByNumDoc(@Param("doc") String doc);
}

