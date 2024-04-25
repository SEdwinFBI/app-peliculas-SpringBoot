package edwin.mov.tablas;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pelicula {
    @Id //llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera automaticamente la llave primaria
    Integer idPelicula;
    String titulo;
    String descripcion;
    String genero;
    String urlImg;
    Double duracion;

}
