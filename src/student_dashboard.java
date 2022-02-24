
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rp140
 */
public class student_dashboard extends javax.swing.JFrame {

    /**
     * Creates new form student_dashboard
     */
    public student_dashboard() {
        initComponents();
        routinesearch.setVisible(false);
        routinesem.setVisible(false);
         resultsearch.setVisible(false);
        resultsem.setVisible(false);
       this.setLocationRelativeTo(null);
    }
    
      public student_dashboard(String roll) {
          String msg;
        initComponents();
       this.setLocationRelativeTo(null);
       msg=roll;
       rolls.setText(msg);
        routinesearch.setVisible(false);
        routinesem.setVisible(false);
         resultsearch.setVisible(false);
        resultsem.setVisible(false);
       
       
      try{
         
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
       String sql="Select * from studentinfo where crn=?";
        PreparedStatement pst= con.prepareCall(sql);
         pst.setString(1,msg);
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
        
            String crn= rs.getString("crn");
            String name= rs.getString("name");
            String phone_number= rs.getString("phone_number");
            String address= rs.getString("address");
            String parent_name= rs.getString("parent_name");
            String parent_number= rs.getString("parent_number");
            String degree= rs.getString("degree");
            String field= rs.getString("field");
            String gender= rs.getString("gender");
            String email=rs.getString("email");
            
              fullname.setText(name);
            mail.setText(email);
            contact.setText(phone_number);
            residence.setText(address);
            parentname.setText(parent_name);
            parentcontact.setText(parent_number);
            level.setText(degree);
            fields.setText(field);
            genders.setText(gender);
             welcome.setText(name);
               
        }
        
         else{
       JOptionPane.showMessageDialog(null, "No data found");
        }
       
       con.close();
      
      }
      catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       JOptionPane.showMessageDialog(null, "notconnected");
       }
    }
      
      public student_dashboard(String roll,int n) {
          
          String msg;
        initComponents();
       this.setLocationRelativeTo(null);
       msg=roll;
       rolls.setText(msg);
        routinesearch.setVisible(false);
        routinesem.setVisible(false);
         resultsearch.setVisible(false);
        resultsem.setVisible(false);
        showresult.setVisible(false);
        showroutine.setVisible(false);
        logout.setVisible(false);
       
       
       
      try{
         
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
       String sql="Select * from studentinfo where crn=?";
        PreparedStatement pst= con.prepareCall(sql);
         pst.setString(1,msg);
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
        
            String crn= rs.getString("crn");
            String name= rs.getString("name");
            String phone_number= rs.getString("phone_number");
            String address= rs.getString("address");
            String parent_name= rs.getString("parent_name");
            String parent_number= rs.getString("parent_number");
            String degree= rs.getString("degree");
            String field= rs.getString("field");
            String gender= rs.getString("gender");
            String email=rs.getString("email");
            
              fullname.setText(name);
            mail.setText(email);
            contact.setText(phone_number);
            residence.setText(address);
            parentname.setText(parent_name);
            parentcontact.setText(parent_number);
            level.setText(degree);
            fields.setText(field);
            genders.setText(gender);
             welcome.setText(name);
               
        } 
       
       con.close();
      
      }
      catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       JOptionPane.showMessageDialog(null, "notconnected");
       }
      
      
      }
      
      
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        showresult = new javax.swing.JButton();
        showroutine = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        genders = new javax.swing.JLabel();
        residence = new javax.swing.JLabel();
        parentname = new javax.swing.JLabel();
        parentcontact = new javax.swing.JLabel();
        rolls = new javax.swing.JLabel();
        fields = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        resultsem = new javax.swing.JComboBox<>();
        routinesem = new javax.swing.JComboBox<>();
        resultsearch = new javax.swing.JButton();
        routinesearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        jLabel1.setText("WELCOME");

        welcome.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        welcome.setText("RITESH PANDEY");

        logout.setBackground(new java.awt.Color(250, 0, 0));
        logout.setFont(new java.awt.Font("SimSun", 1, 10)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcome)
                    .addComponent(logout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel3.setText("PERSONAL INFORMATION");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel4.setText("Full Name :");

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel5.setText("Emailaddress :");

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel6.setText("Contact Number :");

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel7.setText("Dob :");

        jLabel8.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel8.setText("Gender :");

        jLabel9.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel9.setText("Address :");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        showresult.setText("SHOW RESULTS");
        showresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showresultActionPerformed(evt);
            }
        });

        showroutine.setText("SHOW ROUTINE");
        showroutine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showroutineActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel10.setText("COLLEGE INFORMATION");

        jLabel11.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel11.setText("College RollNo. :");

        jLabel12.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel12.setText("Field of Study:");

        jLabel13.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel13.setText("Degree :");

        jLabel14.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel14.setText("Parent's Name :");

        jLabel15.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel15.setText("Parent's Contact  :");

        fullname.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        fullname.setText("Ritesh Pandey");

        mail.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        mail.setText("rp140578@gmail.com");

        contact.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        contact.setText("9865762048");

        dob.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        dob.setText("10-05-2000");

        genders.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        genders.setText("M");

        residence.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        residence.setText("Dhangadhi");

        parentname.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        parentname.setText("Sunita Pandey");

        parentcontact.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        parentcontact.setText("1234567890");

        rolls.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        rolls.setText("kan075bct047");

        fields.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        fields.setText("computer engineering");

        level.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        level.setText("BE");

        resultsem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "firstsem", "secondsem", "thirdsem", "fourthsem", "fifthsem", "sixthsem", "seventhsem", "eighthsem" }));

        routinesem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "firstsem", "secondsem", "thirdsem", "fourthsem", "fifthsem", "sixthsem", "seventhsem", "eighthsem" }));
        routinesem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routinesemActionPerformed(evt);
            }
        });

        resultsearch.setText("SEARCH");
        resultsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsearchActionPerformed(evt);
            }
        });

        routinesearch.setText("SEARCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genders, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(residence, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parentname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(parentcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fields, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(rolls, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showresult)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(resultsem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(resultsearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showroutine, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(routinesem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(routinesearch)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dob))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genders))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residence))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parentname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parentcontact)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rolls))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(fields))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(level)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showresult)
                    .addComponent(showroutine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultsem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(routinesem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultsearch)
                    .addComponent(routinesearch))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        choosingscreen lgs= new choosingscreen();
       lgs.setVisible(true);
       lgs.pack();
       lgs.setLocationRelativeTo(null);
       lgs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void showroutineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showroutineActionPerformed
        // TODO add your handling code here:
        resultsearch.setVisible(false);
        resultsem.setVisible(false);
        routinesearch.setVisible(true);
        routinesem.setVisible(true);
        
        
    }//GEN-LAST:event_showroutineActionPerformed

    private void showresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showresultActionPerformed
        // TODO add your handling code here:
        resultsearch.setVisible(true);
        resultsem.setVisible(true);
        routinesearch.setVisible(false);
        routinesem.setVisible(false);
        
        
    }//GEN-LAST:event_showresultActionPerformed

    private void routinesemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routinesemActionPerformed
        // TODO add your handling code here:
         String selectedroutinesem=routinesem.getSelectedItem().toString();
    }//GEN-LAST:event_routinesemActionPerformed

    private void resultsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsearchActionPerformed
        // TODO add your handling code here:
        String selectedresultsem=resultsem.getSelectedItem().toString();
        try{
            String msg1 =rolls.getText();
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
//       if(con!=null){
//       JOptionPane.showMessageDialog(null, "connected");
//       }
       String sql="Select * from studentinfo where crn=?";
       PreparedStatement pst= con.prepareCall(sql);
       // pst.setString(1,selectedresultsem);
       pst.setString(1,msg1);
    
       ResultSet rs = pst.executeQuery();
       
       
        if(rs.next()){
           String rolls=msg1;
           int i=1;
        resultscreen std_d= new resultscreen(rolls,selectedresultsem,i);
        std_d.setVisible(true);
        std_d.pack();
        std_d.setLocationRelativeTo(null);
        std_d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
       }
       
       else{
       JOptionPane.showMessageDialog(null, "Enter valid user credentials");
        }
        con.close();
       }
       
       
       
       catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       JOptionPane.showMessageDialog(null, "notconnected");
       }
    }//GEN-LAST:event_resultsearchActionPerformed

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
            java.util.logging.Logger.getLogger(student_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contact;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel fields;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel genders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel level;
    private javax.swing.JButton logout;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel parentcontact;
    private javax.swing.JLabel parentname;
    private javax.swing.JLabel residence;
    private javax.swing.JButton resultsearch;
    private javax.swing.JComboBox<String> resultsem;
    private javax.swing.JLabel rolls;
    private javax.swing.JButton routinesearch;
    private javax.swing.JComboBox<String> routinesem;
    private javax.swing.JButton showresult;
    private javax.swing.JButton showroutine;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
