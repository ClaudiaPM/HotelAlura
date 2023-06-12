/**
 * 
 * @author Claudia_Padilla
 */

package Controller;

import java.sql.Date;
import java.util.List;
import DAO.HuespedDAO;
import Factory.ConnectionFactory;
import Modelo.Huesped;



public class HuespedController {

    private final HuespedDAO huespedDAO;

    /**
     * Creando conexion para operaciones con MySQL.
     */
    public HuespedController() {
        this.huespedDAO = new HuespedDAO(new ConnectionFactory().realizarConexion());
    }

    
    public List<Huesped> listar() {
        return huespedDAO.listar();
    }

    
    
    public List<Huesped> listar(String nombre) {
        return huespedDAO.listar(nombre);
    }

   
    public void guardar(Huesped huesped, String idReserva) {
        huesped.setIdReserva(idReserva);
        huespedDAO.guardar(huesped);
    }

  
    public int actualizar(Integer idHuesped, String nombre, String apellido, Date fechaNacimiento,
            String nacionalidad, String telefono) {
        return huespedDAO.actualizar(idHuesped, nombre, apellido, fechaNacimiento, nacionalidad, telefono);
    }

  
    
    public int eliminar(Integer idHuesped, String idReserva) {
        return huespedDAO.eliminar(idHuesped, idReserva);
    }
}
