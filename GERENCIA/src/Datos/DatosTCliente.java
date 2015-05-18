/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.TCliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author GAb
 */
public class DatosTCliente 
{

    public static TCliente GetByUsuarioContrasenia(Connection conexion, String usuario, String contrasenia) throws Exception
    {
        TCliente tCliente = null;
        try
        {
            CallableStatement statement=(CallableStatement)conexion.prepareCall("EXECUTE usp_GetUsuarioContrasenia ?,?");
            
            statement.setString("strUsuario", usuario);
            statement.setString("strContrasenia", contrasenia);
            
            ResultSet resultSet=statement.executeQuery();
            
            if(resultSet.next())
            {
                tCliente=new TCliente
                (
                        resultSet.getInt("idCliente"),
                        resultSet.getString("strNombres"),
                        resultSet.getString("strApellidos"),
                        resultSet.getString("strTipoCliente"),
                        resultSet.getString("strContrasenia"),
                        resultSet.getString("strUsuario")
                );
            }
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
        finally
        {
            return tCliente;
        }
    }

}
