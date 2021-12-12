/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author ASUS
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        ComputeBMI = new javax.swing.JButton();
        person_weight = new javax.swing.JTextField();
        person_height = new javax.swing.JTextField();
        result_bmı = new javax.swing.JTextField();
        yourheight = new javax.swing.JLabel();
        yourweight = new javax.swing.JLabel();
        calculateBMI = new javax.swing.JLabel();
        cm = new javax.swing.JLabel();
        kg = new javax.swing.JLabel();
        yourBMI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        ComputeBMI.setBackground(new java.awt.Color(255, 255, 153));
        ComputeBMI.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        ComputeBMI.setForeground(new java.awt.Color(102, 0, 0));
        ComputeBMI.setText("COMPUTE BMI:");
        ComputeBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeBMIActionPerformed(evt);
            }
        });

        person_weight.setBackground(new java.awt.Color(204, 255, 204));
        person_weight.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        person_weight.setForeground(new java.awt.Color(0, 102, 102));
        person_weight.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        person_weight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        person_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_weightActionPerformed(evt);
            }
        });

        person_height.setBackground(new java.awt.Color(204, 255, 204));
        person_height.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        person_height.setForeground(new java.awt.Color(0, 102, 102));
        person_height.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        person_height.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        person_height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_heightActionPerformed(evt);
            }
        });

        result_bmı.setEditable(false);
        result_bmı.setBackground(new java.awt.Color(255, 204, 153));
        result_bmı.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        result_bmı.setForeground(new java.awt.Color(102, 0, 153));
        result_bmı.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        result_bmı.setText("...");
        result_bmı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_bmıActionPerformed(evt);
            }
        });

        yourheight.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        yourheight.setForeground(new java.awt.Color(204, 0, 0));
        yourheight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        yourheight.setText("Your Height :");

        yourweight.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        yourweight.setForeground(new java.awt.Color(204, 0, 0));
        yourweight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        yourweight.setText("Your Weight :");

        calculateBMI.setBackground(new java.awt.Color(255, 255, 204));
        calculateBMI.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        calculateBMI.setForeground(new java.awt.Color(255, 102, 0));
        calculateBMI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculateBMI.setText("CALCULATE Your BMI:");

        cm.setText("(centimeters)");

        kg.setText("(kilograms)");

        yourBMI.setBackground(new java.awt.Color(204, 204, 255));
        yourBMI.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        yourBMI.setForeground(new java.awt.Color(51, 0, 102));
        yourBMI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourBMI.setText("YOUR BMI:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yourweight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourheight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculateBMI)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(yourBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(result_bmı, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComputeBMI)
                    .addComponent(person_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(person_height, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cm))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kg)
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(calculateBMI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(yourheight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cm)
                    .addComponent(person_height, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(yourweight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kg)
                    .addComponent(person_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(ComputeBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_bmı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void result_bmıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_bmıActionPerformed
      
    }//GEN-LAST:event_result_bmıActionPerformed

    private void ComputeBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeBMIActionPerformed
       calculate();
        
    }//GEN-LAST:event_ComputeBMIActionPerformed

    private void person_heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_heightActionPerformed
        
    }//GEN-LAST:event_person_heightActionPerformed

    private void person_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_weightActionPerformed
       
    }//GEN-LAST:event_person_weightActionPerformed
       private void calculate(){
          double result;
          result= Double.parseDouble(person_weight.getText())/
                    (Double.parseDouble(person_height.getText())*(0.01)
                  *Double.parseDouble(person_height.getText())*(0.01));
          result_bmı.setText(String.valueOf(result));
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComputeBMI;
    private javax.swing.JLabel calculateBMI;
    private javax.swing.JLabel cm;
    private javax.swing.JLabel kg;
    private javax.swing.JTextField person_height;
    private javax.swing.JTextField person_weight;
    private javax.swing.JTextField result_bmı;
    private javax.swing.JLabel yourBMI;
    private javax.swing.JLabel yourheight;
    private javax.swing.JLabel yourweight;
    // End of variables declaration//GEN-END:variables
}
