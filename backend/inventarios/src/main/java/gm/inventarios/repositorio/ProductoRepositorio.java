package gm.inventarios.repositorio;

import gm.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    // Esta interface se especifica la clase de entidad y la llave primaria (INT)
    
}
