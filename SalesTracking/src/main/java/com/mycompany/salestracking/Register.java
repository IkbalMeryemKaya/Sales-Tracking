/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.salestracking;

import com.mycompany.salestracking.User.Gender;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Monster Huma H5 v4.1
 */
public class Register extends javax.swing.JFrame {
    private Login login;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }
    
    public Register(Login lgn) {
        initComponents();
        this.login = lgn;
        lgn.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_rgst_name = new javax.swing.JTextField();
        txt_rgst_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_rgst_address = new javax.swing.JTextArea();
        bttn_rgst_register = new javax.swing.JButton();
        txt_rgst_password = new javax.swing.JPasswordField();
        lbl_error_name = new javax.swing.JLabel();
        lbl_error_email = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bttn_male = new javax.swing.JRadioButton();
        bttn_female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("Name Surname:");

        jLabel2.setText("E-mail:");

        jLabel3.setText("Password:");

        jLabel5.setText("Address:");

        txt_rgst_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rgst_nameKeyReleased(evt);
            }
        });

        txt_rgst_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rgst_emailKeyReleased(evt);
            }
        });

        txt_rgst_address.setColumns(20);
        txt_rgst_address.setRows(5);
        jScrollPane1.setViewportView(txt_rgst_address);

        bttn_rgst_register.setBackground(new java.awt.Color(204, 204, 255));
        bttn_rgst_register.setText("REGISTER");
        bttn_rgst_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_rgst_registerActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender:");

        buttonGroup1.add(bttn_male);
        bttn_male.setText("Male");

        buttonGroup1.add(bttn_female);
        bttn_female.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lbl_error_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bttn_male)
                                .addGap(29, 29, 29)
                                .addComponent(bttn_female)
                                .addGap(48, 48, 48))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttn_rgst_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_error_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_rgst_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txt_rgst_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_rgst_name))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_rgst_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lbl_error_name)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_rgst_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lbl_error_email)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_rgst_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bttn_male)
                    .addComponent(bttn_female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(bttn_rgst_register)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rgst_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rgst_emailKeyReleased
        // TODO add your handling code here:
        String text = txt_rgst_email.getText();
        Pattern pattern = Pattern.compile("^[a-zA-Z][\\w$]{2,}(@)(hotmail|gmail)(.com)$");
        Matcher matcher = pattern.matcher(text);
        boolean Found = matcher.matches();
        if(Found){
            lbl_error_email.setText("");
            bttn_rgst_register.setEnabled(true);
        }else{
            lbl_error_email.setText("invalid character");
            bttn_rgst_register.setEnabled(false);
        }
    }//GEN-LAST:event_txt_rgst_emailKeyReleased

    private void txt_rgst_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rgst_nameKeyReleased
        // TODO add your handling code here:
        String text = txt_rgst_name.getText();
        Pattern pattern = Pattern.compile("[İŞÜĞÇÖşçöğüıA-Za-z ]{2,20}");
        Matcher matcher = pattern.matcher(text);
        boolean Found = matcher.matches();
        if(Found){
            lbl_error_name.setText("");
            bttn_rgst_register.setEnabled(true);
        }else{
            lbl_error_name.setText("invalid character");
            bttn_rgst_register.setEnabled(false);
        }
    }//GEN-LAST:event_txt_rgst_nameKeyReleased

    private void bttn_rgst_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_rgst_registerActionPerformed
        // TODO add your handling code here:
                String name = txt_rgst_name.getText();
        String email = txt_rgst_email.getText();
        String address = txt_rgst_address.getText();
        char[] password = txt_rgst_password.getPassword();
        Gender gender = Gender.notSelected;
        if(bttn_male.isSelected()){
            gender = Gender.male;
        }else if(bttn_female.isSelected()){
            gender = Gender.female;
        }
      
        try{
            User user = new User(name, address, email, password, gender);
            int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to save these informations?");
            if(answer == JOptionPane.YES_OPTION){
                
                String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
                Connection conn = DriverManager.getConnection(cstr);
                Statement stmt = (Statement) conn.createStatement();
                String query = "INSERT INTO user_infos"
                        + "(NameSurname, Email, Address, Password, Gender)"
                        + "VALUES("
                        + "'"+name+"',"
                        + "'"+email+"',"
                        + "'"+address+"',"
                        + "'"+Arrays.toString(password)+"',"
                        + "'"+gender+"')";


                stmt.executeUpdate(query);
                conn.close();
                
                this.dispose();
                login.setVisible(true);
            }else{
            }
        }catch(EmptyAreaException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bttn_rgst_registerActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bttn_female;
    private javax.swing.JRadioButton bttn_male;
    private javax.swing.JButton bttn_rgst_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_error_email;
    private javax.swing.JLabel lbl_error_name;
    private javax.swing.JTextArea txt_rgst_address;
    private javax.swing.JTextField txt_rgst_email;
    private javax.swing.JTextField txt_rgst_name;
    private javax.swing.JPasswordField txt_rgst_password;
    // End of variables declaration//GEN-END:variables
}
