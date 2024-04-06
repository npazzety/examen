package hn.unah.lenguajes.examen.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "direccion")

public class Direccion {


    @Column(name = "iddireccion")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDireccion;

    @JoinColumn(name = "dni", referencedColumnName = "dni")
    @OneToOne
    private Cliente cliente;

    private String estado;

    private String ciudad;

    private String calle;
    
}
