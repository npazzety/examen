package hn.unah.lenguajes.examen.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.examen.Entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{
    
}
