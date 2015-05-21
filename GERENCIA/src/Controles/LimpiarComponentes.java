/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author GAb
 */
public class LimpiarComponentes 
{
  public static void JTextField(JPanel panel)
    {
        Component[] componentes=panel.getComponents();
        
        for(Component item:componentes)
        {
            if(item.getClass().getName().equals("javax.swing.JTextField"))
            {
                ((javax.swing.JTextField)item).setText("");
            }
        }
    }   
}
