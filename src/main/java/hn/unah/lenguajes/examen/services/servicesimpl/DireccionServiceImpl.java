package hn.unah.lenguajes.examen.services.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes.examen.Entities.Direccion;
import hn.unah.lenguajes.examen.Repositories.DireccionRepository;
import hn.unah.lenguajes.examen.services.DireccionService;

public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public String crearDireccion(Direccion direccion) {
        this.direccionRepository.save(direccion);

        
    } return "Direccion creada"



    
}
