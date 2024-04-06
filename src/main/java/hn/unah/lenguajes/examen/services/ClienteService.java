package hn.unah.lenguajes.examen.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes.examen.CreateClienteDTO;
import hn.unah.lenguajes.examen.Entities.Cliente;

public interface ClienteService {

    public String crearCliente(CreateClienteDTO cliente);

    public List<Cliente> obtenerTodos();

    public Optional<Cliente> obtenerClientePorDni(String dni);

}
