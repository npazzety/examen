package hn.unah.lenguajes.examen.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.examen.Modelos.Cancion;

public interface CancionRepository extends CrudRepository<Cancion,String> {
    
}
