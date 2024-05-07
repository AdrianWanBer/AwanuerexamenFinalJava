package Servicios;
import java.util.List;
import Controladores.*;
import Dtos.*;
/**
 * Interfaz que implementa los metodos de la operativa
 * awb
 */
public interface OperativaInterfaz {

	/**
	 * Metodo de la implementacion encargado de la creacion de los clientes
	 * awb
	 * @param listaClientes
	 */
	public void registroDeCliente(List<ClientesDtos> listaClientes);
	
	/**
	 * Metodo que se encargara de poder validar los usuarios nuevo que no lo esten
	 * awb
	 * @param listaClientes
	 */
	public void validacionCliente(List<ClientesDtos> listaClientes);
	 /**
	  * Metodo de la solicutud medica que realizara la creacion de una para un usuario validado
	  * @param listaClientes
	  * @param listaCitas
	  */
	public void solicitudCitaMedica(List<ClientesDtos> listaClientes, List<CitasDtos> listaCitas);
	
}
