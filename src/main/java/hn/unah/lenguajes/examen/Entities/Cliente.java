package hn.unah.lenguajes.examen.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cliente")

public class Cliente {

    @Id
    @Column(name = "dni")
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    @OneToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Direccion direccion;

    @JoinColumn(name = "dni", referencedColumnName = "name")
    private Cuentas cuenta;

}
