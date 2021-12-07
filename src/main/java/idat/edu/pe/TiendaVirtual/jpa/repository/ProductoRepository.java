package idat.edu.pe.TiendaVirtual.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.TiendaVirtual.jpa.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
