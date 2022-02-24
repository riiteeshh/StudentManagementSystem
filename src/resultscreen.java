
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rp140
 */
public class resultscreen extends javax.swing.JFrame {

    /**
     * Creates new form resultscreen
     * 
     */
    public resultscreen() {
        initComponents();
    }
    public resultscreen(String roll,String sem) {
        initComponents();
        
        sems.setText(sem);
        rolls.setText(roll);
        subjectname.setVisible(false);
        fullmarks.setVisible(false);
        passmarks.setVisible(false);
        obtained.setVisible(false);
        insert.setVisible(false);
        done.setVisible(false);
        sname.setVisible(false);
        fmarks.setVisible(false);
        pmarks.setVisible(false);
        omarks.setVisible(false);
        home.setVisible(false);
        back.setVisible(true);
        
        
         try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql="Select name from studentinfo where crn=?";
       PreparedStatement pst= con.prepareCall(sql);
        pst.setString(1,roll);
     
    
       ResultSet rs = pst.executeQuery();
       
       if(rs.next()){
        fullname.setText(rs.getString("name")); 
        
       
       }
       con.close();
       
       Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql1="Select * from "+ sem +" where crn=?";
       PreparedStatement pst1= con1.prepareCall(sql1);
        pst1.setString(1,roll);
       ResultSet rs1 = pst1.executeQuery();
       
       while(rs1.next()){
       
       String subject = rs1.getString("subjectname");
       String fullmarks = String.valueOf(rs1.getInt("fullmarks"));
       String passmarks = String.valueOf(rs1.getInt("passmarks"));
       String obtainedmarks = String.valueOf(rs1.getInt("marks"));
       String Remarks;
       if((rs1.getInt("marks"))>=(rs1.getInt("passmarks"))){
       
           Remarks="Pass";
       }
       else{
       Remarks="Fail";
       }
       
       String tbdata[] = {subject,fullmarks,passmarks,obtainedmarks,Remarks};
       DefaultTableModel tblmodel = (DefaultTableModel)resulttable.getModel();
       
       tblmodel.addRow(tbdata);
       
       }
       
       con1.close();
       
       Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql2="Select sum(marks) as total from "+ sem +" where crn=?";
       PreparedStatement pst2= con2.prepareCall(sql2);
        pst2.setString(1,roll);
       ResultSet rs2 = pst2.executeQuery();
       
       if(rs2.next()){
       total.setText(String.valueOf(rs2.getInt("total")));
       
       }
       
       
         }
          catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       JOptionPane.showMessageDialog(null, "notconnected");
       }
        
    }
    
    
    
    public resultscreen(String roll,String sem,int i) {
        initComponents();
        
        sems.setText(sem);
        rolls.setText(roll);
        subjectname.setVisible(false);
        fullmarks.setVisible(false);
        passmarks.setVisible(false);
        obtained.setVisible(false);
        insert.setVisible(false);
        edit.setVisible(false);
        add.setVisible(false);
        delete.setVisible(false);
        done.setVisible(false);
        sname.setVisible(false);
        fmarks.setVisible(false);
        pmarks.setVisible(false);
        omarks.setVisible(false);
        home.setVisible(true);
         back.setVisible(false);
        
        
        
         try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql="Select name from studentinfo where crn=?";
       PreparedStatement pst= con.prepareCall(sql);
        pst.setString(1,roll);
     
    
       ResultSet rs = pst.executeQuery();
       
       if(rs.next()){
        fullname.setText(rs.getString("name")); 
        
       
       }
       con.close();
       
       Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql1="Select * from "+ sem +" where crn=?";
       PreparedStatement pst1= con1.prepareCall(sql1);
        pst1.setString(1,roll);
       ResultSet rs1 = pst1.executeQuery();
       
       while(rs1.next()){
       
       String subject = rs1.getString("subjectname");
       String fullmarks = String.valueOf(rs1.getInt("fullmarks"));
       String passmarks = String.valueOf(rs1.getInt("passmarks"));
       String obtainedmarks = String.valueOf(rs1.getInt("marks"));
       String Remarks;
       if((rs1.getInt("marks"))>=(rs1.getInt("passmarks"))){
       
           Remarks="Pass";
       }
       else{
       Remarks="Fail";
       }
       
       String tbdata[] = {subject,fullmarks,passmarks,obtainedmarks,Remarks};
       DefaultTableModel tblmodel = (DefaultTableModel)resulttable.getModel();
       
       tblmodel.addRow(tbdata);
       
       }
       
       con1.close();
       
       Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql2="Select sum(marks) as total from "+ sem +" where crn=?";
       PreparedStatement pst2= con2.prepareCall(sql2);
        pst2.setString(1,roll);
       ResultSet rs2 = pst2.executeQuery();
       
       if(rs2.next()){
       total.setText(String.valueOf(rs2.getInt("total")));
       
       }
       
       
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
        jLabel4 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rolls = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sems = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resulttable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        add = new javax.swing.JButton();
        sname = new javax.swing.JTextField();
        fmarks = new javax.swing.JTextField();
        pmarks = new javax.swing.JTextField();
        omarks = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        done = new javax.swing.JButton();
        subjectname = new javax.swing.JLabel();
        fullmarks = new javax.swing.JLabel();
        passmarks = new javax.swing.JLabel();
        obtained = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel4.setText("Full Name :");

        fullname.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        fullname.setText("Ritesh Pandey");

        jLabel11.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel11.setText("College RollNo. :");

        rolls.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        rolls.setText("kan075bct047");

        back.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel5.setText("Semester :");

        sems.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        sems.setText("first");

        resulttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUBJECT", "FULL MARKS", "PASS MARKS", "OBTAINED", "REMARKS"
            }
        ));
        jScrollPane1.setViewportView(resulttable);

        jLabel12.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        jLabel12.setText("Total : ");

        total.setFont(new java.awt.Font("Sitka Banner", 1, 15)); // NOI18N
        total.setText("500");

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        subjectname.setText("SUBJECT NAME");

        fullmarks.setText("FULL MARKS");

        passmarks.setText("PASS MARKS");

        obtained.setText("OBTAINED");

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(back)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25))
                            .addComponent(subjectname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(sems, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(edit)
                                .addGap(39, 39, 39)
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete)
                                .addGap(122, 122, 122))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rolls, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(home))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fullmarks, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(fmarks))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pmarks)
                            .addComponent(passmarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(omarks)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(insert)
                                .addGap(6, 6, 6)
                                .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obtained)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(home))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullname)
                    .addComponent(jLabel11)
                    .addComponent(rolls))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sems)
                    .addComponent(jLabel12)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edit)
                            .addComponent(add)
                            .addComponent(delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullmarks)
                            .addComponent(passmarks)
                            .addComponent(obtained)))
                    .addComponent(subjectname, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert)
                    .addComponent(done))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        teacher_dashboard lgs= new teacher_dashboard();
        lgs.setVisible(true);
        lgs.pack();
        lgs.setLocationRelativeTo(null);
        lgs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
 
        
         subjectname.setVisible(true);
        fullmarks.setVisible(false);
        passmarks.setVisible(false);
        obtained.setVisible(true);
        insert.setVisible(true);
        done.setVisible(true);
        sname.setVisible(true);
        fmarks.setVisible(false);
        pmarks.setVisible(false);
        omarks.setVisible(true);
        insert.setText("UPDATE");
    }//GEN-LAST:event_editActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        
      
        
        
        try{
         
       Class.forName("com.mysql.cj.jdbc.Driver");
     if(insert.getText()=="INSERT"){
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
        String crn=rolls.getText();
        String semsss=sems.getText();
        String sub_name=sname.getText();
        int full_marks=Integer.parseInt(fmarks.getText());
        int pass_marks=Integer.parseInt(pmarks.getText());
        int obtained_marks=Integer.parseInt(omarks.getText());
         
        String sql="Insert into "+semsss+" values(?,?,?,?,?,null)";
        PreparedStatement pst= con.prepareCall(sql);
     //   pst.setString(1, semsss);
        pst.setString(1, crn);
        pst.setString(2, sub_name);
        pst.setInt(3, obtained_marks);
        pst.setInt(4, full_marks);
        pst.setInt(5, pass_marks);
          pst.execute();
        //fmarks.setText(null);
        
        pmarks.setText(null);
        omarks.setText(null);
        sname.setText(null);
        fmarks.setText(null);
        //  fmarks.setText(insert.getText());
         DefaultTableModel tblmodel = (DefaultTableModel)resulttable.getModel();
       
       tblmodel.setRowCount(0);
        
        
        String sql1="Select * from "+semsss+" where crn=?";
        PreparedStatement pst1= con.prepareCall(sql1);
         pst1.setString(1, crn);
         
         ResultSet rs1 = pst1.executeQuery();
       
       while(rs1.next()){
       
       String subject = rs1.getString("subjectname");
       String fullmarks = String.valueOf(rs1.getInt("fullmarks"));
       String passmarks = String.valueOf(rs1.getInt("passmarks"));
       String obtainedmarks = String.valueOf(rs1.getInt("marks"));
       String Remarks;
       if((rs1.getInt("marks"))>=(rs1.getInt("passmarks"))){
       
           Remarks="Pass";
       }
       else{
       Remarks="Fail";
       }
       
       
       
       
        String tbdata[] = {subject,fullmarks,passmarks,obtainedmarks,Remarks};
       DefaultTableModel tblmodel1 = (DefaultTableModel)resulttable.getModel();
       
       tblmodel1.addRow(tbdata);}
         
        con.close();
        
        Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql2="Select sum(marks) as total from "+ semsss +" where crn=?";
       PreparedStatement pst2= con2.prepareCall(sql2);
        pst2.setString(1,crn);
       ResultSet rs2 = pst2.executeQuery();
       
       if(rs2.next()){
       total.setText(String.valueOf(rs2.getInt("total")));
       
       }}
       
       else if(insert.getText()=="UPDATE"){
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
        String crn=rolls.getText();
        String semsss=sems.getText();
        String sub_name=sname.getText();
//        int full_marks=Integer.parseInt(fmarks.getText());
//        int pass_marks=Integer.parseInt(pmarks.getText());
        int obtained_marks=Integer.parseInt(omarks.getText());
        
       
        String sql="Update "+semsss+" set marks=? where crn=? AND subjectname=?";
        PreparedStatement pst= con.prepareCall(sql);
       pst.setInt(1, obtained_marks);
        pst.setString(2, crn);
       pst.setString(3, sub_name);
//       fmarks.setText("80");
//       pmarks.setText("32");
        pst.execute();
         fmarks.setText(null);
       pmarks.setText(null);
       omarks.setText(null);
       sname.setText(null);
       
        DefaultTableModel tblmodel = (DefaultTableModel)resulttable.getModel();
       
       tblmodel.setRowCount(0);
        
        
        String sql1="Select * from "+semsss+" where crn=?";
        PreparedStatement pst1= con.prepareCall(sql1);
         pst1.setString(1, crn);
         
         ResultSet rs1 = pst1.executeQuery();
       
       while(rs1.next()){
       
       String subject = rs1.getString("subjectname");
       String fullmarks = String.valueOf(rs1.getInt("fullmarks"));
       String passmarks = String.valueOf(rs1.getInt("passmarks"));
       String obtainedmarks = String.valueOf(rs1.getInt("marks"));
       String Remarks;
       if((rs1.getInt("marks"))>=(rs1.getInt("passmarks"))){
       
           Remarks="Pass";
       }
       else{
       Remarks="Fail";
       }
       
       
       
       
        String tbdata[] = {subject,fullmarks,passmarks,obtainedmarks,Remarks};
       DefaultTableModel tblmodel1 = (DefaultTableModel)resulttable.getModel();
       
       tblmodel1.addRow(tbdata);}
         
        con.close();
        
        Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql2="Select sum(marks) as total from "+ semsss +" where crn=?";
       PreparedStatement pst2= con2.prepareCall(sql2);
        pst2.setString(1,crn);
       ResultSet rs2 = pst2.executeQuery();
       
       if(rs2.next()){
       total.setText(String.valueOf(rs2.getInt("total")));
       
       }

       }
       else if(insert.getText()=="DELETE"){
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
        String crn=rolls.getText();
        String semsss=sems.getText();
        String sub_name=sname.getText();
//        int full_marks=Integer.parseInt(fmarks.getText());
//        int pass_marks=Integer.parseInt(pmarks.getText());
      //  int obtained_marks=Integer.parseInt(omarks.getText());
        
       
        String sql="Delete from "+semsss+" where crn=? AND subjectname=?";
        PreparedStatement pst= con.prepareCall(sql);
      // pst.setInt(1, obtained_marks);
        pst.setString(1, crn);
       pst.setString(2, sub_name);
//       fmarks.setText("80");
//       pmarks.setText("32");
        pst.execute();
    
       sname.setText(null);
       
        DefaultTableModel tblmodel = (DefaultTableModel)resulttable.getModel();
       
       tblmodel.setRowCount(0);
        
        
        String sql1="Select * from "+semsss+" where crn=?";
        PreparedStatement pst1= con.prepareCall(sql1);
         pst1.setString(1, crn);
         
         ResultSet rs1 = pst1.executeQuery();
       
       while(rs1.next()){
       
       String subject = rs1.getString("subjectname");
       String fullmarks = String.valueOf(rs1.getInt("fullmarks"));
       String passmarks = String.valueOf(rs1.getInt("passmarks"));
       String obtainedmarks = String.valueOf(rs1.getInt("marks"));
       String Remarks;
       if((rs1.getInt("marks"))>=(rs1.getInt("passmarks"))){
       
           Remarks="Pass";
       }
       else{
       Remarks="Fail";
       }
       
       
       
       
        String tbdata[] = {subject,fullmarks,passmarks,obtainedmarks,Remarks};
       DefaultTableModel tblmodel1 = (DefaultTableModel)resulttable.getModel();
       
       tblmodel1.addRow(tbdata);}
         
        con.close();
        
        Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgmt", "root", "");
         
       String sql2="Select sum(marks) as total from "+ semsss +" where crn=?";
       PreparedStatement pst2= con2.prepareCall(sql2);
        pst2.setString(1,crn);
       ResultSet rs2 = pst2.executeQuery();
       
       if(rs2.next()){
       total.setText(String.valueOf(rs2.getInt("total")));
       
       }}
      
      
      
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        subjectname.setVisible(true);
        fullmarks.setVisible(true);
        passmarks.setVisible(true);
        obtained.setVisible(true);
        insert.setVisible(true);
        done.setVisible(true);
        sname.setVisible(true);
        fmarks.setVisible(true);
        pmarks.setVisible(true);
        omarks.setVisible(true);
        insert.setText("INSERT");
        
       
    }//GEN-LAST:event_addActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        
        subjectname.setVisible(false);
        fullmarks.setVisible(false);
        passmarks.setVisible(false);
        obtained.setVisible(false);
        insert.setVisible(false);
        done.setVisible(false);
        sname.setVisible(false);
        fmarks.setVisible(false);
        pmarks.setVisible(false);
        omarks.setVisible(false);
    }//GEN-LAST:event_doneActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        subjectname.setVisible(true);
        fullmarks.setVisible(false);
        passmarks.setVisible(false);
        obtained.setVisible(false);
        insert.setVisible(true);
        done.setVisible(true);
        sname.setVisible(true);
        fmarks.setVisible(false);
        pmarks.setVisible(false);
        omarks.setVisible(false);
        insert.setText("DELETE");
    }//GEN-LAST:event_deleteActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
         student_dashboard lgs= new student_dashboard();
        lgs.setVisible(true);
        lgs.pack();
        lgs.setLocationRelativeTo(null);
        lgs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(resultscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton done;
    private javax.swing.JButton edit;
    private javax.swing.JTextField fmarks;
    private javax.swing.JLabel fullmarks;
    private javax.swing.JLabel fullname;
    private javax.swing.JButton home;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel obtained;
    private javax.swing.JTextField omarks;
    private javax.swing.JLabel passmarks;
    private javax.swing.JTextField pmarks;
    private javax.swing.JTable resulttable;
    private javax.swing.JLabel rolls;
    private javax.swing.JLabel sems;
    private javax.swing.JTextField sname;
    private javax.swing.JLabel subjectname;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
