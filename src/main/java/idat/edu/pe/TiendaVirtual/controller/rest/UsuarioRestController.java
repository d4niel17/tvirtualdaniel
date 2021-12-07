package idat.edu.pe.TiendaVirtual.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import idat.edu.pe.TiendaVirtual.jpa.model.Usuario;
import idat.edu.pe.TiendaVirtual.jpa.service.UsuarioService;



@RestController
@RequestMapping("/rest/usuarios")
public class UsuarioRestController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<Object> buscarTodo() {

		List<Usuario> listausuarios = service.buscarTodo();
		return new ResponseEntity<>(listausuarios, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") int id) {
		Usuario usuario = service.buscarPorID(id);
		if (usuario == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Funcion no encontrada,id porporcionado no es correcto");
		return new ResponseEntity<Object>(usuario, HttpStatus.OK);

	}

}
