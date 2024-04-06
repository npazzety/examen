package hn.unah.lenguajes.examen.services;

import java.util.Optional;

import hn.unah.lenguajes.examen.CreateMovimientoDTO;
import hn.unah.lenguajes.examen.Entities.Movimientos;

public interface MovimientosService {

    public String crearMovimiento(CreateMovimientoDTO movimiento);

    public Optional<Movimientos> obtenerMovimientos(Integer numeroCuenta);
    
}
