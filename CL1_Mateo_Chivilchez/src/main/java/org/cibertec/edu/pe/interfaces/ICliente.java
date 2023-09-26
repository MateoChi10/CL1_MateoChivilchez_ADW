package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.entity.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICliente extends JpaRepository<cliente, Integer>{

}
