package hn.unah.lenguajes.examen.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen.Entities.Movimientos;
import hn.unah.lenguajes.examen.services.servicesimpl.MovimientosServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/banco/movimientos")
public class MovimientosController {

    @Autowired
    private MovimientosServiceImpl movimientosServiceImpl;

    @GetMapping("/obtenerXcuenta")
    public Optional<Movimientos> obtenerXcuenta(@RequestParam String numeroCuenta) {
        return this.movimientosServiceImpl.obtenerMovimientos(numeroCuenta);
    }
    
    
}
