package Dtos;
import java.util.Date;

public class ClientesDtos {
	//Variables de los clientes
	int idCliente = 99999;
	
	String dni = "aaaaa";
	String nombreCompleto = "aaaaa";
	boolean validado = false;
	Date fecha;
	
	/**
	 * Constructor de Dtos clientes
	 * awb
	 * @param int
	 * @param dni
	 * @param nombreCompleto
	 * @param validado
	 * @param fecha
	 */
	public ClientesDtos(int idCliente, String dni, String nombreCompleto, boolean validado, Date fecha) {
		super();
		this.idCliente = idCliente;
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.validado = validado;
		this.fecha = fecha;
	}
	
	/**
	 * Constructor vacio 
	 * awb
	 */
	public ClientesDtos() {
		
	}

	/**
	 * Getters and setters
	 * awb
	 * @return
	 */
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public boolean isValidado() {
		return validado;
	}
	public void setValidado(boolean validado) {
		this.validado = validado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

}
