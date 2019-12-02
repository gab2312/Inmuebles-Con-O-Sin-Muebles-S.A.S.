package Formularios;

import Encapsulamiento.TInmueble;
import Negocios.NegocioFrmConsultarInmueble;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author GAb
 */
public class FrmConsultaInmueble extends javax.swing.JInternalFrame {

     private TableRowSorter trsfiltro;
    

    public FrmConsultaInmueble() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de inmueble", "Descripción del inmueble", "Nombre del dueño", "Numero de contacto", "Localidad", "Dirección del inmueble", "Numero de habitaciones", "Numero de baños", "Tamaño en metros cuadrados", "Breve reseña del inmueble", "Costo del inmueble"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

         List<TInmueble> listaTInmuebles = NegocioFrmConsultarInmueble.getInmueble();
        
        DefaultTableModel modeloTabla = (DefaultTableModel)tablaDatos.getModel();
        for (TInmueble tInmueble : listaTInmuebles) 
        {
            Object[] datosFila=
            {
                tInmueble.getStrDescripcionTipo(),
                tInmueble.getStrDescripcion(),
                tInmueble.getStrNombres(),
                tInmueble.getIntNumeroTelefonico(),
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
