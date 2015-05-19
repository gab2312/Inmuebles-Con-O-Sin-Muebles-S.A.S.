/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.TInmueble;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAb
 */
public class DatosTInmueble 
{
 
    public static void InsertAll(Connection conexion, TInmueble tInmueble) throws Exception
    {
        try
        {
            CallableStatement statement=(CallableStatement) conexion.prepareCall("EXECUTE ﻿usp_InsertTInmueble ?,?,?,?,?,?,?,?,?,? ");
        
            statement.setInt("idTipoInmueble", tInmueble.getIdTipoInmueble());
            statement.setString("strDescipcion", tInmueble.getStrDescripcion());
            statement.setInt("idDuenion", tInmueble.getIdDuenion());
            statement.setString("stLlocalidad", tInmueble.getStLlocalidad());
            statement.setString("stDdireccion", tInmueble.getStDidireccion());
            statement.setInt("intCosto", tInmueble.getIntCosto());
            statement.setInt("intHabitaciones", tInmueble.getIntHabitaciones());
            statement.setInt("intBanios", tInmueble.getIntBanios());
            statement.setString("strResenia", tInmueble.getStrResenia());
            statement.setInt("intTamanio", tInmueble.getIntTamanio());

            statement.execute();
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
    
    
    public static List<TInmueble> GetTInmueble(Connection conexion, int parametro) throws Exception
    {
        List<TInmueble> listaTProducto = new ArrayList <TInmueble> ();
        TInmueble tInmueble = null;
        try
        {
            CallableStatement statement= (CallableStatement) conexion.prepareCall("EXECUTE﻿usp_GetInmueble ?,?");
            
            statement.setInt("intParametro", parametro);
            statement.setString("strValor", null);
            
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
                                resultSet.getString("strNombres")
                        );
                
                listaTProducto.add(tInmueble);
            }
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
        finally
        {
            return listaTProducto;
        }
    }
}
