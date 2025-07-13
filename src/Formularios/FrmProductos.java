package Formularios;
import Clases.Producto;
import Clases.Render;
import Consultas.ConProducto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmProductos extends javax.swing.JFrame {

    List<Producto>lista= new ArrayList<>();
    boolean editable;
    
    public FrmProductos() {
        initComponents();
        lista = new ConProducto().ListarTodos();
        cargarTabla();
        editable = false;
        cargarComboBox();
    }

    private void cargarTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Código de Barras", "Marca", "Stock Mínimo", "Stock Actual", "Principios Activos", "Clasificación", "Descripción", "Nombre", "Precio Venta", "Precio Compra", ""});

        lista.forEach((o) -> {
            JButton btnEditar = new JButton("", new ImageIcon(getClass().getResource("/Imagenes/btn-editar.png")));
            btnEditar.setName("btnEditar");
            dtm.addRow(new Object[]{
                o.getCodigoBarras(),
                o.getMarca(),
                o.getStockMinimo(),
                o.getStockActual(),
                o.getPrincipiosActivos(),
                o.getClasificacion(),
                o.getDescripcion(),
                o.getNombreProducto(),
                o.getPrecioVenta(),
                o.getPrecioCompra(),
                btnEditar
            });
        });
        
        tabla.setDefaultRenderer(Object.class, new Render());
        tabla.setModel(dtm);
        tabla.setRowHeight(40);
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
        jPanel4 = new javax.swing.JPanel();
        lblCodigoBarras = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrincipiosActivos = new javax.swing.JLabel();
        lblStockActual = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblStockMinimo = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        txtCodigoBarra = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrincipioActivo = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtClasificacion = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        spnStockActual = new javax.swing.JSpinner();
        spnStockMinimo = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cbxPrincipioActivo = new javax.swing.JComboBox<>();
        cbxDescripcion = new javax.swing.JComboBox<>();

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
        lblTituloProductos.setText("Productos");
        jPanel1.add(lblTituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(844, 170));
        jPanel4.setPreferredSize(new java.awt.Dimension(844, 170));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoBarras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoBarras.setText("Código de Barras");
        jPanel4.add(lblCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion.setText("Descripción");
        jPanel4.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblPrincipiosActivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrincipiosActivos.setText("Principios Activos");
        jPanel4.add(lblPrincipiosActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblStockActual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStockActual.setText("Stock Actual");
        jPanel4.add(lblStockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecioCompra.setText("Precio Compra");
        jPanel4.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        lblClasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClasificacion.setText("Clasificación");
        jPanel4.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Marca");
        jPanel4.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        lblStockMinimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStockMinimo.setText("Stock Mínimo");
        jPanel4.add(lblStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecioVenta.setText("Precio Venta");
        jPanel4.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        txtCodigoBarra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigoBarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtCodigoBarra.setMinimumSize(new java.awt.Dimension(130, 22));
        txtCodigoBarra.setName("Código de Barra"); // NOI18N
        txtCodigoBarra.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 8, 150, -1));

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtDescripcion.setMinimumSize(new java.awt.Dimension(130, 22));
        txtDescripcion.setName("Descripción"); // NOI18N
        txtDescripcion.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 38, 150, -1));

        txtPrincipioActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrincipioActivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtPrincipioActivo.setMinimumSize(new java.awt.Dimension(130, 22));
        txtPrincipioActivo.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtPrincipioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 68, 150, -1));

        txtPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtPrecioCompra.setMinimumSize(new java.awt.Dimension(130, 22));
        txtPrecioCompra.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 128, 150, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtNombre.setMinimumSize(new java.awt.Dimension(130, 22));
        txtNombre.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 8, 150, -1));

        txtClasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClasificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtClasificacion.setMinimumSize(new java.awt.Dimension(130, 22));
        txtClasificacion.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 38, 150, -1));

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtMarca.setMinimumSize(new java.awt.Dimension(130, 22));
        txtMarca.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 68, 150, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtPrecioVenta.setMinimumSize(new java.awt.Dimension(130, 22));
        txtPrecioVenta.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 128, 150, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-guardar-verde.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jPanel4.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        spnStockActual.setEnabled(false);
        spnStockActual.setMinimumSize(new java.awt.Dimension(154, 26));
        spnStockActual.setPreferredSize(new java.awt.Dimension(154, 26));
        jPanel4.add(spnStockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 96, -1, -1));

        spnStockMinimo.setMinimumSize(new java.awt.Dimension(154, 26));
        spnStockMinimo.setPreferredSize(new java.awt.Dimension(154, 26));
        jPanel4.add(spnStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 96, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 105, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-icon-buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 285, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(236, 236, 236));
        txtBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBuscar.setText(" Buscar por Nombre");
        txtBuscar.setBorder(null);
        txtBuscar.setMinimumSize(new java.awt.Dimension(140, 22));
        txtBuscar.setPreferredSize(new java.awt.Dimension(140, 22));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 295, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campo-buscar.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 285, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 860, 340));

        cbxPrincipioActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxPrincipioActivo.setMinimumSize(new java.awt.Dimension(170, 40));
        cbxPrincipioActivo.setPreferredSize(new java.awt.Dimension(170, 40));
        cbxPrincipioActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPrincipioActivoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxPrincipioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 285, -1, -1));

        cbxDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxDescripcion.setMinimumSize(new java.awt.Dimension(170, 40));
        cbxDescripcion.setPreferredSize(new java.awt.Dimension(170, 40));
        cbxDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 285, -1, -1));

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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int column = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tabla.getRowHeight();
        
        if(row < tabla.getRowCount() && row >= 0 && column < tabla.getColumnCount() && column >= 0){
            Object value = tabla.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                if(boton.getName().equals("btnEditar")){
                    cargarDatos(row);
                    editable = true;
                }

            }
        }
    }//GEN-LAST:event_tablaMouseClicked
    private void cargarDatos(int row){
        txtCodigoBarra.setText(tabla.getValueAt(row, 0).toString());
        txtMarca.setText(tabla.getValueAt(row, 1).toString());
        spnStockMinimo.setValue((int)tabla.getValueAt(row, 2));
        spnStockActual.setValue((int)tabla.getValueAt(row, 3));
        txtPrincipioActivo.setText(tabla.getValueAt(row, 4).toString());
        txtClasificacion.setText(tabla.getValueAt(row, 5).toString());
        txtDescripcion.setText(tabla.getValueAt(row, 6).toString());
        txtNombre.setText(tabla.getValueAt(row, 7).toString());
        txtPrecioVenta.setText(tabla.getValueAt(row, 8).toString());
        txtPrecioCompra.setText(tabla.getValueAt(row, 9).toString());
        txtCodigoBarra.setEditable(false);
    }

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

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        Producto o = obtenerDatos();
        if(o!=null){
            if(editable){
                new ConProducto().editar(o);
            }else{
                new ConProducto().ingresar(o);
            }
            lista = new ConProducto().ListarTodos();
            limpiar();
            cargarTabla();
            cargarComboBox();
        }
        
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String buscar = txtBuscar.getText();
        if(buscar.trim().equals("")){
            lista = new ConProducto().ListarTodos();
            txtBuscar.setText("Buscar por Nombre");
        }else{
            lista = new ConProducto().buscar(buscar);
        }
        cargarTabla();
        
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void cbxPrincipioActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPrincipioActivoActionPerformed
        String filtrar = cbxPrincipioActivo.getSelectedItem().toString();
        if(filtrar.equals("Filtrar Principio Activo")){
            lista = new ConProducto().ListarTodos();
        }else{
            lista = new ConProducto().filtrarPrincipio(filtrar);
        }
        
        cargarTabla();
        
    }//GEN-LAST:event_cbxPrincipioActivoActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
        lista = new ConProducto().ListarTodos();
        cargarTabla();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void cbxDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDescripcionActionPerformed
        String filtrar = cbxDescripcion.getSelectedItem().toString();
        if(filtrar.equals("Filtrar Descripcion")){
            lista = new ConProducto().ListarTodos();
        }else{
            lista = new ConProducto().filtrarDescripcion(filtrar);
        }
        
        cargarTabla();
    }//GEN-LAST:event_cbxDescripcionActionPerformed
    
    private void cargarComboBox(){
        cbxPrincipioActivo.setModel(new DefaultComboBoxModel<>(new ConProducto().listaPrincipioActivo().toArray(new String[0])));
        cbxDescripcion.setModel(new DefaultComboBoxModel<>(new ConProducto().listaDescripcion().toArray(new String[0])));
    }
    
    private Producto obtenerDatos(){
        JTextField[] campos = new JTextField[]{txtCodigoBarra, txtDescripcion, txtPrincipioActivo, txtPrecioCompra,txtPrecioVenta, txtMarca, txtClasificacion, txtNombre};
        try{
            for(JTextField t: campos){
                if(t.getText().trim().equals("")){
                    throw new IllegalArgumentException("Debe completar el campo " + t.getName());
                }
            }
            if((int)spnStockMinimo.getValue()<=0){
                throw new IllegalArgumentException("El stock no puede ser menor o igual a 0");
            }
            double venta = Double.parseDouble(txtPrecioVenta.getText());
            double compra = Double.parseDouble(txtPrecioCompra.getText());
            if(venta <= 0 || compra <=0){
                throw new IllegalArgumentException("Los precios no pueden ser negativos");
            }
            if(compra>venta){
                throw new IllegalArgumentException("Los precios de compra no puede ser menor al precio de venta");
            }

            return new Producto(txtCodigoBarra.getText(), txtMarca.getText(), txtPrincipioActivo.getText(),
                txtClasificacion.getText(), txtDescripcion.getText(), txtNombre.getText(), (int)spnStockMinimo.getValue(),
                0, venta, compra);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Los precios deben ser números decimales");
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    private void limpiar(){
        editable = false;
        txtCodigoBarra.setText("");
        txtMarca.setText("");
        spnStockMinimo.setValue(0);
        spnStockActual.setValue(0);
        txtPrincipioActivo.setText("");
        txtClasificacion.setText("");
        txtDescripcion.setText("");
        txtNombre.setText("");
        txtPrecioVenta.setText("");
        txtPrecioCompra.setText("");
        txtCodigoBarra.setEditable(true);
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
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductos().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxDescripcion;
    private javax.swing.JComboBox<String> cbxPrincipioActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblCodigoBarras;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblPrincipiosActivos;
    private javax.swing.JLabel lblStockActual;
    private javax.swing.JLabel lblStockMinimo;
    private javax.swing.JLabel lblTituloProductos;
    private javax.swing.JSpinner spnStockActual;
    private javax.swing.JSpinner spnStockMinimo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtClasificacion;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtPrincipioActivo;
    // End of variables declaration//GEN-END:variables
}
