package com.duoc.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.duoc.api.modelo.Producto;
import com.duoc.api.repository.IORepositoryProducto;

@SpringBootTest
class ApiApplicationTests {

	@Autowired
	private IORepositoryProducto repoProducto;
	
	
	@Test
	void contextLoads() {
		
		Producto p1= new Producto();
		p1.setNombre("lapiz");
		p1.setPrecio(990);
		Producto p2= new Producto();
		p2.setNombre("regla");
		p2.setPrecio(790);
		repoProducto.save(p1);
		repoProducto.save(p2);
		
	}

}
