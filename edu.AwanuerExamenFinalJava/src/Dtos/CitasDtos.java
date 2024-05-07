package Dtos;

import java.util.Date;
/**
 * Dtos relevante a las citas
 * awb
 */
public class CitasDtos {
	
	
	//Datos de las citas para CitaDtos
	String nombreCompletoCliente = "aaaaa";
	


	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}
	String dniCliente = "aaaaa";
	String especialidad = "aaaaa";
	String fechaHoraCita;
	
	


	public void setFechaHoraCita(String fechaHoraCita) {
		this.fechaHoraCita = fechaHoraCita;
	}


	/**
	 * Constructor vacio
	 */
	public CitasDtos() {
		super();
	}
	
	
	/**
	 * Getter y setters
	 * awb
	 * @return
	 */
	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getFechaHoraCita() {
		return fechaHoraCita;
	}
}