package com.duoc.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.api.modelo.Producto;
import com.duoc.api.repository.IORepositoryProducto;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoRestController {

	@Autowired
	private IORepositoryProducto repoProducto;

	@GetMapping
	public List<Producto> listar() {
		return repoProducto.findAll();
	}

	@PostMapping
	public void agregar(Producto pro) {
		repoProducto.save(pro);
	}

	@DeleteMapping
	public void eliminar(int id) {
repoProducto.deleteById(id);
	}

	@PutMapping
	public void modificar(Producto pro) {

		repoProducto.save(pro);
	}
}
