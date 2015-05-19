/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Encapsulamiento.TInmueble;
import Negocios.NegocioFrmConsultarInmueble;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAb
 */
public class frmConsultarProducto extends javax.swing.JFrame 
{

    public frmConsultarProducto() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
/*
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
*/
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de inmueble", "descripción del inmueble", "Nombre del dueño", "Localidad del inmueble", "Dirección del predio", 
                "Numero de habitaciones", "Numero de baños", "Tamaño en metros cuadrados", "Breve reseña del inmueble", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) 
    {
       List<TInmueble> listaTInmuebles = NegocioFrmConsultarInmueble.GetInmueble(0);
        
        DefaultTableModel modeloTabla = (DefaultTableModel)tablaDatos.getModel();
        for (TInmueble tInmueble : listaTInmuebles) 
        {
            Object[] datosFila=
            {
                tInmueble.getStrDescripcionTipo(),
                tInmueble.getStrDescripcion(),
                tInmueble.getStrNombres(),
                tInmueble.getStLlocalidad(),
                tInmueble.getStDidireccion(),
                tInmueble.getIntHabitaciones(),
                tInmueble.getIntBanios(),
                tInmueble.getIntTamanio(),
                tInmueble.getStrResenia(),
                tInmueble.getIntCosto()
            };
            
            modeloTabla.addRow(datosFila);
        }
        
        tablaDatos.setModel(modeloTabla);
    }
    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    
}

