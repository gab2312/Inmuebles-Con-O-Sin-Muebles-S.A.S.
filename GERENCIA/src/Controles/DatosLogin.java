/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

/**
 *
 * @author GAb
 */
public class DatosLogin 
{
    public static String usuario;
    public static int id;
    public static String tipoUsuario;

    
    
    public static String getTipoUsuario() {
        return tipoUsuario;
    }

    public static void setTipoUsuario(String tipoUsuario) {
        DatosLogin.tipoUsuario = tipoUsuario;
    }
    
    
    
    public void SetUsuario(String nombreUsuario)
    {
        usuario=nombreUsuario;
    }
    
    public String GetUsuario()
    {
        return usuario;
    }

    public static int getId() 
    {
        return id;
    }

    public static void setId(int id) 
    {
        DatosLogin.id = id;
    }
    
    
}
