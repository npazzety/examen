package hn.unah.lenguajes.examen.Entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cuentas")

public class Cuentas {

    @Column(name = "numerocuenta")
    @Id
    private String numeroCuenta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

    private double saldo;

    private boolean estado;

    private boolean sobregiro;

}
