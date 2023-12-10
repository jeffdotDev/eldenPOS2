
package Elden;
import Fernandez.StudentList;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
public class POS extends javax.swing.JFrame {
   
    static StudentList student;
    public POS() {
        initComponents();
        student = new StudentList();
        student.connectFromDB();
        
    }
    
    public void tryTable(int id, String product, int qty, int price){
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        
        double totalQp = qty * price;
        for(int add = 0; add <table1.getRowCount() ; add++){
            if(product == table1.getValueAt(add,1)){
                model.removeRow(table1.convertRowIndexToModel(add));
            }
        }
        Vector vec = new Vector();
        
        vec.add(id);
        vec.add(product);
        vec.add(qty);
        vec.add(totalQp);
        
        model.addRow(vec);
        

    }
    public void solve(){
        double total = 0.0;
        for(int i = 0 ; i<table1.getRowCount() ; i++){
           
            double value = Double.valueOf(table1.getValueAt(i, 3).toString());
            
            total = value+total;
            
            totalFld.setText(Double.toString(total));
      }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        burgerBtn = new javax.swing.JButton();
        friesBtn = new javax.swing.JButton();
        cokeBtn = new javax.swing.JButton();
        labal1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        productFld = new javax.swing.JTextField();
        quantityFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        priceFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cashFld = new javax.swing.JTextField();
        changeBtn = new javax.swing.JButton();
        changeFld = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        codeFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        burgerBtn.setText("Burger");
        burgerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(burgerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 16, 98, 60));

        friesBtn.setText("Fries");
        friesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(friesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 94, 69));

        cokeBtn.setText("Coke");
        cokeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cokeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 69));

        labal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labal1.setText("0");
        jPanel1.add(labal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 80, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 30, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, 70));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 470));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "ProductName", "Quantity", "Price"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 268, 300));

        areaTxt.setColumns(20);
        areaTxt.setRows(5);
        jScrollPane2.setViewportView(areaTxt);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 0, 240, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Price");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 50, 20));
        jPanel2.add(productFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 140, -1));
        jPanel2.add(quantityFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Product Name ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 90, 20));
        jPanel2.add(priceFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 60, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 50, -1));
        jPanel2.add(totalFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, -1));

        jLabel5.setText("Cash");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 60, -1));
        jPanel2.add(cashFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 110, -1));

        changeBtn.setText("Change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(changeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 390, 90, 30));
        jPanel2.add(changeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 110, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 30));

        jButton1.setText("Display Reciept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 140, 30));

        jLabel9.setText("Code");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 50, -1));
        jPanel2.add(codeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 520, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void burgerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerBtnActionPerformed
        int i = Integer.parseInt(labal1.getText());
        ++i;
        
        labal1.setText(Integer.toString(i));
         
        tryTable(1,"Burger",i,45);
        solve();

    }//GEN-LAST:event_burgerBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         DefaultTableModel mod = (DefaultTableModel) table1.getModel();
         int selec = table1.getSelectedRow();
         mod.removeRow(selec);
         
         String a = codeFld.getText();
         switch(a){
             case "1":
                 labal1.setText("0");
                 codeFld.setText("");
                 productFld.setText("");
                 quantityFld.setText("");
                 priceFld.setText("");
                 break;
            case "2":
                 jLabel8.setText("0");
                 codeFld.setText("");
                 productFld.setText("");
                 quantityFld.setText("");
                 priceFld.setText("");
                 break;
            case "3":
                 jLabel7.setText("0");
                 codeFld.setText("");
                 productFld.setText("");
                 quantityFld.setText("");
                 priceFld.setText("");
                 break;
             
         }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        DefaultTableModel d = (DefaultTableModel) table1.getModel();
        
        String a = d.getValueAt(table1.getSelectedRow(),0).toString();
        String b = d.getValueAt(table1.getSelectedRow(),1).toString();
        String c = d.getValueAt(table1.getSelectedRow(),2).toString();
        String e = d.getValueAt(table1.getSelectedRow(),3).toString();
        
        codeFld.setText(a);
        productFld.setText(b);
        quantityFld.setText(c);
        priceFld.setText(e);
        
        
    }//GEN-LAST:event_table1MouseClicked

    private void friesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friesBtnActionPerformed
          int fries = Integer.parseInt(jLabel8.getText());
          
          ++fries;
          jLabel8.setText(Integer.toString(fries));
          
          tryTable(2,"Fries",fries,25);
          
          solve();

    }//GEN-LAST:event_friesBtnActionPerformed

    private void cokeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeBtnActionPerformed
       int coke = Integer.parseInt(jLabel7.getText());
          
       ++coke;
       jLabel7.setText(Integer.toString(coke));
          
       tryTable(3,"coke",coke,20);
          
       solve();
    }//GEN-LAST:event_cokeBtnActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
       double change = Double.parseDouble(cashFld.getText()) - Double.parseDouble(totalFld.getText());
       
       changeFld.setText(Double.toString(change));
    }//GEN-LAST:event_changeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        areaTxt.setText("=====================================\n");
        areaTxt.setText(areaTxt.getText()+"!=<=!      Elden Street Food     !=>=!\n");
        areaTxt.setText(areaTxt.getText()+"=====================================\n");
        areaTxt.setText(areaTxt.getText()+"---Product--- **Quantity** \t !!Price!!\n");
        DefaultTableModel md = (DefaultTableModel) table1.getModel();
        
        for(int i = 0 ; i < table1.getRowCount() ; i++){
            String product = table1.getValueAt(i,1).toString();
            String quantity = table1.getValueAt(i, 2).toString();
            String price = table1.getValueAt(i, 3).toString();
            
            areaTxt.setText(areaTxt.getText()+"    "+product+"\t "+quantity+"\t    "+price+"\n");
            
            
            
            
        }
        areaTxt.setText(areaTxt.getText()+" Total " + "\t " +totalFld.getText()+"\n");
        areaTxt.setText(areaTxt.getText()+"------------------------------------------------\n");
        areaTxt.setText(areaTxt.getText()+"---------------THANKS COME  AGAIN-----------------\n");
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTxt;
    private javax.swing.JButton burgerBtn;
    private javax.swing.JTextField cashFld;
    private javax.swing.JButton changeBtn;
    private javax.swing.JTextField changeFld;
    private javax.swing.JTextField codeFld;
    private javax.swing.JButton cokeBtn;
    private javax.swing.JButton friesBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labal1;
    private javax.swing.JTextField priceFld;
    private javax.swing.JTextField productFld;
    private javax.swing.JTextField quantityFld;
    private javax.swing.JTable table1;
    private javax.swing.JTextField totalFld;
    // End of variables declaration//GEN-END:variables
}
