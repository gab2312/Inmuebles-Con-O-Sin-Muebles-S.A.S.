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
public class TInmueble 
{
    private int idInmueble;
    private int idTipoInmueble;
    private String strDescripcion;
    private int idDuenion;
    private String stLlocalidad;
    private String stDidireccion;
    private int intCosti;
    private int intHabitaciones;
    private int intBanion;
    private String strResenia;
    private int intTamanio;

    public TInmueble() {}

    public TInmueble(int idInmueble, int idTipoInmueble, String strDescripcion, int idDuenion, String stLlocalidad, String stDidireccion, int intCosti, int intHabitaciones, int intBanion, String strResenia, int intTamanio) 
    {
        this.idInmueble = idInmueble;
        this.idTipoInmueble = idTipoInmueble;
        this.strDescripcion = strDescripcion;
        this.idDuenion = idDuenion;
        this.stLlocalidad = stLlocalidad;
        this.stDidireccion = stDidireccion;
        this.intCosti = intCosti;
        this.intHabitaciones = intHabitaciones;
        this.intBanion = intBanion;
        this.strResenia = strResenia;
        this.intTamanio = intTamanio;
    }

    public int getIdInmueble() 
    {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) 
    {
        this.idInmueble = idInmueble;
    }

    public int getIdTipoInmueble() 
    {
        return idTipoInmueble;
    }

    public void setIdTipoInmueble(int idTipoInmueble) 
    {
        this.idTipoInmueble = idTipoInmueble;
    }

    public String getStrDescripcion() 
    {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) 
    {
        this.strDescripcion = strDescripcion;
    }

    public int getIdDuenion() 
    {
        return idDuenion;
    }

    public void setIdDuenion(int idDuenion) 
    {
        this.idDuenion = idDuenion;
    }

    public String getStLlocalidad() 
    {
        return stLlocalidad;
    }

    public void setStLlocalidad(String stLlocalidad) 
    {
        this.stLlocalidad = stLlocalidad;
    }

    public String getStDidireccion() 
    {
        return stDidireccion;
    }

    public void setStDidireccion(String stDidireccion) 
    {
        this.stDidireccion = stDidireccion;
    }

    public int getIntCosti() 
    {
        return intCosti;
    }

    public void setIntCosti(int intCosti) 
    {
        this.intCosti = intCosti;
    }

    public int getIntHabitaciones() 
    {
        return intHabitaciones;
    }

    public void setIntHabitaciones(int intHabitaciones) 
    {
        this.intHabitaciones = intHabitaciones;
    }

    public int getIntBanion() 
    {
        return intBanion;
    }

    public void setIntBanion(int intBanion) 
    {
        this.intBanion = intBanion;
    }

    public String getStrResenia() 
    {
        return strResenia;
    }

    public void setStrResenia(String strResenia) 
    {
        this.strResenia = strResenia;
    }

    public int getIntTamanio() 
    {
        return intTamanio;
    }

    public void setIntTamanio(int intTamanio) 
    {
        this.intTamanio = intTamanio;
    }

    


}
