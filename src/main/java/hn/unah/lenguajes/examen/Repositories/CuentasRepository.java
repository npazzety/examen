package hn.unah.lenguajes.examen.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.examen.Entities.Cuentas;

public interface CuentasRepository extends CrudRepository<Cuentas, String> {
    
}
