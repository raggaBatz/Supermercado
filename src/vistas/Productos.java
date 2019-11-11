/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAMING
 */
public class Productos extends javax.swing.JFrame {
    
    class Producto {
        String id;
        String cantidad;
        String descripcion;
        String precio;
        Producto sig;
    }
    private Producto raiz;
    
    public void insertar(String id, String cantidad,String producto, String precio) {
        Producto nuevo;
        nuevo = new Producto();
        nuevo.id = id;
        nuevo.cantidad = cantidad;
        nuevo.descripcion = producto;
        nuevo.precio = precio;
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    public void imprimir() {
        Producto reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print(reco.cantidad+"-"+reco.descripcion+"-" + reco.precio+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
    public int cantidad() {
        int cant=0;
        Producto reco=raiz;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }
        return cant;
    }

    /**
     * Creates new form Productos
     */
    public Productos() throws IOException{
        initComponents();
        
        cantidad12.setText("");
        descripcion12.setText("");
        precio12.setText("");
        
        //SE CREA MODELO PARA LA TABLA QUE SE MOSTRARA
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Cantidad");
        model.addColumn("Descripcion");
        model.addColumn("Precio");
        
          //CARGANDO LISTA
        cargar();
        //LISTA
        raiz=null; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidad12 = new javax.swing.JTextField();
        descripcion12 = new javax.swing.JTextField();
        precio12 = new javax.swing.JTextField();
        BotonAgragarproducto = new javax.swing.JButton();
        botoneliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablaproducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(589, 476));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("Registro de Productos");

        jLabel3.setText("CANTIDAD");

        jLabel4.setText("DESCRIPCION");

        jLabel5.setText("PRECIO");

        BotonAgragarproducto.setText("Agregar");
        BotonAgragarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgragarproductoActionPerformed(evt);
            }
        });

        botoneliminar.setText("Eliminar");
        botoneliminar.setToolTipText("");
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("CATEGORIA");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Tablaproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cantidad", "Descripcion", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tablaproducto);
        if (Tablaproducto.getColumnModel().getColumnCount() > 0) {
            Tablaproducto.getColumnModel().getColumn(0).setResizable(false);
            Tablaproducto.getColumnModel().getColumn(1).setResizable(false);
            Tablaproducto.getColumnModel().getColumn(2).setResizable(false);
            Tablaproducto.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidad12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descripcion12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precio12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAgragarproducto)
                            .addComponent(botoneliminar))
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(cantidad12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(descripcion12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAgragarproducto)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(botoneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 26, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgragarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgragarproductoActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) Tablaproducto.getModel();
        model.addRow(new Object[]{generarID(),cantidad12.getText(),descripcion12.getText(),precio12.getText()});
        cantidad12.setText("");
        descripcion12.setText("");
        precio12.setText("");
        sincronizar();
    }//GEN-LAST:event_BotonAgragarproductoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add yohandling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) this.Tablaproducto.getModel();
        int[] rows = Tablaproducto.getSelectedRows();
        for(int i=0;i<rows.length;i++){
          model.removeRow(rows[i]-i); 
        
        }
        sincronizar();
    }//GEN-LAST:event_botoneliminarActionPerformed

    
    private void sincronizar(){
        DefaultTableModel model = (DefaultTableModel) this.Tablaproducto.getModel();
        raiz=null; 
        for(int row = 0;row < model.getRowCount();row++) {
            String id = (String)model.getValueAt(row,0);
            String cat = (String)model.getValueAt(row,1);
            String desc = (String)model.getValueAt(row,2);
            String prec = (String)model.getValueAt(row,3);
           insertar(id, cat, desc, prec);
        }
        sincronizarArchivo();
    }
    
    private void sincronizarArchivo(){
        String path = new File("src/archivos/Productos.txt").getAbsolutePath();
        File filedelete = new File(path);
        filedelete.delete();
        
        File file = new File(path);

        FileWriter writer = null;
        
        try {
            if (file.createNewFile())
            {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
            
            writer = new FileWriter(file);
            
            Producto reco=raiz;
            while (reco!=null) {
                writer.write(reco.id + "," + reco.cantidad + "," + reco.descripcion + "," + reco.precio + System.getProperty( "line.separator" ));
                reco=reco.sig;
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargar();
    }
    
    private void cargar(){
        cargarArchivo();
        DefaultTableModel model = (DefaultTableModel) this.Tablaproducto.getModel();
        Producto reco=raiz;
        model.setRowCount(0);
        while (reco!=null) {
            DefaultTableModel modelotabla = (DefaultTableModel) Tablaproducto.getModel();
            modelotabla.addRow(new Object[]{reco.id,reco.cantidad,reco.descripcion,reco.precio});
            reco=reco.sig;
        }
    }
    
    private void cargarArchivo(){
        String path = new File("src/archivos/Productos.txt").getAbsolutePath();
        File file = new File(path);
        BufferedReader br = null; 
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        raiz=null;
        String st; 
        try {
            while ((st = br.readLine()) != null){
                String[] fila = st.split(",");
                insertar(fila[0], fila[1], fila[2],fila[3]);
            }
        } catch (IOException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private String generarID(){
        DefaultTableModel model = (DefaultTableModel) this.Tablaproducto.getModel();
        int valor=0; 
        for(int row = 0;row < model.getRowCount();row++) {
            //for(int col = 0;col < dm2.getColumnCount();col++) {
            valor = Integer.parseInt((String)model.getValueAt(row,0));
            //}
        }
        valor++;
        return String.valueOf(valor);
    }
    
    String random(){
        Random r = new Random();
        int val = r.nextInt((9999 - 1) + 1) + 1;
        return String.valueOf(val);
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Productos().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgragarproducto;
    private javax.swing.JTable Tablaproducto;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JTextField cantidad12;
    private javax.swing.JTextField descripcion12;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField precio12;
    // End of variables declaration//GEN-END:variables
}
