/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Datos.DatosTInmueble;
import Encapsulamiento.TInmueble;
import Negocios.NegocioFrmConsultarInmueble;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAb
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        List<TInmueble> inmuebles = new ArrayList<TInmueble>();
        ConexionDB conexionDB = new ConexionDB();
        inmuebles = DatosTInmueble.GetTInmueble(conexionDB.GetConnection(), 0);
        
        for (int i = 0; i < inmuebles.size(); i++) {
            System.out.println(inmuebles.get(i).toString());
        }
    }
}
