/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Ibyte
 */
public class pomboJframe extends javax.swing.JFrame {

    /**
     * Creates new form pomboJframe
     */
    public pomboJframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jpanel_new_pombo = new javax.swing.JPanel();
        label_criarpombo = new javax.swing.JLabel();
        img_pombo = new javax.swing.JLabel();
        label_qtd_msg = new javax.swing.JLabel();
        label_tc = new javax.swing.JLabel();
        label_tv = new javax.swing.JLabel();
        label_td = new javax.swing.JLabel();
        jftf_msg = new javax.swing.JFormattedTextField();
        jftf_tc = new javax.swing.JFormattedTextField();
        jftf_tv = new javax.swing.JFormattedTextField();
        jftf_td = new javax.swing.JFormattedTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_criarpombo.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        label_criarpombo.setText("Criar Pombo");

        img_pombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dove32.png"))); // NOI18N

        label_qtd_msg.setText("Quantidade de Mensagens:");

        label_tc.setText("Tempo de carga:");

        label_tv.setText("Tempo de Voo:");

        label_td.setText("Tempo de descarga:");

        jftf_msg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jftf_msg.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jftf_tv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_tvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_new_pomboLayout = new javax.swing.GroupLayout(jpanel_new_pombo);
        jpanel_new_pombo.setLayout(jpanel_new_pomboLayout);
        jpanel_new_pomboLayout.setHorizontalGroup(
            jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                        .addComponent(label_qtd_msg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftf_msg))
                    .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                        .addComponent(label_tc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jftf_tc))
                    .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                        .addComponent(label_tv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jftf_tv))
                    .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                        .addGroup(jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(img_pombo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_criarpombo))
                            .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                                .addComponent(label_td)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jftf_td, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanel_new_pomboLayout.setVerticalGroup(
            jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_new_pomboLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img_pombo)
                    .addComponent(label_criarpombo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_qtd_msg)
                    .addComponent(jftf_msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tc)
                    .addComponent(jftf_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tv)
                    .addComponent(jftf_tv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jpanel_new_pomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_td)
                    .addComponent(jftf_td, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpanel_new_pombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanel_new_pombo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftf_tvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_tvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_tvActionPerformed

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
            java.util.logging.Logger.getLogger(pomboJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pomboJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pomboJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pomboJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pomboJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_pombo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField jftf_msg;
    private javax.swing.JFormattedTextField jftf_tc;
    private javax.swing.JFormattedTextField jftf_td;
    private javax.swing.JFormattedTextField jftf_tv;
    private javax.swing.JPanel jpanel_new_pombo;
    private javax.swing.JLabel label_criarpombo;
    private javax.swing.JLabel label_qtd_msg;
    private javax.swing.JLabel label_tc;
    private javax.swing.JLabel label_td;
    private javax.swing.JLabel label_tv;
    // End of variables declaration//GEN-END:variables
}