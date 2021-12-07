package idat.edu.pe.TiendaVirtual.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.TiendaVirtual.jpa.model.Orden;
import idat.edu.pe.TiendaVirtual.jpa.service.OrdenService;

@RestController
@RequestMapping("/rest/ordenes")
public class OrdenRestController {
	
	@Autowired
	private OrdenService service;
	
	@GetMapping
	public ResponseEntity<Object> buscarTodo() {
		
		List<Orden> listorden = service.buscarTodo();
		return new ResponseEntity<>(listorden, HttpStatus.OK);
	}

}
