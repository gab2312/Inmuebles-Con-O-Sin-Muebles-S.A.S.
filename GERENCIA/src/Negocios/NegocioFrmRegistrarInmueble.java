/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Conexion.ConexionDB;
import Datos.DatosTInmueble;
import Encapsulamiento.TInmueble;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author GAb
 */
public class NegocioFrmRegistrarInmueble extends ConexionDB
{
    public static boolean InsertAll(TInmueble tInmueble)
    {
        boolean estadoOrdenSql=false;
        Connection conexion=GetConnection();
        
        try
        {
            conexion.setAutoCommit(false);
            
            DatosTInmueble.insertAll (conexion, tInmueble);
            estadoOrdenSql=true;
            
            conexion.commit();
        }
        catch(Exception ex)
        {
            conexion.rollback();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally
        {
            return estadoOrdenSql;
        }
    }
}
