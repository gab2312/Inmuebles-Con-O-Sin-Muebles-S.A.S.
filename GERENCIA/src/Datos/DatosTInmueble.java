/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.TInmueble;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAb
 */
public class DatosTInmueble 
{
 
    
    
    
    public static void insertAll(Connection conexion, TInmueble tInmueble) throws Exception
    {
        try
        {
            PreparedStatement stmt = conexion.prepareStatement( "INSERT INTO [dbo].[tInmueble]\n" +
                                                                                    "           ([idTipoInmueble]\n" +
                                                                                    "           ,[strDescipcion]\n" +
                                                                                    "           ,[idDuenion]\n" +
                                                                                    "           ,[stLlocalidad]\n" +
                                                                                    "           ,[stDdireccion]\n" +
                                                                                    "           ,[intCosto]\n" +
                                                                                    "           ,[intHabitaciones]\n" +
                                                                                    "           ,[intBanios]\n" +
                                                                                    "           ,[strResenia]\n" +
                                                                                    "           ,[intTamanio])\n" +
                                                                                    "     VALUES (?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, tInmueble.getIdTipoInmueble());
            stmt.setString(2, tInmueble.getStrDescripcion());
            stmt.setInt(3, tInmueble.getIdDuenion());
            stmt.setString(4, tInmueble.getStLlocalidad());
            stmt.setString(5, tInmueble.getStDidireccion());
            stmt.setLong(6, tInmueble.getIntCosto());
            stmt.setInt(7, tInmueble.getIntHabitaciones());
            stmt.setInt(8, tInmueble.getIntBanios());
            stmt.setString(9, tInmueble.getStrResenia());
            stmt.setInt(10, tInmueble.getIntTamanio());
            
            stmt.executeUpdate();
            
        }
        catch(SQLException ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
    
    public static List<TInmueble> get (Connection conexion) throws Exception
    {
        List<TInmueble> listaTInmueble = new ArrayList<>();
        String query = ""
                            + "SELECT T.[strDescripcionTipo], I.[strDescipcion], C.strNombres + ' ' + C.strApellidos AS strNombres, "
                            + "	intNumeroTelefonico, stlLocalidad, stDdireccion, intHabitaciones, intBanios, intTamanio, strResenia, intCosto "
                            + "    FROM dbo.tInmueble AS I INNER JOIN dbo.tCliente AS C ON I.idDuenion = C.idCliente "
                            + "		INNER JOIN [dbo].[tTipoInmueble] AS T ON I.idTipoInmueble = T.[idTipo]";
            
        TInmueble tInmueble = null;
        try
        {
            CallableStatement statement = null;
            
                statement = (CallableStatement) conexion.prepareCall(query);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                 tInmueble = new TInmueble
                        (
                                resultSet.getString("strDescipcion"), 
                                resultSet.getString("stlLocalidad"), 
                                resultSet.getString("stDdireccion"), 
                                resultSet.getInt("intCosto"), 
                                resultSet.getInt("intHabitaciones"), 
                                resultSet.getInt("intBanios"), 
                                resultSet.getString("strResenia"), 
                                resultSet.getInt("intTamanio"), 
                                resultSet.getString("strDescripcionTipo"), 
                                resultSet.getString("strNombres"),
                                resultSet.getInt("intNumeroTelefonico")
                        );
                
                listaTInmueble.add(tInmueble);
            }
        }
        catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
        finally
        {
            return listaTInmueble;
        }
    }
}
