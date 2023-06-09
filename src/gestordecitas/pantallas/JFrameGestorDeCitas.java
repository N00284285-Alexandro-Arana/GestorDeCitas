/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas.pantallas;

import entidades.Cita;
import gestordecitass.GestorDeCitas;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author PierooA.S
 */
public class JFrameGestorDeCitas extends javax.swing.JFrame {

    List<Cita> listaCitas;  //lista principal
    DefaultListModel<String> modelListCitasShow;  //lista secundaria
    /**
     * Creates new form JFrameGestorDeCitas
     */
    public JFrameGestorDeCitas() {
        initComponents();
        
        listaCitas=GestorDeCitas.citasEnElSistema;
        modelListCitasShow= new DefaultListModel<>();
        this.lstCitas.setModel(modelListCitasShow);
        modelListCitasShow.removeAllElements();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCitas = new javax.swing.JList<>();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_cancelar_cita = new javax.swing.JButton();
        btn_crear_cita = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstCitas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCitas);

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_cancelar_cita.setText("Cancelar Cita");
        btn_cancelar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_citaActionPerformed(evt);
            }
        });

        btn_crear_cita.setText("Nueva Cita");
        btn_crear_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_citaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestor de Citas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btn_cancelar_cita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addComponent(btn_crear_cita)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_buscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crear_cita)
                    .addComponent(btn_cancelar_cita))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        volverACargarCitas(txt_buscar.getText().trim());
 
    }//GEN-LAST:event_btn_buscarActionPerformed

    
    //Ctrl + R para cambiar nombre de variables directamente en todo el proyecto
    public void agregarCita(Cita NuevaCita){
        listaCitas.add(NuevaCita);
        modelListCitasShow.removeAllElements();
        for(Cita citaDeLista: listaCitas){
            modelListCitasShow.addElement(citaDeLista.mostrarDatos());
        }
    }
    /**
     * Este metodo va a eliminar lo que se está mostrando y lo
     * reemplazará con todos los elementos de la lista 
     * 
     */
    private void volverACargarCitas(String criterio){
        //Recuerda que los cambios de la lista se hacen al modelo 
        //No al objeto JList 
        
        //eliminar todos los elementos de la lista 
        modelListCitasShow.removeAllElements();
        
        //Agregar todos los elementos de la lista de citas al 
        //componente gráfico
        
        for(Cita cita: listaCitas){
            //Agrega a la vista siempre y cuando el nombre del
            //paciente coincida con el criterio 
            if(cita.getPaciente().getNombre().contains(criterio)){
                modelListCitasShow.addElement(cita.mostrarDatos());
            }
        }
        
        
    }
    private void btn_cancelar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_citaActionPerformed
        // TODO add your handling code here:
        
        int index=lstCitas.getSelectedIndex();
        listaCitas.remove(index);
        volverACargarCitas("");
        
        
    }//GEN-LAST:event_btn_cancelar_citaActionPerformed

    private void btn_crear_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_citaActionPerformed
        // TODO add your handling code here:
        
        //Creo un objeto de la ventana cita
        //Debo mandar la referencia a su clase padre
        JFrameCita nuevaCita = new JFrameCita(this);
        //Centro la ventana 
        nuevaCita.setLocationRelativeTo(this);
        //La hago visible 
        nuevaCita.setVisible(true);
        //Y ahora hago invisible la ventana actual 
        //que es el gestor de citas 
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_crear_citaActionPerformed

    private void lstCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCitasMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()>1){
            JFrameCita cita= new JFrameCita(this,listaCitas.get(lstCitas.getSelectedIndex()));
            cita.setLocationRelativeTo(null);
            
            cita.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lstCitasMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestorDeCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar_cita;
    private javax.swing.JButton btn_crear_cita;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstCitas;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
