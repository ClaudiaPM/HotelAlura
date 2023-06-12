/**
 * 
 * @author Claudia_Padilla
 */

package DAO;

import Modelo.Huesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class HuespedDAO {

    private final Connection con;

    public HuespedDAO(Connection con) {
        this.con = con;
    }

 
    
    public List<Huesped> listar() {
        List<Huesped> listaHuespedes = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido, fecha_nacimiento, nacionalidad, telefono, id_reserva "
                + "FROM Huespedes";
        try {
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()) {
                    Huesped fila = new Huesped(
                            resultSet.getInt("ID_HUESPED"),
                            resultSet.getString("NOMBRE"),
                            resultSet.getString("APELLIDO"),
                            resultSet.getDate("FECHA_NACIMIENTO"),
                            resultSet.getString("NACIONALIDAD"),
                            resultSet.getString("TELEFONO"),
                            resultSet.getString("ID_RESERVA")
                    );
                    listaHuespedes.add(fila);
                }
                return listaHuespedes;
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

  
    
    public List<Huesped> listar(String apellido) {
        List<Huesped> listaHuespedes = new ArrayList<>();
        try {
            String sql = "SELECT\n"
                    + "id, nombre, apellido, fecha_nacimiento,\n"
                    + "nacionalidad, telefono, id_reserva\n"
                    + "FROM Huespedes\n"
                    + "WHERE nombre LIKE ?";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.setString(1, apellido.concat("%"));
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()) {
                    Huesped fila = new Huesped(
                            resultSet.getInt("ID_HUESPED"),
                            resultSet.getString("NOMBRE"),
                            resultSet.getString("APELLIDO"),
                            resultSet.getDate("FECHA_NACIMIENTO"),
                            resultSet.getString("NACIONALIDAD"),
                            resultSet.getString("TELEFONO"),
                            resultSet.getString("ID_RESERVA")
                    );
                    listaHuespedes.add(fila);
                }
                return listaHuespedes;
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

  
    
    public void guardar(Huesped huesped) {
        try {
            String sql = "INSERT INTO Huespedes "
                    + "(nombre, apellido, fecha_nacimiento, nacionalidad, telefono, id_reserva) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
                preparedStatement.setString(1, huesped.getNombre());
                preparedStatement.setString(2, huesped.getApellido());
                preparedStatement.setDate(3, huesped.getFechaNacimiento());
                preparedStatement.setString(4, huesped.getNacionalidad());
                preparedStatement.setString(5, huesped.getTelefono());
                preparedStatement.setString(6, huesped.getIdReserva());
                preparedStatement.execute();
                try ( ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                    while (resultSet.next()) {
                        huesped.setIdHuesped(resultSet.getInt(1));
                        System.out.println(
                                String.format("Fue guardado con éxito el "
                                        + "húesped: %s", huesped)
                        );
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error al realizar el registro.",
                    "Error al guardar los datos.",
                    JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException(e);
        }
    }


    
    public int actualizar(Integer idHuesped, String nombre, String apellido, Date fechaNacimiento,
            String nacionalidad, String telefono) {
        try {
            String sql = "UPDATE Huespedes "
                    + "SET nombre = ?, apellido = ?, fecha_nacimiento = ?, "
                    + "nacionalidad = ?, telefono = ? "
                    + "WHERE id = ?";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, apellido);
                preparedStatement.setDate(3, fechaNacimiento);
                preparedStatement.setString(4, nacionalidad);
                preparedStatement.setString(5, telefono);
                preparedStatement.setInt(6, idHuesped);
                preparedStatement.execute();
                int updateCount = preparedStatement.getUpdateCount();
                return updateCount;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null, "Error al actualizar los datos.",
                    "Inténtelo más tarde.",
                    JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException(e);
        }
    }

    
    
    
    public int eliminar(Integer idHuesped, String idReserva) {
        try {
            String sql = "DELETE FROM Huespedes WHERE id = ?";
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                preparedStatement.setInt(1, idHuesped);
                preparedStatement.execute();
                eliminarReserva(idReserva);
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

    private void eliminarReserva(String idReserva) {
        String sql = "DELETE FROM Reservas WHERE id = ?";
        try {
            try ( PreparedStatement preparedStatement = con.prepareStatement(sql);) {
                preparedStatement.setString(1, idReserva);
                preparedStatement.execute();
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
