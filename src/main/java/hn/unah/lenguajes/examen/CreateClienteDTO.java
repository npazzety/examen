package hn.unah.lenguajes.examen;


import hn.unah.lenguajes.examen.Entities.Cuentas;
import lombok.Data;

@Data

public class CreateClienteDTO {

    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    private Cuentas cuenta;

    
}
