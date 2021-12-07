package idat.edu.pe.TiendaVirtual.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.TiendaVirtual.jpa.model.Orden;
import idat.edu.pe.TiendaVirtual.jpa.repository.OrdenRepository;

@Service
@Transactional
public class OrdenService {
	
	@Autowired
	private OrdenRepository repository;
	
	public OrdenService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Orden> buscarTodo(){
		return (List<Orden>) repository.findAll();
	}
	
	public Orden buscarPorID(Integer id) {
		return repository.findById(id).get();
	}
	

}
