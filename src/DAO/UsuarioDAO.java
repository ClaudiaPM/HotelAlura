/**
 * 
 * @author Claudia_Padilla
 */

package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Usuario;



public class UsuarioDAO {

    private final Connection con;

    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    /**
     * Ejecuta una sentencia SELECT en MySQL 
     */
    public List<Usuario> listar() {
        List<Usuario> listarUsuarios = new ArrayList<>();
        String sql = "SELECT id, nombre, clave "
                + "FROM Usuarios";
        try {
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()) {
                    Usuario fila = new Usuario(
                            resultSet.getInt("ID_USUARIO"),
                            resultSet.getString("NOMBRE"),
                            resultSet.getString("CLAVE")
                    );
                    listarUsuarios.add(fila);
                }
                return listarUsuarios;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Inténtelo más tarde.",
                    "Error al traer los datos.",
                    JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException(e);
        }
    }

    /**
     * Ejecuta una sentencia MySQL con parámetro LIKE,.
     */
    public List<Usuario> listar(String categoriaUsuario) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            String sql = "SELECT\n"
                    + "id, nombre, clave\n"
                    + "FROM Usuarios\n"
                    + "WHERE nombre LIKE ?";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.setString(1, categoriaUsuario.concat("%"));
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()) {
                    Usuario fila = new Usuario(
                            resultSet.getInt("ID_USUARIO"),
                            resultSet.getString("NOMBRE"),
                            resultSet.getString("CLAVE")
                    );
                    listaUsuarios.add(fila);
                }
                return listaUsuarios;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Inténtelo más tarde.",
                    "Error al traer los datos.",
                    JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException(e);
        }
    }

    /**
     * Método para consultar la categoría del usuario acorde al usuario y
     * contraseña.
     *
     * @param nombreUsuario - Nombre del usuario.
     * @param password - Contraseña del usuario.
     * @return - Retorna una lista con la coincidencia de parámetros con la Base
     * de Datos.
     */
    public List<Usuario> listar(String nombreUsuario, String password) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            String sql = "SELECT nombre, clave "
                    + "FROM Usuarios "
                    + "WHERE nombre = ? AND clave = ?";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.setString(1, nombreUsuario);
                preparedStatement.setString(2, password);
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()) {
                    Usuario fila = new Usuario(
                            resultSet.getString("NOMBRE"),
                            resultSet.getString("CLAVE")
                    );
                    listaUsuarios.add(fila);
                }
                return listaUsuarios;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Inténtelo más tarde.",
                    "Error al obtener los datos.",
                    JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException(e);
        }
    }

    /**
     * Permite almacenar el modelo de datos de Usuario
     */
    public void guardar(Usuario usuario) {
        try {
            String sql = "INSERT INTO Usuarios (nombre, clave)"
                    + "VALUES (?, ?)";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
                preparedStatement.setString(1, usuario.getNombreUsuario());
               //  preparedStatement.setString(2, usuario.getCategoriaUsuario());
                preparedStatement.setString(2, usuario.getPassword());
                preparedStatement.execute();
                try ( ResultSet resultSet = preparedStatement.getGeneratedKeys();) {
                    while (resultSet.next()) {
                        System.out.println(
                                String.format("Fue ingresado el usuario: %s", usuario)
                        );
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar el registro.", "Error al guardar los datos.", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    /**
     * Realiza la actualización 
     */
    public int actualizar(Integer idUsuario, String nombreUsuario, String password) {
        try {
            String sql = "UPDATE Usuarios "
                    + "SET nombre = ?,  clave = ? "
                    + "WHERE id = ?";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.setString(1, nombreUsuario);
                preparedStatement.setString(2, password);
                preparedStatement.setInt(3, idUsuario);
                preparedStatement.execute();
                int updateCount = preparedStatement.getUpdateCount();
                return updateCount;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro.");
            throw new RuntimeException(e);
        }
    }

    /**
     * Ejecuta una sentencia DELETE 
     */
    public int eliminar(Integer idUsuario) {
        try {
            String sql = "DELETE FROM Usuarios WHERE id = ?";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.setInt(1, idUsuario);
                preparedStatement.execute();
                int updateCount = preparedStatement.getUpdateCount();
                return updateCount;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null, "Error al eliminar los datos.",
                    "Inténtelo más tarde.",
                    JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException(e);
        }
    }
}
