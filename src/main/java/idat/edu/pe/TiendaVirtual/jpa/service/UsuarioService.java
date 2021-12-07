package idat.edu.pe.TiendaVirtual.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.TiendaVirtual.jpa.model.Usuario;
import idat.edu.pe.TiendaVirtual.jpa.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public UsuarioService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Usuario> buscarTodo(){
		return (List<Usuario>) repository.findAll();
	}
	
	public Usuario buscarPorID(Integer id) {
		return repository.findById(id).get();
	}

}
