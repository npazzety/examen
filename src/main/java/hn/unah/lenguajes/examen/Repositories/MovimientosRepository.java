package hn.unah.lenguajes.examen.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.examen.Entities.Movimientos;

public interface MovimientosRepository extends CrudRepository<Movimientos, Integer> {
    
}
