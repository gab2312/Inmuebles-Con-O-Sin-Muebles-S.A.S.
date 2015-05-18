/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Negocios.NegocioFrmLogin;

/**
 *
 * @author GAb
 */
public class Main {
    public static void main(String[] args) {
     
        Negocios.NegocioFrmLogin negocioFrmLogin = new NegocioFrmLogin();
        boolean existe = negocioFrmLogin.Login("ggortizt", "123456789");
        System.out.println(existe);
    }
}
