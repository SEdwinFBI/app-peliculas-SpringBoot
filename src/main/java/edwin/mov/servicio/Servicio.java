package edwin.mov.servicio;

import edwin.mov.repositorio.InterfaceRepo;
import edwin.mov.tablas.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Servicio implements InterfaceServicio{

    @Autowired
    private InterfaceRepo repositorio;


    @Override
    public List<Pelicula> listPelicula() {
        return repositorio.findAll();
    }

    @Override
    public Pelicula buscarPelicula(Integer idPelicula) {
        Pelicula pelicula = repositorio.findById(idPelicula).orElse(null);
        return pelicula;
    }

    @Override
    public Pelicula guardarPelicula(Pelicula pelicula) {

        return repositorio.save(pelicula);
    }

    @Override
    public void eliminarPelicula(Pelicula pelicula) {
        repositorio.delete(pelicula);
    }
}
