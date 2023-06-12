/**
 * 
 * @author Claudia_Padilla
 */

package Controller;

import java.util.List;
import DAO.UsuarioDAO;
import Factory.ConnectionFactory;
import Modelo.Usuario;

/**
 * Clase que posee todas las acciones de operación entre la capa View y la capa
 * DAO.
 * 
 */
public class UsuarioController {

    private final UsuarioDAO usuarioDAO;

    /**
     * Creando conexion para MySQL con la tabla de usuarios.
     */
    public UsuarioController() {
        this.usuarioDAO = new UsuarioDAO(new ConnectionFactory().realizarConexion());
    }

   
    
    public List<Usuario> listar() {
        return usuarioDAO.listar();
    }

    /**
     * Permite consultar los usuarios acorde al nombre de usuario.
     */
    public List<Usuario> listar(String nombreUsuario) {
        return usuarioDAO.listar(nombreUsuario);
    }

 
    
    public List<Usuario> listar(String nombreUsuario, String password) {
        return usuarioDAO.listar(nombreUsuario, password);
    }

    
    
    public void guardar(Usuario usuario) {
        usuarioDAO.guardar(usuario);
    }

  
    
    public int actualizar(Integer idUsuario, String nombreUsuario,
            /*String categoriaUsuario,*/ String password) {
        return usuarioDAO.actualizar(idUsuario, nombreUsuario, password);
    }

   
    
    public int eliminar(Integer IdUsuario) {
        return usuarioDAO.eliminar(IdUsuario);
    }
}
