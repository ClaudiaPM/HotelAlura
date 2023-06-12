/**
 * 
 * @author Claudia_Padilla
 */

package Controller;

import java.sql.Date;
import java.util.List;
import DAO.ReservaDAO;
import Factory.ConnectionFactory;
import Modelo.Reserva;



public class ReservaController {

    private final ReservaDAO reservaDAO;

    
    /**
     * Creando conexion para MySQL con la tabla de reservas.
     */
    public ReservaController() {
        this.reservaDAO = new ReservaDAO(new ConnectionFactory().realizarConexion());
    }

    /**
     * Obteniendo el listado de huespedes.
     *
     */
    public List<Reserva> listar() {
        return reservaDAO.listar();
    }

    /**
     * Permite consultar las reservas acorde al idReserva.
     */
    public List<Reserva> listar(String idReserva) {
        return reservaDAO.listar(idReserva);
    }

    /**
     * Almacenando la información 
     */
    public void guardar(Reserva reserva) {
        reservaDAO.guardar(reserva);
    }

    
    public int actualizar(String idReserva, Date fechaEntrada,
            Date fechaSalida, double valorReserva, String formaPago) {
        return reservaDAO.actualizar(idReserva, fechaEntrada, fechaSalida, valorReserva, formaPago);
    }
}
