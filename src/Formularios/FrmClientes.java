package Formularios;

import Clases.Cliente;
import Clases.Render;
import Consultas.ConCliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmClientes extends javax.swing.JFrame {

    List<Cliente>lista= new ArrayList<>();
    
    public FrmClientes() {
        initComponents();
        lista = new ConCliente().ListarTodos();
        cargarTabla();
    }
    
    private void cargarTabla() {
        
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"DNI", "Apellido Paterno", "Apellido Materno", "Primer Nombre", "Segundo Nombre", "Tercer Nombre", "Direccion", "Telefono", "Sexo", "Correo", "Afiliado"});

        lista.forEach((o) -> {
            
            dtm.addRow(new Object[]{
                o.getDni(),
                o.getApellidoPaterno(),
                o.getApellidoMaterno(),
                o.getPrimerNombre(),
                o.getSegundoNombre(),
                o.getTercerNombre(),
                o.getDireccion(),
                o.getTelefono(),
                o.getSexo(),
                o.getCorreo(),
                o.getAfiliacion()
            });
        });
        
        tabla.setDefaultRenderer(Object.class, new Render()); //permite agregar botones
        tabla.setModel(dtm);
        tabla.setRowHeight(40);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
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
        txtDni = new javax.swing.JTextField();
        txtPrimerNombre = new javax.swing.JTextField();
        txtTercerNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtSegundoNombre = new javax.swing.JTextField();
        rbtHombre = new javax.swing.JRadioButton();
        rbtMujer = new javax.swing.JRadioButton();
        lblNombre1 = new javax.swing.JLabel();
        chkAfiliado = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        botones.add(rbtHombre);
        botones.add(rbtMujer);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 740));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 242, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1024, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-inkafarma.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 40));

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
        lblTituloProductos.setText("Clientes");
        jPanel1.add(lblTituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(844, 170));
        jPanel4.setPreferredSize(new java.awt.Dimension(844, 170));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoBarras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoBarras.setText("DNI");
        jPanel4.add(lblCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion.setText("Primer Nombre");
        jPanel4.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblPrincipiosActivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrincipiosActivos.setText("Segundo Nombre");
        jPanel4.add(lblPrincipiosActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblStockActual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStockActual.setText("Tercer Nombre");
        jPanel4.add(lblStockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecioCompra.setText("Apellido Paterno");
        jPanel4.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Programa Inkaclub");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        lblClasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClasificacion.setText("Dirección");
        jPanel4.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Teléfono");
        jPanel4.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        lblStockMinimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStockMinimo.setText("Sexo");
        jPanel4.add(lblStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecioVenta.setText("Correo Electrónico");
        jPanel4.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtDni.setMinimumSize(new java.awt.Dimension(130, 22));
        txtDni.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 8, 150, -1));

        txtPrimerNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrimerNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtPrimerNombre.setMinimumSize(new java.awt.Dimension(130, 22));
        txtPrimerNombre.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 38, 150, -1));

        txtTercerNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTercerNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtTercerNombre.setMinimumSize(new java.awt.Dimension(130, 22));
        txtTercerNombre.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtTercerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 98, 150, -1));

        txtApellidoPaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtApellidoPaterno.setMinimumSize(new java.awt.Dimension(130, 22));
        txtApellidoPaterno.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 128, 150, -1));

        txtApellidoMaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtApellidoMaterno.setMinimumSize(new java.awt.Dimension(130, 22));
        txtApellidoMaterno.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 8, 150, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtDireccion.setMinimumSize(new java.awt.Dimension(130, 22));
        txtDireccion.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 38, 150, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtTelefono.setMinimumSize(new java.awt.Dimension(130, 22));
        txtTelefono.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 68, 150, -1));

        txtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtCorreoElectronico.setMinimumSize(new java.awt.Dimension(130, 22));
        txtCorreoElectronico.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 128, 150, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-guardar-verde.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jPanel4.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        txtSegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSegundoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 184, 184)));
        txtSegundoNombre.setMinimumSize(new java.awt.Dimension(130, 22));
        txtSegundoNombre.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel4.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 68, 150, -1));

        rbtHombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtHombre.setText("Hombre");
        jPanel4.add(rbtHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 98, -1, -1));

        rbtMujer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtMujer.setText("Mujer");
        jPanel4.add(rbtMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 98, -1, -1));

        lblNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre1.setText("Apellido Materno");
        jPanel4.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        chkAfiliado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkAfiliado.setText("Afiliado");
        jPanel4.add(chkAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

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
        txtBuscar.setText("Buscar por dni");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int column = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tabla.getRowHeight();

    }//GEN-LAST:event_tablaMouseClicked

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

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String buscar = txtBuscar.getText();
        if(buscar.trim().equals("")){
            lista = new ConCliente().ListarTodos();
            txtBuscar.setText("Buscar por Dni");
        }else{
            lista = new ConCliente().buscar(Integer.parseInt(buscar));
        }
        cargarTabla();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        Cliente o = obtenerDatos();
        if(o!=null){
            
                new ConCliente().ingresar(o);
            lista = new ConCliente().ListarTodos();
            limpiar();
            cargarTabla();
            
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
        lista = new ConCliente().ListarTodos();
        cargarTabla();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private Cliente obtenerDatos() {
    
        try {
            // Verificar que el DNI sea un número válido
            int dni = Integer.parseInt(txtDni.getText().trim());

            // Obtener el sexo seleccionado
            char sexo;
            if (rbtHombre.isSelected()) {
                sexo = 'M';
            } else if (rbtMujer.isSelected()) {
                sexo = 'F';
            } else {
                throw new IllegalArgumentException("Debe seleccionar un género");
            }

            // Verificar si el checkbox de afiliación está marcado
            char afiliacion = (chkAfiliado.isSelected()) ? '1' : '0';

            // Resto de la validación de datos
            return new Cliente(dni, 
                    txtApellidoPaterno.getText(), txtApellidoMaterno.getText(), txtPrimerNombre.getText(),
                    txtSegundoNombre.getText(), txtTercerNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), 
                     sexo,txtCorreoElectronico.getText(), afiliacion);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un número entero válido");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    private void limpiar() {
        txtDni.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtPrimerNombre.setText("");
        txtSegundoNombre.setText("");
        txtTercerNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        rbtHombre.setSelected(false); // Deseleccionar el botón de radio Hombre
        rbtMujer.setSelected(false);  // Deseleccionar el botón de radio Mujer
        txtCorreoElectronico.setText("");
        chkAfiliado.setSelected(false); // Desmarcar el checkbox de afiliación
        txtDni.setEditable(true);
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
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLotes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private javax.swing.JCheckBox chkAfiliado;
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
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblPrincipiosActivos;
    private javax.swing.JLabel lblStockActual;
    private javax.swing.JLabel lblStockMinimo;
    private javax.swing.JLabel lblTituloProductos;
    private javax.swing.JRadioButton rbtHombre;
    private javax.swing.JRadioButton rbtMujer;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTercerNombre;
    // End of variables declaration//GEN-END:variables
}
