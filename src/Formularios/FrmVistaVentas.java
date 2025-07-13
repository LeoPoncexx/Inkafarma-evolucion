package Formularios;

import Clases.DetalleVenta;
import Clases.Venta;
import Consultas.ConDetalleVenta;
import Consultas.ConProducto;
import Consultas.ConVenta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmVistaVentas extends javax.swing.JFrame {

    List<Venta>lista;
    List<DetalleVenta>listaDetalle;
    
    public FrmVistaVentas() {
        initComponents();
        lista =new ConVenta().ListarTodos();
        cargarTabla();
        listaDetalle= new ArrayList<>();
        cargarTablaDetalle();
    }
    
    private void cargarTabla() {
        
        DefaultTableModel modelo = (DefaultTableModel) tablaVenta.getModel();
        
        lista.forEach((o) -> {
            modelo.addRow(new Object[]{
                o.getNumeroVenta(),
                o.getCodigoEmpleado(),
                o.getDni()
            });
        });
        modelo.fireTableDataChanged();
        tablaVenta.setRowHeight(40);
    }

    private void cargarTablaDetalle() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Código de Barras", "Nombre","Cantidad", "Precio Unitario" ,"Precio Total"});
        
        listaDetalle.forEach((o) -> {
            dtm.addRow(new Object[]{
                o.getCodigoBarra(),
                new ConProducto().nombreProducto(o.getCodigoBarra()),
                o.getCantidad(),
                new ConProducto().precioVentaProducto(o.getCodigoBarra()),
                o.getPrecioTotal()
            });
        });
      
        tablaDetalle.setModel(dtm);
        tablaDetalle.setRowHeight(40);
    }


    
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
        lblTituloProductos = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        lblTituloProductos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloProductos.setText("Ventas");
        jPanel1.add(lblTituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 60, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-registrar.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        tablaVenta = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaDetalle);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 370, 530));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Venta", "Codigo Empleado", "DNI Cliente"
            }
        ));
        tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 390, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        FrmRegistrarVenta frm = new FrmRegistrarVenta();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void tablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaMouseClicked
        int fila = tablaVenta.getSelectedRow();
        if (fila != -1){
            int numero = (int)tablaVenta.getValueAt(fila, 0);
            listaDetalle = new ConDetalleVenta().ListarDetalle(numero);
        }else{
            listaDetalle = new ArrayList<>();
        }
        cargarTablaDetalle();
    }//GEN-LAST:event_tablaVentaMouseClicked

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
            java.util.logging.Logger.getLogger(FrmVistaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVistaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVistaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVistaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmVistaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnLotes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTituloProductos;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTable tablaVenta;
    // End of variables declaration//GEN-END:variables
}
