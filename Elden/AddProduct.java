
package Elden;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class AddProduct extends javax.swing.JFrame {
 
    static POS pos;
    public AddProduct() {
        initComponents();
        pos = new POS();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productNameFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        priceFld = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Product Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 61, -1, 29));
        getContentPane().add(productNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 61, 123, 29));

        jLabel2.setText("Price");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 77, 26));
        getContentPane().add(priceFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 123, 26));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 140, 40));

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        JButton button = new JButton();
        String name = productNameFld.getText();
        int price = Integer.parseInt(priceFld.getText());
        int quan = Integer.parseInt(pos.jLabel6.getText());
        ++quan;
        
        button.setSize(100,100);
        button.setText(name);
        
        pos.jPanel3.add(button);

        
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        pos.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField priceFld;
    private javax.swing.JTextField productNameFld;
    // End of variables declaration//GEN-END:variables
}
