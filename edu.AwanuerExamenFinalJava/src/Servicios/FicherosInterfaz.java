package Servicios;

import java.util.List;

import Dtos.CitasDtos;
import Dtos.ClientesDtos;
/**
 * Interfaz que almacena todos los metodos de la implementacion relacionada con los ficheros
 * awb
 */
public interface FicherosInterfaz {
	/**
	 * Metodo implementado que imprimira en un fichero las citas de un dia especifico
	 * awb
	 * @param listaCitas
	 */
	public void imprimirCitas( List<CitasDtos> listaCitas, List<ClientesDtos> listaClientes);
	/**
	 * Metodo que se encargara de recoger los datos de una lista y los guardara en un fichero log
	 * awb
	 * @param listaLog
	 */
	public void ficheroLog(List<String> listaLog);
		
}
