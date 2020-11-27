/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Departamento extends javax.swing.JFrame {

    public Departamento() {
        initComponents();

        Tablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDepartamentos = new javax.swing.JLabel();
        scrDepartamento = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        PanDatos = new javax.swing.JPanel();
        lblDNombre = new javax.swing.JLabel();
        txtDName = new javax.swing.JTextField();
        lblDNum = new javax.swing.JLabel();
        txtDNum = new javax.swing.JTextField();
        lblLocalización = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnEMP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Departamentos");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lblDepartamentos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDepartamentos.setText("Departamentos ");

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Deptno", "DName", "Loc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartamentosMouseClicked(evt);
            }
        });
        scrDepartamento.setViewportView(tblDepartamentos);

        PanDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        lblDNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDNombre.setText("Nombre:");

        txtDName.setName("jtfDNombre"); // NOI18N
        txtDName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNameActionPerformed(evt);
            }
        });

        lblDNum.setText("Numero:");

        txtDNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNumActionPerformed(evt);
            }
        });

        lblLocalización.setText("Localización:");

        txtLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanDatosLayout = new javax.swing.GroupLayout(PanDatos);
        PanDatos.setLayout(PanDatosLayout);
        PanDatosLayout.setHorizontalGroup(
            PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanDatosLayout.createSequentialGroup()
                        .addComponent(lblDNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDNum))
                    .addGroup(PanDatosLayout.createSequentialGroup()
                        .addComponent(lblDNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanDatosLayout.createSequentialGroup()
                        .addComponent(lblLocalización)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLoc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanDatosLayout.createSequentialGroup()
                        .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanDatosLayout.setVerticalGroup(
            PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNombre)
                    .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNum)
                    .addComponent(txtDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalización)
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\luiis\\Desktop\\5to\\Topicos\\TF_IMGS\\return_72.png")); // NOI18N
        btnHome.setText("Menu Principal");
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnEMP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEMP.setIcon(new javax.swing.ImageIcon("C:\\Users\\luiis\\Desktop\\5to\\Topicos\\TF_IMGS\\Emp_72.png")); // NOI18N
        btnEMP.setText("Empleados");
        btnEMP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEMP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepartamentos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHome)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblDepartamentos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(scrDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNameActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int deptno = Integer.parseInt(txtDNum.getText());

        try {
            Connection con = Conexion.getConexion();
            
            

            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM DEPT WHERE deptno=? ");

            ps.setInt(1, deptno);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Eliminacion Exitosa!!!");
            Limpiar();
            Tablas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String dname = txtDName.getText();
        int deptno = Integer.parseInt(txtDNum.getText());
        String loc = txtLoc.getText();

        try {
            Connection con = Conexion.getConexion();

            PreparedStatement ps;
            ps = con.prepareStatement("INSERT INTO DEPT (deptno, dname, loc) VALUES (?,?,?) ");

            ps.setInt(1, deptno);
            ps.setString(2, dname);
            ps.setString(3, loc);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Agregado Exitoso!!!");
            Limpiar();
            Tablas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocActionPerformed

    private void txtDNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNumActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartamentosMouseClicked

        try {
            int fila = tblDepartamentos.getSelectedRow();
            int deptno = Integer.parseInt(tblDepartamentos.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT dname, loc FROM DEPT WHERE deptno=?");
            ps.setInt(1, deptno);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtDNum.setText(String.valueOf(deptno));
                txtDName.setText(rs.getString("dname"));
                txtLoc.setText(rs.getString("loc"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblDepartamentosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String dname = txtDName.getText();
        int deptno = Integer.parseInt(txtDNum.getText());
        String loc = txtLoc.getText();

        try {
            Connection con = Conexion.getConexion();

            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE DEPT SET deptno=?, dname=?, loc=? WHERE deptno=? ");

            ps.setInt(1, deptno);
            ps.setString(2, dname);
            ps.setString(3, loc);
            ps.setInt(4, deptno);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificacion Exitosa!!!");
            Limpiar();
            Tablas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btnEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMPActionPerformed
        this.setVisible(false);
        Empleado e = new Empleado();
        e.setVisible(true);
    }//GEN-LAST:event_btnEMPActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.setVisible(false);
        Menu ho = new Menu();
        ho.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departamento().setVisible(true);
            }
        });
    }

    public void Limpiar() {
        txtDName.setText("");
        txtDNum.setText("");
        txtLoc.setText("");
    }

    public void Tablas() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblDepartamentos.getModel();

        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;

        int Columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT deptno, dname, loc FROM DEPT");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            Columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] Fila = new Object[Columnas];
                for (int indice = 0; indice < Columnas; indice++) {
                    Fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(Fila);
            }

        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E.toString());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanDatos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEMP;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel lblDNombre;
    private javax.swing.JLabel lblDNum;
    private javax.swing.JLabel lblDepartamentos;
    private javax.swing.JLabel lblLocalización;
    private javax.swing.JScrollPane scrDepartamento;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtDNum;
    private javax.swing.JTextField txtLoc;
    // End of variables declaration//GEN-END:variables
}
