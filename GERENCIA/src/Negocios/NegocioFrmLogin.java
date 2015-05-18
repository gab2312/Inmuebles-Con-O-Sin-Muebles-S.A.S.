/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Conexion.ConexionDB;
import Datos.DatosTCliente;
import Encapsulamiento.TCliente;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author GAb
 */
public class NegocioFrmLogin extends ConexionDB
{

    public static boolean Login(String usuario, String contrasenia)
    {
        boolean existeUsuario=false;
        Connection conexion = GetConnection();
        
        try
        {
            conexion.setAutoCommit(false);
            
            TCliente tCliente = DatosTCliente.GetByUsuarioContrasenia(conexion, usuario, contrasenia);
            
            if(tCliente != null)
            {
                existeUsuario=true;
            }
            
            conexion.commit();
        }
        catch(Exception ex)
        {
            conexion.rollback();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally
        {
            return existeUsuario;
        }
    }
    
}
