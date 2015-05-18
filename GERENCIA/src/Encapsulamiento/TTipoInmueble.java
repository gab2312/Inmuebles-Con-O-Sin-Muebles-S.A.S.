/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author GAb
 */
public class TTipoInmueble 
{
    
    private int idTipo;
    private String strDescripcionTipo;

    public TTipoInmueble() {}
    
    public TTipoInmueble(int idTipo, String strDescripcionTipo) 
    {
        this.idTipo = idTipo;
        this.strDescripcionTipo = strDescripcionTipo;
    }

    public int getIdTipo() 
    {
        return idTipo;
    }

    public void setIdTipo(int idTipo) 
    {
        this.idTipo = idTipo;
    }

    public String getStrDescripcionTipo() 
    {
        return strDescripcionTipo;
    }

    public void setStrDescripcionTipo(String strDescripcionTipo) 
    {
        this.strDescripcionTipo = strDescripcionTipo;
    }
    
}
