package hn.unah.lenguajes.examen.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen.CreateClienteDTO;
import hn.unah.lenguajes.examen.Entities.Cliente;
import hn.unah.lenguajes.examen.services.servicesimpl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/banco/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping("/obtener/{dni}")
    public Optional<Cliente> buscarClienteDni(@PathVariable String dni) {
        return this.clienteServiceImpl.obtenerClientePorDni(dni)  ;
    }

    @PostMapping("/crear")
    public String guardar(@RequestBody CreateClienteDTO cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }
    
    
}
