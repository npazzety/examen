package hn.unah.lenguajes.examen.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cancion")

public class Cancion {

    private String nombre;

}
