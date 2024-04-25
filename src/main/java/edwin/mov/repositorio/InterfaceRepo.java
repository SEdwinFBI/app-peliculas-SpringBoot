package edwin.mov.repositorio;

import edwin.mov.tablas.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceRepo extends JpaRepository<Pelicula,Integer> {
}
