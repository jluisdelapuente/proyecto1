package Precentacion;
import java.awt.Color;
import Logica.DaoProducto;
import Entidades.Productos;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
public class frmProductos extends javax.swing.JFrame {
    int op=0;
    int IDPRODUCTO=0;
    public frmProductos() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        Listar_Productos();
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTableHeader header =jTable1.getTableHeader();
        header.setForeground(Color.RED);
        header.setBackground(Color.BLACK);
        header.setFont(new java.awt.Font("Verdana", 1, 12));
        header.setReorderingAllowed(false);//impide movimiento de columnas
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width - this.getWidth())/2,(screenSize.height - this.getHeight())/ 2);
        TableColumnModel modeloColumna =jTable1.getColumnModel();
        TableColumn columnaTabla;
        columnaTabla = modeloColumna.getColumn(0); columnaTabla.setPreferredWidth(50);
        columnaTabla = modeloColumna.getColumn(1); columnaTabla.setPreferredWidth(190);
        columnaTabla = modeloColumna.getColumn(2); columnaTabla.setPreferredWidth(310);
        columnaTabla = modeloColumna.getColumn(3); columnaTabla.setPreferredWidth(80);
        columnaTabla = modeloColumna.getColumn(4); columnaTabla.setPreferredWidth(110);
        jTable1.setRowHeight(30);
        this.setResizable(false);
        this.setTitle("MANTENIMIENTO DE PRODUCTOS");
    }
    static DefaultTableModel tabla=new DefaultTableModel(
        new Object[][]{ },new String[]{"ID","NOMRE","DESCRIPCION","PRECIO","CANTIDAD"}){
        Class[] types = new Class []{
            java.lang.String.class,java.lang.String.class,
            java.lang.String.class,java.lang.String.class,java.lang.String.class
        };
        boolean[] canEdit = new boolean []{false,false,false,false,false};
        public Class getColumnClass(int columnIndex){
            return types [columnIndex];
        }
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    };
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(tabla);
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "DATOS DE PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trajan Pro", 1, 15), new java.awt.Color(249, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 5));
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 5));
        jLabel3.setText("DESCRIPCION:");

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 5));
        jLabel4.setText("PRECIO:");

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 5));
        jLabel5.setText("CANTIDAD:");

        txtNombre.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N

        txtprecio.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N

        txtCantidad.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setText("<html><center>MANTENIMIENTO DE PRODUCTOS<br></center></html>");
        jLabel1.setForeground(new java.awt.Color(0, 255, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 255, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 5));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 0));
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 255, 0));
        jButton5.setText("LISTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 255, 0));
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Trajan Pro", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 0));
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void JMSGBOX(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    public String getNombre(){return txtNombre.getText().trim();}
    public String getDescripcion(){return txtDescripcion.getText().trim();}
    public String getPrecio(){return txtprecio.getText().trim();}
    public String getCantidad(){return txtCantidad.getText().trim();}
    public void Aceptar(){
        if(getNombre().equalsIgnoreCase("") || getDescripcion().equals("") || 
                getPrecio().equalsIgnoreCase("") || getCantidad().equalsIgnoreCase("")){
            JMSGBOX("Ingrese todos Los Datos");
        }else{
            if(op==0){
                DaoProducto productos=new DaoProducto();
                Productos producto=new Productos();
                producto.setNombre(getNombre().toUpperCase());
                producto.setDescripcion(getDescripcion().toUpperCase());
                producto.setPrecio(Double.parseDouble(getPrecio()));
                producto.setStock(Double.parseDouble(getCantidad()));
                productos.Agregar_Producto(producto);
            }else{
                DaoProducto productos=new DaoProducto();
                Productos producto=new Productos();
                producto.setNombre(getNombre().toUpperCase());
                producto.setDescripcion(getDescripcion().toUpperCase());
                producto.setPrecio(Double.parseDouble(getPrecio()));
                producto.setStock(Double.parseDouble(getCantidad()));
                productos.Modificar_Producto(IDPRODUCTO,producto);
            }
            op=0;IDPRODUCTO=0; Listar_Productos(); Limpia_Textos();
        }
    }
    public void Limpia_Textos(){
        txtCantidad.setText("");txtDescripcion.setText("");txtNombre.setText("");txtprecio.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        op=0;
        Aceptar();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public void Listar_Productos(){
        LimpiaTabla(); 
        DaoProducto daoProducto = new DaoProducto();
        ArrayList<Productos> productos = new ArrayList<Productos>();
        productos=daoProducto.ListaProductos(); 
        Iterator iterator = productos.iterator();
        while (iterator.hasNext()) {
            Productos producto = new Productos(); 
            producto = (Productos) iterator.next();
            Object data[]={producto.getId(),producto.getNombre(),producto.getDescripcion(),producto.getPrecio(),producto.getStock()};
            tabla.addRow(data);  
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DaoProducto producto=new DaoProducto();
        String valor=jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        producto.Eliminar_Producto(Integer.parseInt(valor));
        tabla.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==2){
            int fila=jTable1.getSelectedRow();
            IDPRODUCTO=Integer.parseInt(String.valueOf(jTable1.getValueAt(fila,0)));
            txtNombre.setText(String.valueOf(jTable1.getValueAt(fila,1)));
            txtDescripcion.setText(jTable1.getValueAt(fila,2).toString());
            txtprecio.setText(String.valueOf(jTable1.getValueAt(fila, 3)));
            txtCantidad.setText(String.valueOf(jTable1.getValueAt(fila,4)));
            op=1;
        }
    }//GEN-LAST:event_jTable1MouseClicked
    public void LimpiaTabla(){
        int filas= jTable1.getRowCount();
        for(int fila=0;fila<filas;fila++){tabla.removeRow(0);}
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DaoProducto daoProducto = new DaoProducto();
        ArrayList<Productos> productos = new ArrayList<Productos>();
        String valor=JOptionPane.showInputDialog(null,"Ingrese Id del producto a Buscar:");
        productos=daoProducto.Buscar_Producto(Integer.parseInt(valor));
        Iterator iterator = productos.iterator();
        LimpiaTabla();
        while (iterator.hasNext()) {
            Productos producto = new Productos();
            producto = (Productos) iterator.next();
            Object data[]={producto.getId(),producto.getNombre(),producto.getDescripcion(),producto.getPrecio(),producto.getStock()};
            tabla.addRow(data);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Listar_Productos();
    }//GEN-LAST:event_jButton5ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}