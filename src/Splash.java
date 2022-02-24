import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author win-8
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loadingnum = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management System ");

        loadingnum.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        loadingnum.setForeground(new java.awt.Color(255, 255, 255));
        loadingnum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingnum.setText("99%");

        loadingbar.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Loading....");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2019-10-11--14-18-39.png"))); // NOI18N

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(loadingnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadingbar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadingnum)
                .addGap(18, 18, 18)
                .addComponent(loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(750, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Splash splash = new Splash ();
        splash .setVisible(true);
        LogIn Start =new LogIn();
        String databse="x";

        try
        {
           for(int i=0; i<100; i++)
           {
               lbl1.setText("");
               Thread.sleep(40);
               splash.loadingnum.setText(Integer.toString(i)+"%");
               splash.loadingbar.setValue(i);
               if(i==99)
               {
                   splash.setVisible(true);
                   Start.setVisible(true);
               }
               if(i==30)
               {
                   lbl1.setText("Checking Database");
                   
        try {
            System.out.println("1234");
            Class.forName("com.mysql.jdbc.Driver");
             System.out.println("1234");
            String UID="root";
             System.out.println("1234");
            String PWD="shalini";
             System.out.println("1234");
            String connectionUrl = "jdbc:mysql://localhost:3306/";
             System.out.println("1234");
            Connection con=DriverManager.getConnection(connectionUrl,UID,PWD);
             System.out.println("1234");
            Statement stmt=con.createStatement();
             System.out.println("1234");
            String query="show databases;";
             System.out.println("1234");
            ResultSet rs=stmt.executeQuery(query);
             System.out.println("1234");

            while(rs.next())
            {
                 System.out.println("1234");
                String value = rs.getString("Database");  
                 System.out.println("1234");
                if(value.equals("hospital"))
                {
                     System.out.println("1234");
                    databse="Database exists";
                     System.out.println("1234");
                }
                 System.out.println("1234");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Oops! Something went Wrong.\n System is Having Problems While \n Connecting to MySql Client");
        }
               }
               if(i==70)
               {
                           if(!(databse.equals("Database exists")))
        {
            lbl1.setText("Creating Database");
           try {
            Class.forName("com.mysql.jdbc.Driver");

            String UID="root";
   
            String PWD="shalini";
        
            String connectionUrl = "jdbc:mysql://localhost:3306/";
         
            Connection con=DriverManager.getConnection(connectionUrl,UID,PWD);
       
            String query="create database hospital";
      
            Statement stmt=con.createStatement();
       
            stmt.executeUpdate(query);
     
            lbl1.setText("Database Created");
         
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
        }
             lbl1.setText("Creating Tables");
            try {
            Class.forName("com.mysql.jdbc.Driver");
            String UID="root";
            String PWD="shalini";
            String connectionUrl = "jdbc:mysql://localhost:3306/hospital";
            Connection con=DriverManager.getConnection(connectionUrl,UID,PWD);
  
            String query="create table user(userid varchar(50) primary key not null,name varchar(50),username varchar(50) unique not null,password varchar(50),dob varchar(50),gender varchar(50),email varchar(50),contact varchar(50),security varchar(50),answer varchar(50) );";
        
            
            String query1="create table nurse(id varchar(50) primary key not null,name varchar(50),father_name varchar(50),address varchar(50),category varchar(50),dob varchar(50),contact varchar(50),blood_group varchar(50),doj varchar(50),salary varchar(50) );";
       
            String query2="create table doctor(doctor_id varchar(50) primary key not null,name varchar(50),father_name varchar(50),address varchar(50),gender varchar(50),dob varchar(50),contact varchar(50),email varchar(50),qualifications varchar(50),specialisation varchar(50),blood_group varchar(50),doj varchar(50),status varchar(50),date_of_retirement_resign varchar(50));";
          
            String query3="create table room(room_no varchar(50) primary key not null,room_type varchar(50),charges varchar(50),status varchar(50));";
          
            String query4="create table ward(ward_no varchar(50) primary key not null,ward_type varchar(50),no_of_beds varchar(50),charges varchar(50),beds_occupied varchar(50) default '0');";
      
            String query5="create table patient(patient_id varchar(50) primary key not null ,name varchar(50),address varchar(50),gender varchar(50),dob varchar(50),contact varchar(50),blood_group varchar(50),disease varchar(50),doctor_id varchar(50),doctor_name varchar(50),remark varchar(200),admit varchar(50) default 'No',checkup_date varchar(50));";
           
            String query6="create table admit(admit_id varchar(50) primary key not null ,patient_id varchar(50),name varchar(50),gender varchar(50),date_of_admit varchar(50),room_ward_no varchar(50),status varchar(50) default 'admitted',date_of_discharge varchar(50));";
           
            String query7="create table bill(bill_no varchar(50),admit_id varchar(50),room_ward_no varchar(50),charges_per_day varchar(50),no_of_days varchar(50),total_charges varchar(50),payment_date varchar(50),due_before_payment varchar(50),paid varchar(50),due_after_payment varchar(50),status varchar(50));";
       
            Statement stmt=con.createStatement();
           
            stmt.executeUpdate(query);

            stmt.executeUpdate(query1);
       
            stmt.executeUpdate(query2);
        
            stmt.executeUpdate(query3);
        
            stmt.executeUpdate(query4);
         
            stmt.executeUpdate(query5);
   
            stmt.executeUpdate(query6);
          
            stmt.executeUpdate(query7);
   
            lbl1.setText("Database and Table Creation Complete.\nSystem Ready To work");
     
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Whoa! Something Went Wrong\nPossibility of Having Error While \n Creating Connection to MySql Client ","Something Went Wrong",2);
        }
 }
 else
        {
            ;
 }
               }
               
           }
           splash.setVisible(false);
        }
        catch(Exception e)
        {
            
        }
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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbl1;
    public javax.swing.JProgressBar loadingbar;
    public javax.swing.JLabel loadingnum;
    // End of variables declaration//GEN-END:variables
}
