package edwin.mov.restcontroler;

import edwin.mov.servicio.InterfaceServicio;
import edwin.mov.tablas.Pelicula;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"https://pelis-umg.netlify.app", "http://localhost:3000"})
@RequestMapping("edwin-pelis-api")
@RestController
public class controlador {
    private static final Logger logger = LoggerFactory.getLogger(controlador.class);

    @Autowired
    private InterfaceServicio inServicio;

    @GetMapping(value = "/pelis")//end point
    public List<Pelicula> obtenerPelis() {
        List<Pelicula> peliculas = inServicio.listPelicula();
        peliculas.forEach((pelicula -> logger.info(peliculas.toString())));
        return peliculas;
    }
}
