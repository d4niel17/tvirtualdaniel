package idat.edu.pe.TiendaVirtual.jpa.model;

import java.io.Serializable;
import java.util.Date;

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
@Table( name = "ordenes")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Orden.findAll", query = "SELECT o FROM Orden o"),
	@NamedQuery(name = "Orden.findById", query = "SELECT o FROM Orden o WHERE o.id= :id"),
	@NamedQuery(name = "Orden.findByNumero", query = "SELECT o FROM Orden o WHERE o.numero = :numero"),
	@NamedQuery(name = "Orden.findByFechaCreacion", query = "SELECT o FROM Orden o WHERE o.fechaCreacion = :fechaCreacion"),
	@NamedQuery(name = "Orden.findByTotal", query = "SELECT o FROM Orden o WHERE o.total = :total")
})
public class Orden implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "numero")
	private String numero;
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;	
	@Column(name = "total")
	private double total;
	
	@JoinColumn(name = "usuarios", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Usuario usuario;
	
	
	
	
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		
		this.total = total;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", total=" + total
				+ ", usuario=" + usuario + "]";
	}


	



	
	
	
	
	

}
