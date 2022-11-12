/*import bs.bean.Empleado; 

import bs.general.General; 

import javax.swing.JOptionPane; 

import javax.swing.table.DefaultTableModel; 

 

public class FrmEmpleado extends javax.swing.JFrame { 

 

    String valor; 

 

    DefaultTableModel modeloTablaEmpleados; 

 

    int filaSeleccionada = -1; 

    Empleado empleadoSeleccionado; 

 

     

      Creacion del form FrmEmpleado 

    

    public FrmEmpleado() { 

        initComponents(); 

        actualizarDatos(); 

    } 

 

    public FrmEmpleado(String valor) { 

        this.valor = valor; 

        initComponents(); 

        actualizarDatos(); 

    } 

 

    public void actualizarDatos() { 

        crearmodeloTablaEmpleados(); 

        agregarDatosDelEmpleado(); 

    } 

 

    private void crearmodeloTablaEmpleados() { 

        String[] columnas = new String[]{"Número", "Empleado", "Sueldo"}; 

        modeloTablaEmpleados = new DefaultTableModel(columnas, 0); 

        tblEmpleados.setModel(modeloTablaEmpleados); 

    } 

 

    private void agregarDatosDelEmpleado() { 

        for (Empleado empleado : General.general.getEmpleado()) { 

            insertarFilaEnTabla(empleado); 

        } 

    } 

 

    @SuppressWarnings("unchecked") 

    private void initComponents() { 

 

        jScrollPane1 = new javax.swing.JScrollPane(); 

        tblEmpleados = new javax.swing.JTable(); 

        btnNuevo = new javax.swing.JButton(); 

        btnEditar = new javax.swing.JButton(); 

        btnEliminar = new javax.swing.JButton(); 

        jLabel1 = new javax.swing.JLabel(); 

        txtNombre = new javax.swing.JTextField(); 

        lblPrecio = new javax.swing.JLabel(); 

        txtSueldo = new javax.swing.JTextField(); 

        btnAgregar = new javax.swing.JButton(); 

        jLabel2 = new javax.swing.JLabel(); 

        txtNumero = new javax.swing.JTextField(); 

        jLabel3 = new javax.swing.JLabel(); 

        jLabel4 = new javax.swing.JLabel(); 

 

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 

        addWindowListener(new java.awt.event.WindowAdapter() { 

            public void windowClosing(java.awt.event.WindowEvent evt) { 

                formWindowClosing(evt); 

            } 

        }); 

 

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel( 

            new Object [][] { 

                {null, null, null}, 

                {null, null, null}, 

                {null, null, null}, 

                {null, null, null} 

            }, 

            new String [] { 

                "Title 1", "Title 2", "Title 3" 

            } 

        )); 

        jScrollPane1.setViewportView(tblEmpleados); 

 

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bs/images/mas.png"))); // NOI18N 

        btnNuevo.setText("Nuevo"); 

 

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bs/images/editar.png"))); // NOI18N 

        btnEditar.setText("Editar"); 

        btnEditar.addActionListener(new java.awt.event.ActionListener() { 

            public void actionPerformed(java.awt.event.ActionEvent evt) { 

                btnEditarActionPerformed(evt); 

            } 

        }); 

 

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bs/images/menos.png"))); // NOI18N 

        btnEliminar.setText("Eliminar"); 

        btnEliminar.addActionListener(new java.awt.event.ActionListener() { 

            public void actionPerformed(java.awt.event.ActionEvent evt) { 

                btnEliminarActionPerformed(evt); 

            } 

        }); 

 

        jLabel1.setText("Nombre"); 

 

        lblPrecio.setText("Sueldo"); 

 

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bs/images/guardar.png"))); // NOI18N 

        btnAgregar.setText("Agregar"); 

        btnAgregar.addActionListener(new java.awt.event.ActionListener() { 

            public void actionPerformed(java.awt.event.ActionEvent evt) { 

                btnAgregarActionPerformed(evt); 

            } 

        }); 

 

        jLabel2.setText("Número"); 

 

        jLabel3.setText("REGISTRO DE EMPLEADOS"); 

 

        jLabel4.setText("Datos personales"); 

 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 

        getContentPane().setLayout(layout); 

        layout.setHorizontalGroup( 

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 

            .addGroup(layout.createSequentialGroup() 

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 

                    .addGroup(layout.createSequentialGroup() 

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 

                            .addGroup(layout.createSequentialGroup() 

                                .addContainerGap() 

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false) 

                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 

                                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 

                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 

                                    .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false) 

                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING) 

                                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING) 

                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup() 

                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE) 

                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 

                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)) 

                                    .addComponent(txtSueldo)) 

                                .addGap(18, 18, 18) 

                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)) 

                            .addGroup(layout.createSequentialGroup() 

                                .addContainerGap() 

                                .addComponent(jLabel4)) 

                            .addGroup(layout.createSequentialGroup() 

                                .addGap(156, 156, 156) 

                                .addComponent(jLabel3))) 

                        .addGap(0, 2, Short.MAX_VALUE)) 

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() 

                        .addGap(0, 0, Short.MAX_VALUE) 

                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))) 

                .addContainerGap()) 

        ); 

        layout.setVerticalGroup( 

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() 

                .addContainerGap() 

                .addComponent(jLabel3) 

                .addGap(4, 4, 4) 

                .addComponent(jLabel4) 

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 

                    .addComponent(jLabel2) 

                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 

                    .addComponent(jLabel1) 

                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 

                    .addComponent(lblPrecio) 

                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 

                .addGap(18, 18, 18) 

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 

                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE) 

                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE) 

                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE) 

                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)) 

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 

                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE) 

                .addGap(47, 47, 47)) 

        ); 

 

        pack(); 

    }// </editor-fold>                         

 

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                            

        Empleado empleado = new Empleado(0l, Integer.parseInt(txtNumero.getText()), txtNombre.getText(), 

                Float.parseFloat(txtSueldo.getText())); 

        if (filaSeleccionada != -1) { 

            //Hay una fila Seleccionada 

            ///Coloquemos las instrucciones para actualizar nuestro empleado Seleccionado 

            empleadoSeleccionado.setNumero(Integer.parseInt(txtNumero.getText())); 

            empleadoSeleccionado.setNombre(txtNombre.getText()); 

            empleadoSeleccionado.setSueldo(Float.parseFloat(txtSueldo.getText())); 

            modeloTablaEmpleados.removeRow(filaSeleccionada); 

            modeloTablaEmpleados.insertRow(filaSeleccionada, crearValoresObjetoParaFila(empleado)); 

            /////// 

        } else { 

            General.general.getEmpleado().add(empleado); 

            insertarFilaEnTabla(empleado); 

        } 

        filaSeleccionada = -1; 

 

    }                                           

 

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                           

        filaSeleccionada = tblEmpleados.getSelectedRow(); 

        if (filaSeleccionada == -1) { 

            JOptionPane.showMessageDialog(rootPane, "Por favor debe seleccionar un elemento de la tabla"); 

        } else { 

            empleadoSeleccionado = General.general.getEmpleado().get(filaSeleccionada); 

            txtNumero.setText(empleadoSeleccionado.getNumero() + ""); 

            txtNombre.setText(empleadoSeleccionado.getNombre()); 

            txtSueldo.setText(empleadoSeleccionado.getSueldo() + ""); 

 

        } 

    }                                          

 

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                             

        filaSeleccionada = tblEmpleados.getSelectedRow(); 

        if (filaSeleccionada == -1) { 

            JOptionPane.showMessageDialog(rootPane, "Por favor debe seleccionar un elemento de la tabla"); 

        } else { 

            General.general.getEmpleado().remove(filaSeleccionada); 

            modeloTablaEmpleados.removeRow(filaSeleccionada); 

        } 

    }                                            

 

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                    

        General.general.guardar(); 

    }                                   

 

    private Object[] crearValoresObjetoParaFila(Empleado empleado) { 

        return new Object[]{ 

            empleado.getNumero(), 

            empleado.getNombre(), 

            empleado.getSueldo()}; 

    } 

 

    private void insertarFilaEnTabla(Empleado empleado) { 

        modeloTablaEmpleados.addRow(crearValoresObjetoParaFila(empleado)); 

    } 

 

   

    public static void main(String args[]) { 

 

        java.awt.EventQueue.invokeLater(new Runnable() { 

            public void run() { 

                new FrmEmpleado().setVisible(true); 

            } 

        }); 

    } 

 

    // Variables declaration - do not modify                      

    private javax.swing.JButton btnAgregar; 

    private javax.swing.JButton btnEditar; 

    private javax.swing.JButton btnEliminar; 

    private javax.swing.JButton btnNuevo; 

    private javax.swing.JLabel jLabel1; 

    private javax.swing.JLabel jLabel2; 

    private javax.swing.JLabel jLabel3; 

    private javax.swing.JLabel jLabel4; 

    private javax.swing.JScrollPane jScrollPane1; 

    private javax.swing.JLabel lblPrecio; 

    private javax.swing.JTable tblEmpleados; 

    private javax.swing.JTextField txtNombre; 

    private javax.swing.JTextField txtNumero; 

    private javax.swing.JTextField txtSueldo; 

    // End of variables declaration                    

 

}*/
