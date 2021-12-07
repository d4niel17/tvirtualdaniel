package idat.edu.pe.TiendaVirtual.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.TiendaVirtual.jpa.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	@Query(value = "SELECT a FROM Usuario a WHERE a.nombre =?1")
	public List<Usuario> buscarUsuariosPorNombre(String nombre);
	
	@Query(value = "SELECT a FROM Usuario a WHERE a.nombre like CONCAT(?1, '%')")
	public List<Usuario> buscarUsuarioLikeNombre(String nombre);
}
