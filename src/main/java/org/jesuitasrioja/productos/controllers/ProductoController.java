package org.jesuitasrioja.productos.controllers;

import java.util.List;
import java.util.Optional;

import org.jesuitasrioja.productos.modelo.producto.Producto;
import org.jesuitasrioja.productos.persistencia.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {


	@GetMapping("/productos")
	public ResponseEntity<?> allProducts() {

	}
	
	
	@GetMapping("/producto/{id}")
	public ResponseEntity<?> getProducto(@PathVariable String id) {

	}

	@GetMapping("/producto")
	public ResponseEntity<?> getProducto2(@RequestParam String id) {


	}

	@PostMapping("/producto")
	public ResponseEntity<?> postProducto(@RequestBody Producto nuevoProducto) {

	}

	@PutMapping("/producto")
	public ResponseEntity<?>  putProducto(@RequestBody Producto editadoProducto) {

	}

	@DeleteMapping("/producto/{id}")
	public ResponseEntity<?>  deleteProducto(@PathVariable String id) {

	}

}
