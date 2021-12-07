package idat.edu.pe.TiendaVirtual.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.TiendaVirtual.jpa.model.Orden;

public interface OrdenRepository extends CrudRepository<Orden, Integer>{
	
	@Query(value = "SELECT a FROM Orden a WHERE a.numero =?1")
	public List<Orden> buscarOrdenPorNumero(String numero);
	
	@Query(value = "SELECT a FROM Orden a WHERE a.numero like CONCAT(?1, '%')")
	public List<Orden> buscarOrdenLikeNumero(String numero);

}
