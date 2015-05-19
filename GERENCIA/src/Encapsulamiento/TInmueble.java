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
    private int intCosto;
    private int intHabitaciones;
    private int intBanios;
    private String strResenia;
    private int intTamanio;

    private String strDescripcionTipo;
    private String strNombres;

    public TInmueble(String strDescripcion, String stLlocalidad, String stDidireccion, int intCosto, int intHabitaciones, int intBanios, String strResenia, int intTamanio, String strDescripcionTipo, String strNombres) 
    {
        this.strDescripcion = strDescripcion;
        this.stLlocalidad = stLlocalidad;
        this.stDidireccion = stDidireccion;
        this.intCosto = intCosto;
        this.intHabitaciones = intHabitaciones;
        this.intBanios = intBanios;
        this.strResenia = strResenia;
        this.intTamanio = intTamanio;
        this.strDescripcionTipo = strDescripcionTipo;
        this.strNombres = strNombres;
    }

    public TInmueble() {}

    /**public TInmueble(int idInmueble, int idTipoInmueble, String strDescripcion, int idDuenion, String stLlocalidad, String stDidireccion, int intCosti, int intHabitaciones, int intBanion, String strResenia, int intTamanio) 
    {
        this.idInmueble = idInmueble;
        this.idTipoInmueble = idTipoInmueble;
        this.strDescripcion = strDescripcion;
        this.idDuenion = idDuenion;
        this.stLlocalidad = stLlocalidad;
        this.stDidireccion = stDidireccion;
        this.intCosto = intCosti;
        this.intHabitaciones = intHabitaciones;
        this.intBanios = intBanion;
        this.strResenia = strResenia;
        this.intTamanio = intTamanio;
    }*/

    public String getStrDescripcionTipo() 
    {
        return strDescripcionTipo;
    }

    public void setStrDescripcionTipo(String strDescripcionTipo) 
    {
        this.strDescripcionTipo = strDescripcionTipo;
    }

    public String getStrNombres() 
    {
        return strNombres;
    }

    public void setStrNombres(String strNombres) 
    {
        this.strNombres = strNombres;
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

    public int getIntCosto() 
    {
        return intCosto;
    }

    public void setIntCosto(int intCosto) 
    {
        this.intCosto = intCosto;
    }

    public int getIntHabitaciones() 
    {
        return intHabitaciones;
    }

    public void setIntHabitaciones(int intHabitaciones) 
    {
        this.intHabitaciones = intHabitaciones;
    }

    public int getIntBanios() 
    {
        return intBanios;
    }

    public void setIntBanios(int intBanios) 
    {
        this.intBanios = intBanios;
    }

    public String getStrResenia() 
    {
        return strResenia;
    }

    @Override
    public String toString() {
        return "TInmueble{" + "idInmueble=" + idInmueble + ", idTipoInmueble=" + idTipoInmueble + ", strDescripcion=" + strDescripcion + ", idDuenion=" + idDuenion + ", stLlocalidad=" + stLlocalidad + ", stDidireccion=" + stDidireccion + ", intCosto=" + intCosto + ", intHabitaciones=" + intHabitaciones + ", intBanios=" + intBanios + ", strResenia=" + strResenia + ", intTamanio=" + intTamanio + ", strDescripcionTipo=" + strDescripcionTipo + ", strNombres=" + strNombres + '}';
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
