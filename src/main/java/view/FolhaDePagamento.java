/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

/**
 *
 * @author Tacyrose
 */
public class FolhaDePagamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionario
     */
    public FolhaDePagamento() {
        initComponents();
    }
    
    public void LoadTableFolha(model.FolhaDePagamento folha) {
        
        folha.calcularSalarioLiquido();
        txt_salario_bruto.setText(String.valueOf(folha.getSalariobruto()));
        txt_plus_salario.setText(String.valueOf(folha.getPlussalario()));
        txt_desconto_inss.setText(String.valueOf(folha.getInss()));
        txt_desconto_irrf.setText(String.valueOf(folha.getIrrf()));
        txt_salario_liquido.setText(String.valueOf(folha.getSalarioliquido()));
        lbl_taxa_irrf.setText("(" + folha.getPercIrrf() + "%)");
        lb_taxa_inss.setText("(" + folha.getPercInss() + "%)");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_salario_bruto = new javax.swing.JLabel();
        txt_salario_bruto = new javax.swing.JTextField();
        lbl_salario_bruto1 = new javax.swing.JLabel();
        lbl_salario_bruto2 = new javax.swing.JLabel();
        lbl_salario_bruto3 = new javax.swing.JLabel();
        lbl_salario_bruto4 = new javax.swing.JLabel();
        txt_plus_salario = new javax.swing.JTextField();
        txt_desconto_inss = new javax.swing.JTextField();
        txt_desconto_irrf = new javax.swing.JTextField();
        txt_salario_liquido = new javax.swing.JTextField();
        lb_taxa_inss = new javax.swing.JLabel();
        lbl_taxa_irrf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_salario_bruto.setText("Salário Bruto (R$)");

        txt_salario_bruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salario_brutoActionPerformed(evt);
            }
        });

        lbl_salario_bruto1.setText("Plús Salário (R$)");

        lbl_salario_bruto2.setText("Desconto Inss");

        lbl_salario_bruto3.setText("Salário Líquido (R$)");

        lbl_salario_bruto4.setText("Desconto IRRF");

        txt_plus_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plus_salarioActionPerformed(evt);
            }
        });

        txt_desconto_inss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_desconto_inssActionPerformed(evt);
            }
        });

        txt_desconto_irrf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_desconto_irrfActionPerformed(evt);
            }
        });

        txt_salario_liquido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salario_liquidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_salario_bruto)
                    .addComponent(lbl_salario_bruto1)
                    .addComponent(lbl_salario_bruto2)
                    .addComponent(lbl_salario_bruto4)
                    .addComponent(lbl_salario_bruto3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_salario_liquido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_desconto_irrf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_taxa_irrf))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_desconto_inss, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_taxa_inss))
                    .addComponent(txt_plus_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salario_bruto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_salario_bruto)
                    .addComponent(txt_salario_bruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_salario_bruto1)
                    .addComponent(txt_plus_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_salario_bruto2)
                    .addComponent(txt_desconto_inss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_taxa_inss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_salario_bruto4)
                    .addComponent(txt_desconto_irrf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_taxa_irrf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_salario_bruto3)
                    .addComponent(txt_salario_liquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txt_salario_bruto.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_salario_brutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salario_brutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salario_brutoActionPerformed

    private void txt_plus_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plus_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plus_salarioActionPerformed

    private void txt_desconto_inssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_desconto_inssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_desconto_inssActionPerformed

    private void txt_desconto_irrfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_desconto_irrfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_desconto_irrfActionPerformed

    private void txt_salario_liquidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salario_liquidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salario_liquidoActionPerformed

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
            java.util.logging.Logger.getLogger(FolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FolhaDePagamento().setVisible(true);
            }
        });
    }

    @Override
    public void dispose() {
        this.dispose(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_taxa_inss;
    private javax.swing.JLabel lbl_salario_bruto;
    private javax.swing.JLabel lbl_salario_bruto1;
    private javax.swing.JLabel lbl_salario_bruto2;
    private javax.swing.JLabel lbl_salario_bruto3;
    private javax.swing.JLabel lbl_salario_bruto4;
    private javax.swing.JLabel lbl_taxa_irrf;
    private javax.swing.JTextField txt_desconto_inss;
    private javax.swing.JTextField txt_desconto_irrf;
    private javax.swing.JTextField txt_plus_salario;
    private javax.swing.JTextField txt_salario_bruto;
    private javax.swing.JTextField txt_salario_liquido;
    // End of variables declaration//GEN-END:variables
}
