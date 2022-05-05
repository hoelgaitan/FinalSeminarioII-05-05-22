package com.undec.gedufy.repository;

import com.undec.gedufy.model.Contacto;
import com.undec.gedufy.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {


}
