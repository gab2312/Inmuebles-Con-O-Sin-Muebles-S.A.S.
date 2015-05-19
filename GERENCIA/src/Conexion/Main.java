/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Encapsulamiento.TCliente;
import Encapsulamiento.TInmueble;
import Formularios.frmConsultarProducto;
import Negocios.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GAb
 */
public class Main extends javax.swing.JFrame
{

    private static javax.swing.JDesktopPane desktopPane;
    
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List <TInmueble> inmuebles = new ArrayList <TInmueble>();
        
        NegocioFrmLogin negocioFrmLogin = new NegocioFrmLogin();
        NegocioFrmConsultarInmueble consultarInmueble = new NegocioFrmConsultarInmueble();
        NegocioFrmRegistrarInmueble registrarInmueble = new NegocioFrmRegistrarInmueble();
        TCliente tCliente = new TCliente();
        
        boolean existe = negocioFrmLogin.Login("ggortizt", "123456789");
        tCliente = negocioFrmLogin.GetByNombre("ggortizt", "123456789");
        int decision = -1;
        
        if (existe) 
        {
            /*try 
            {*/
                System.out.println("Bienvenido!, " + tCliente.getStrNombres() + " (" + tCliente.getStrUsuario() + ")");
                System.out.println("Ingresa:\n1. Consultar el listado de inmuebles\n2. Registrar un nuevo inmueble");
                decision = sc.nextInt();
                switch (decision) 
                {
                    case 1:
                        frmConsultarProducto V  = new frmConsultarProducto();
                        V.show();
                        break;

                    case 2:

                        break;
                }
            /*} 
            catch (Exception e) 
            {
                System.err.println(e.getMessage());
            }*/
        }
    }
}

