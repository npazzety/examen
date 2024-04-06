package hn.unah.lenguajes.examen.services.servicesimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes.examen.CreateMovimientoDTO;
import hn.unah.lenguajes.examen.Entities.Movimientos;
import hn.unah.lenguajes.examen.Repositories.MovimientosRepository;
import hn.unah.lenguajes.examen.services.MovimientosService;

public class MovimientosServiceImpl implements MovimientosService {

    @Autowired
    private MovimientosRepository movimientosRepository;

    @Override
    public String crearMovimiento(CreateMovimientoDTO movimiento) {
        if (this.movimientosRepository.existsById(movimiento.getNumeroCuenta())) {
            
            Movimientos nvomovimiento = this.movimientosRepository.findById(movimiento.getNumeroCuenta().get())
            nvomovimiento .setIdMovimiento(0);

            
        }

        return "No existe el numero de cuenta"; 
    }

    @Override
    public Optional<Movimientos> obtenerMovimientos(Integer numeroCuenta) {
        return this.movimientosRepository.findById(numeroCuenta);
    }

}


