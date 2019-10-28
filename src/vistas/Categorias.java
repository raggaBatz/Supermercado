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
public class Categorias extends javax.swing.JFrame {
    
    // SEGMENTO DE LISTA
    class Categoria {
        String id;
        String descripcion;
        Categoria sig;
    }
    
    private Categoria raiz;
     
    public void insertar(String id, String categoria) {
        Categoria nuevo;
        nuevo = new Categoria();
        nuevo.id = id;
        nuevo.descripcion = categoria;
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
        Categoria reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print(reco.descripcion+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
    
    public int cantidad() {
        int cant=0;
        Categoria reco=raiz;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }
        return cant;
    }
    
    //TERMINA SEGMENTO DE LISTA
    
    //LinkedList<Categoria> object = new LinkedList<Categoria>(); 

    /**
     * Creates new form Categorias
     */
    public Categorias() throws IOException{
        initComponents();
        
        textboxCategoria.setText("");
        //SE CREA MODELO PARA LA TABLA QUE SE MOSTRARA
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Categoria");
        //JTable table = new JTable(model);
        
        
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

        botonAgregarCategoria = new javax.swing.JButton();
        textboxCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategoria = new javax.swing.JTable();
        botonEliminarCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAgregarCategoria.setText("Agregar");
        botonAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCategoriaActionPerformed(evt);
            }
        });

        textboxCategoria.setText("jTextField1");
        textboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textboxCategoriaActionPerformed(evt);
            }
        });

        tablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCategoria);
        if (tablaCategoria.getColumnModel().getColumnCount() > 0) {
            tablaCategoria.getColumnModel().getColumn(0).setResizable(false);
            tablaCategoria.getColumnModel().getColumn(1).setResizable(false);
        }

        botonEliminarCategoria.setText("Eliminar");
        botonEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarCategoria)
                    .addComponent(botonEliminarCategoria))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonAgregarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarCategoria)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonAgregarCategoria.getAccessibleContext().setAccessibleName("botonAgregarCategoria");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCategoriaActionPerformed
        // SE OBTIENE EL MODELO DE LA TABLA Y SE AGREGAN LOS VALORES A AGREGAR
        DefaultTableModel model = (DefaultTableModel) tablaCategoria.getModel();
        model.addRow(new Object[]{generarID(),textboxCategoria.getText()});
        textboxCategoria.setText("");
        sincronizar();
    }//GEN-LAST:event_botonAgregarCategoriaActionPerformed

    private void textboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textboxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textboxCategoriaActionPerformed

    private void botonEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCategoriaActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.tablaCategoria.getModel();
        int[] rows = tablaCategoria.getSelectedRows();
        for(int i=0;i<rows.length;i++){
          model.removeRow(rows[i]-i);
        }
        sincronizar();
    }//GEN-LAST:event_botonEliminarCategoriaActionPerformed

    private void sincronizar(){
        DefaultTableModel model = (DefaultTableModel) this.tablaCategoria.getModel();           
        raiz=null; 
        for(int row = 0;row < model.getRowCount();row++) {
            String id = (String)model.getValueAt(row,0);
            String cat = (String)model.getValueAt(row,1);
            insertar(id, cat);
        }
        sincronizarArchivo();
    }
    
    private void sincronizarArchivo(){
        String path = new File("src/archivos/Categorias.txt").getAbsolutePath();
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
            
            Categoria reco=raiz;
            while (reco!=null) {
                writer.write(reco.id + "," + reco.descripcion + System.getProperty( "line.separator" ));
                reco=reco.sig;
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargar();
    }
    
    private void cargar(){
        cargarArchivo();
        DefaultTableModel model = (DefaultTableModel) this.tablaCategoria.getModel();
        Categoria reco=raiz;
        model.setRowCount(0);
        while (reco!=null) {
            DefaultTableModel modelotabla = (DefaultTableModel) tablaCategoria.getModel();
            modelotabla.addRow(new Object[]{reco.id,reco.descripcion});
            reco=reco.sig;
        }
    }
    
    private void cargarArchivo(){
        String path = new File("src/archivos/Categorias.txt").getAbsolutePath();
        File file = new File(path);
        BufferedReader br = null; 
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        raiz=null;
        String st; 
        try {
            while ((st = br.readLine()) != null){
                String[] fila = st.split(",");
                insertar(fila[0], fila[1]);
            }
        } catch (IOException ex) {
            Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private String generarID(){
        DefaultTableModel model = (DefaultTableModel) this.tablaCategoria.getModel();
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
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Categorias().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCategoria;
    private javax.swing.JButton botonEliminarCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCategoria;
    private javax.swing.JTextField textboxCategoria;
    // End of variables declaration//GEN-END:variables
}
