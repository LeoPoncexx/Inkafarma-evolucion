package Formularios;

import Clases.Lote;
import Clases.Render;
import Consultas.ConLote;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmLotes extends javax.swing.JFrame {

    List<Lote>lista = new ArrayList<>();
    
    public FrmLotes() {
        initComponents();
        lista = new ConLote().ListarTodos();
        cargarTabla();
    }

    private void cargarTabla() {
        
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nro Lote", "Cantidad", "Fecha Fabricación", "Fecha Vencimiento", "Código Barras"});

        lista.forEach((o) -> {
            
   
            dtm.addRow(new Object[]{
                o.getNumeroLote(),
                o.getCantidad(),
                new java.sql.Date(o.getFechaFabricacion().getTime()),
                new java.sql.Date(o.getFechaVencimiento().getTime()),
                o.getCodigoBarras()
            });
        });
        
        tabla.setDefaultRenderer(Object.class, new Render()); 
        tabla.setModel(dtm);
        tabla.setRowHeight(40);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnLotes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroLote = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtFechaVencimiento = new javax.swing.JFormattedTextField();
        txtFechaFabricacion = new javax.swing.JFormattedTextField();
        spnCantidad = new javax.swing.JSpinner();
        txtCodigoBarras = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 740));
        setPreferredSize(new java.awt.Dimension(1024, 740));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 242, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(1024, 40));
        jPanel3.setPreferredSize(new java.awt.Dimension(1024, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-inkafarma.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, -1));

        jPanel2.setMinimumSize(new java.awt.Dimension(90, 660));
        jPanel2.setPreferredSize(new java.awt.Dimension(90, 660));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-cliente-lateral.png"))); // NOI18N
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });
        jPanel2.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 430, -1, -1));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-producto-lateral.png"))); // NOI18N
        btnProductos.setBorder(null);
        btnProductos.setBorderPainted(false);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });
        jPanel2.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        btnLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-lote-lateral.png"))); // NOI18N
        btnLotes.setBorder(null);
        btnLotes.setBorderPainted(false);
        btnLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLotesMouseClicked(evt);
            }
        });
        jPanel2.add(btnLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, -1, -1));

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-proveedor-lateral.png"))); // NOI18N
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });
        jPanel2.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, -1, -1));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-venta-lateral.png"))); // NOI18N
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        jPanel2.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 330, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-lateral.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Lotes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(844, 155));
        jPanel4.setPreferredSize(new java.awt.Dimension(844, 155));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Número de Lote");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de Fabricación");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Código de Barras");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Fecha de Vencimiento");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        txtNumeroLote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumeroLote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtNumeroLote.setMinimumSize(new java.awt.Dimension(150, 22));
        txtNumeroLote.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel4.add(txtNumeroLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 8, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-guardar-verde.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jPanel4.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        txtFechaVencimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtFechaVencimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        txtFechaVencimiento.setMinimumSize(new java.awt.Dimension(150, 22));
        txtFechaVencimiento.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel4.add(txtFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 48, -1, -1));

        txtFechaFabricacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtFechaFabricacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        txtFechaFabricacion.setMinimumSize(new java.awt.Dimension(150, 22));
        txtFechaFabricacion.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel4.add(txtFechaFabricacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 48, -1, -1));

        spnCantidad.setMinimumSize(new java.awt.Dimension(154, 26));
        spnCantidad.setPreferredSize(new java.awt.Dimension(154, 26));
        jPanel4.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 86, -1, -1));
        jPanel4.add(txtCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 150, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 105, -1, 140));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-icon-buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(236, 236, 236));
        txtBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBuscar.setText("Buscar Nro Lote");
        txtBuscar.setBorder(null);
        txtBuscar.setMinimumSize(new java.awt.Dimension(140, 22));
        txtBuscar.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campo-buscar.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jScrollPane2.setMinimumSize(new java.awt.Dimension(840, 420));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(840, 420));

        tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 840, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        FrmProductos frm = new FrmProductos();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLotesMouseClicked
        FrmLotes frm = new FrmLotes();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLotesMouseClicked

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        FrmProveedores frm = new FrmProveedores();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        FrmVistaVentas frm = new FrmVistaVentas();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        FrmClientes frm = new FrmClientes();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int column = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tabla.getRowHeight();

        
    }//GEN-LAST:event_tablaMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String buscar = txtBuscar.getText();
        if(buscar.trim().equals("")){
            lista = new ConLote().ListarTodos();
            txtBuscar.setText("Buscar por Nro Lote");
        }else{
            lista = new ConLote().buscar(buscar);
        }
        cargarTabla();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        Lote o = obtenerDatos();
        if(o!=null){

                new ConLote().ingresar(o);
            lista = new ConLote().ListarTodos();
            limpiar();
            cargarTabla();
            
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
        lista = new ConLote().ListarTodos();
        cargarTabla();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void cargarDatos(int row) {
        txtNumeroLote.setText(tabla.getValueAt(row, 0).toString());
        spnCantidad.setValue((int) tabla.getValueAt(row, 1));
         // Asegúrate de convertir las fechas del tipo Date a String en el formato adecuado
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String fechaFabricacion = sdf.format((Date) tabla.getValueAt(row, 2));
        String fechaVencimiento = sdf.format((Date) tabla.getValueAt(row, 3));
        txtFechaFabricacion.setText(fechaFabricacion);
        txtFechaVencimiento.setText(fechaVencimiento);
        txtCodigoBarras.setText(tabla.getValueAt(row, 4).toString());

        // Deshabilita la edición del campo de código de barras
        txtCodigoBarras.setEditable(false);
    }
    
    private Lote obtenerDatos()  {
        JTextField[] campos = new JTextField[]{txtNumeroLote,  txtFechaFabricacion, txtFechaVencimiento,txtCodigoBarras,};
        try {
            for (JTextField t : campos) {
                if (t.getText().trim().equals("")) {
                    throw new IllegalArgumentException("Debe completar el campo " + t.getName());
                }
            }
            // Obtener la cantidad del spinner
            int cantidad = (int) spnCantidad.getValue();
            // Convertir las fechas de texto a objetos Date
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaFabricacion = sdf.parse(txtFechaFabricacion.getText());
            Date fechaVencimiento = sdf.parse(txtFechaVencimiento.getText());

            // Devolver un nuevo objeto Lote con los datos proporcionados
            return new Lote(txtNumeroLote.getText(), cantidad,  fechaFabricacion, fechaVencimiento, txtCodigoBarras.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser un número entero");
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "El formato de fecha no es válido. Use dd-MM-yyyy");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    private void limpiar() {
        txtNumeroLote.setText(""); 
        spnCantidad.setValue(0);
        txtFechaFabricacion.setText("");
        txtFechaVencimiento.setText("");
        txtCodigoBarras.setText("");
        txtNumeroLote.setEditable(true);
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLotes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JFormattedTextField txtFechaFabricacion;
    private javax.swing.JFormattedTextField txtFechaVencimiento;
    private javax.swing.JTextField txtNumeroLote;
    // End of variables declaration//GEN-END:variables
}
