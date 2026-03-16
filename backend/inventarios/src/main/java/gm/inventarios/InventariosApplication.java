package gm.inventarios;

import gm.inventarios.modelo.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);
                
            Producto p = new Producto();
            p.setDescripcion("Camisa M"); 
            p.setPrecio(600.0);
            p.setExistencia(30);
            
            System.out.println(p);
                
                
	}
        
        
}
