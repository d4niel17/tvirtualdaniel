package idat.edu.pe.TiendaVirtual.jpa.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "detalles")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "DetalleOrden.findAll", query = "SELECT d FROM DetalleOrden d"),
	@NamedQuery(name = "DetalleOrden.findById", query = "SELECT d FROM DetalleOrden d WHERE d.id =:id"),
	@NamedQuery(name = "DetalleOrden.findByNombre", query = "SELECT d FROM DetalleOrden d WHERE d.nombre =:nombre"),
	@NamedQuery(name = "DetalleOrden.findByCantidad", query = "SELECT d FROM DetalleOrden d WHERE d.cantidad =:cantidad"),
	@NamedQuery(name = "DetalleOrden.findByPrecio", query = "SELECT d FROM DetalleOrden d WHERE d.precio =:precio"),
	@NamedQuery(name = "DetalleOrden.findByTotal", query ="SELECT d FROM DetalleOrden d WHERE d.total =:total")
})
public class DetalleOrden implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cantidad")
	private double cantidad;
	@Column(name = "precio")
	private double precio;
	@Column(name = "total")
	private double total;
	
	
	@JoinColumn(name = "orden", referencedColumnName = "id")
	@ManyToOne
	private Orden orden;
	
	@JoinColumn(name = "productos", referencedColumnName = "id")
	@ManyToOne
	private Producto producto;
	
	
	public DetalleOrden() {
		// TODO Auto-generated constructor stub
	}

	public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	
	

}
