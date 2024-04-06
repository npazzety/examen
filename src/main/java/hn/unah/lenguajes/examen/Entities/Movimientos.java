package hn.unah.lenguajes.examen.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "movimientos")
@Entity
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private int idMovimiento;


    @JoinColumn(name = "numercuenta", referencedColumnName = "numerocuenta")
    @ManyToOne
    @Id
    private Cuentas cuentas;

    @Column(name = "tipomovimiento")
    private char tipoMovimiento;

    private double monto;

    @Column(name = "fechamovimiento")
    private Date fechaMovimiento;

}
