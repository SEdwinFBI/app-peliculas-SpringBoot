package edwin.mov.servicio;

import edwin.mov.tablas.Pelicula;

import java.util.List;

public interface InterfaceServicio {
    public List<Pelicula> listPelicula();
    public Pelicula buscarPelicula(Integer idPelicula);
    public Pelicula guardarPelicula(Pelicula pelicula);
    public void eliminarPelicula(Pelicula pelicula);




}
