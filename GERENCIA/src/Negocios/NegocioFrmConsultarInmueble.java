/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Conexion.ConexionDB;
import Encapsulamiento.TInmueble;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GAb
 */
public class NegocioFrmConsultarInmueble extends ConexionDB
{

    public static List <TInmueble> GetInmueble(int parametro)
    {
        List <TInmueble> listaTInmuebles = new ArrayList <TInmueble>();
        Connection conexion = GetConnection();
        
        try
        {
            conexion.setAutoCommit(false);
            
            listaTInmuebles = Datos.DatosTInmueble.GetTInmueble(conexion, parametro);
            
            conexion.commit();
        }
        catch(Exception ex)
        {
            conexion.rollback();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally
        {
            return listaTInmuebles;
        }
    }
    
}
