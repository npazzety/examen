package hn.unah.lenguajes.examen.services.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes.examen.CreateClienteDTO;
import hn.unah.lenguajes.examen.Entities.Cliente;
import hn.unah.lenguajes.examen.Repositories.ClienteRepository;
import hn.unah.lenguajes.examen.services.ClienteService;

public class ClienteServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public List<Cliente> obtenerTodos() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }


    @Override
    public String crearCliente(CreateClienteDTO cliente) {
       if (this.clienteRepository.existsById(cliente.getDni())) {
        return "el cliente ya existe";
       }
       Cliente nvocliente = new Cliente();
       nvocliente.setDni(cliente.getDni());
       nvocliente.setNombre(cliente.getNombre());
       nvocliente.setApellido(cliente.getApellido());
       nvocliente.setCorreo(cliente.getCorreo());
       nvocliente.setTelefono(cliente.getTelefono());
       nvocliente.setCuenta(cliente.getCuenta());

       this.clienteRepository.save(nvocliente);

       return "cliente creado";
    }


    @Override
    public Optional<Cliente> obtenerClientePorDni(String dni) {
        return this.clienteRepository.findById(dni);
    }
    
}
