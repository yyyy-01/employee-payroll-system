package employee.payroll.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import javax.swing.*;
import java.awt.event.KeyEvent;

public class Employee_Login_Page extends javax.swing.JFrame implements ActionListener {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null; 
static int id;
static String pswd;

    /** Creates new form Employee_Login_Page */
    public Employee_Login_Page() {
        initComponents();
        conn = database.java_database();
        login_button.addActionListener(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            protected void paintComponent(java.awt.Graphics g)
            {
                g.setColor( getBackground() );
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        }
        ;
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        checkbox_admin = new javax.swing.JCheckBox();
        emp_login_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Login");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee ID: ");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password: ");

        txt_id.setBackground(new java.awt.Color(204, 255, 255));
        txt_id.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idKeyReleased(evt);
            }
        });

        txt_password.setBackground(new java.awt.Color(204, 255, 255));
        txt_password.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        login_button.setBackground(new java.awt.Color(153, 255, 153));
        login_button.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        login_button.setText("LOGIN");
        login_button.setBorder(null);
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        checkbox_admin.setBackground(new java.awt.Color(0, 0, 0,0));
        checkbox_admin.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        checkbox_admin.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_admin.setText("Admin Login");
        checkbox_admin.setBorder(null);
        checkbox_admin.setOpaque(false);
        checkbox_admin.setRolloverEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(jLabel2))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(37, 37, 37)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(checkbox_admin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 177, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel3)
                                    .add(jLabel4))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(txt_id)
                                    .add(txt_password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(login_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel2)
                .add(35, 35, 35)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txt_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txt_password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(checkbox_admin)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 48, Short.MAX_VALUE)
                .add(login_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 380, 350));

        emp_login_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/money background.jpg"))); // NOI18N
        getContentPane().add(emp_login_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 690));

        setSize(new java.awt.Dimension(1380, 723));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyReleased
        char c = evt.getKeyChar();
        if(!txt_password.getText().equals("")&&evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            loginAction();
        }
    }//GEN-LAST:event_txt_idKeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        char c = evt.getKeyChar();
        if(!txt_id.getText().equals("")&&evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            loginAction();
        }
    }//GEN-LAST:event_txt_passwordKeyReleased
@Override
    public void actionPerformed(ActionEvent evt)
    {
       loginAction();
    }
    
    private void loginAction(){
        if(txt_id.getText().equals("")&&txt_password.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID and Password should not be blank!","Warning", JOptionPane.WARNING_MESSAGE);
        }else{

            String sql = "select * from employee where (id = ? and password = ?)";

            try{

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_id.getText());
                pst.setString(2, txt_password.getText());
                rs = pst.executeQuery();

                if(rs.next()){
                    String emp_name = rs.getString("emp_name");
                    Emp.name = emp_name;
                    String id = rs.getString(1);
                    Emp.empID = id;
                    String position = rs.getString("position");
                    Emp.position = position;
                    String birthday = rs.getString("birthday");
                    Emp.birthday = birthday;
                    String gender = rs.getString("gender");
                    Emp.gender = gender;
                    String phone = rs.getString("phone");
                    Emp.phone = phone;
                    String email = rs.getString("email");
                    Emp.email = email;
                    String address = rs.getString("address");
                    Emp.address = address;
                    String status = rs.getString("status");
                    Emp.status = status;

                    String date_employed = rs.getString("date_employed");
                    Emp.date_employed = date_employed;
                    int salary = rs.getInt(5);
                    Emp.salary = salary;

                    if(rs.getBytes("profile")!=null){
                        Emp.profile = rs.getBytes("profile");
                    }else if(rs.getBytes("profile")==null){
                        Emp.profile = null;
                    }

                    rs.close();
                    pst.close();

                    if(checkbox_admin.isSelected()){
                        if (Emp.position.contains("Admin")||Emp.position.contains("admin")){
                            JOptionPane.showMessageDialog(null, "Admin Login Successful");
                            Admin_Page adminpage = new Admin_Page();
                            adminpage.setVisible(true);
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null, "You are not an admin, please login as employee.");
                        }
                    }else{ 
                        JOptionPane.showMessageDialog(null, "Login Sucessful");
                        Main j = new Main();
                        j.setVisible(true);               
                        this.dispose();  
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Employee ID or Password you entered are wrong!","Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally {
                if(rs != null){
                     try{
                          rs.close();
                     } catch(Exception e){
                         JOptionPane.showMessageDialog(null, e);
                     }
                }
                if(pst != null){
                    try{
                        pst.close();
                    } catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        } 
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee_Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox_admin;
    private javax.swing.JLabel emp_login_background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField txt_id;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables

}
