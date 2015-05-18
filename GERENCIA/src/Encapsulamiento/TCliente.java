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
public class TCliente 
{

    private int idCliente;
    private String strNombres;
    private String strApellidos;
    private String strTipoCliente;
    private String strContrasenia;
    private String strUsuario;
    
    
    public TCliente(){}
    
    public TCliente(int idCliente, String strNombres, String strApellidos, String strTipoCliente, String strContrasenia, String strUsuario) 
    {
        this.idCliente = idCliente;
        this.strNombres = strNombres;
        this.strApellidos = strApellidos;
        this.strTipoCliente = strTipoCliente;
        this.strContrasenia = strContrasenia;
        this.strUsuario = strUsuario;
    }

    public int getIdCliente() 
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente) 
    {
        this.idCliente = idCliente;
    }

    public String getStrNombres() 
    {
        return strNombres;
    }

    public void setStrNombres(String strNombres) 
    {
        this.strNombres = strNombres;
    }

    public String getStrApellidos() 
    {
        return strApellidos;
    }

    public void setStrApellidos(String strApellidos) 
    {
        this.strApellidos = strApellidos;
    }

    public String getStrTipoCliente() 
    {
        return strTipoCliente;
    }

    public void setStrTipoCliente(String strTipoCliente) 
    {
        this.strTipoCliente = strTipoCliente;
    }

    public String getStrContrasenia() 
    {
        return strContrasenia;
    }

    public void setStrContrasenia(String strContrasenia) 
    {
        this.strContrasenia = strContrasenia;
    }

    public String getStrUsuario() 
    {
        return strUsuario;
    }

    public void setStrUsuario(String strUsuario) 
    {
        this.strUsuario = strUsuario;
    }
    
}
