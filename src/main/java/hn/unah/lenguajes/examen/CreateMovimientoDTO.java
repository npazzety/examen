package hn.unah.lenguajes.examen;

import lombok.Data;

@Data
public class CreateMovimientoDTO {

    private int numeroCuenta;

    private int tipoMovimiento;

    private double monto;

}
