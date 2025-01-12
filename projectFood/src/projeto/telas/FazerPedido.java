/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.telas;

/**
 *
 * @author mmdam
 */
public class FazerPedido extends javax.swing.JFrame {

    /**
     * Creates new form fazerPedido
     */
    public FazerPedido() {
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

        jLabel1 = new javax.swing.JLabel();
        sanduichesButton = new javax.swing.JButton();
        sobremesasButton = new javax.swing.JButton();
        combosButton = new javax.swing.JButton();
        bebidasButton = new javax.swing.JButton();
        acompanhamentoButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        verPedidoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Faça seu pedido!");

        sanduichesButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sanduichesButton.setText("Sanduiches");
        sanduichesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanduichesButtonActionPerformed(evt);
            }
        });

        sobremesasButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sobremesasButton.setText("Sobremesas");
        sobremesasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobremesasButtonActionPerformed(evt);
            }
        });

        combosButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        combosButton.setText("Combos");
        combosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combosButtonActionPerformed(evt);
            }
        });

        bebidasButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bebidasButton.setText("Bebidas");
        bebidasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidasButtonActionPerformed(evt);
            }
        });

        acompanhamentoButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acompanhamentoButton.setText("Acompanhamento");

        voltarButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        verPedidoButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        verPedidoButton.setText("Ver Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verPedidoButton)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bebidasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sobremesasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sanduichesButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(55, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(acompanhamentoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobremesasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sanduichesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bebidasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(acompanhamentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verPedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sanduichesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanduichesButtonActionPerformed
        EscolherLanche el = new EscolherLanche();
        el.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sanduichesButtonActionPerformed

    private void combosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combosButtonActionPerformed

    private void bebidasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebidasButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void sobremesasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobremesasButtonActionPerformed
        EscolherSobremesa es = new EscolherSobremesa();
        es.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sobremesasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acompanhamentoButton;
    private javax.swing.JButton bebidasButton;
    private javax.swing.JButton combosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sanduichesButton;
    private javax.swing.JButton sobremesasButton;
    private javax.swing.JButton verPedidoButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
