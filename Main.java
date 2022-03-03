package employee.payroll.system;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

public class Main extends javax.swing.JFrame{
    /** Creates new form Main */
    Connection conn = null;
    PreparedStatement pst = null; 
    ResultSet rs=null;
    
    JTextFieldDateEditor dEdit;
    
    public Main() {        
        initComponents();
        intiDateEditor();
        conn = database.java_database();
        
        tab1.setBackground(Color.white);
        jp2.setVisible(false);
                  
         name.setText(String.valueOf(Emp.name));
         emp_id.setText(String.valueOf(Emp.empID).toString());
         phone.setText(String.valueOf(Emp.phone));
         salary.setText("RM " + String.valueOf(Emp.salary).toString());
         position.setText(String.valueOf(Emp.position));
         birthday.setText(String.valueOf(Emp.birthday));
         gender.setText(String.valueOf(Emp.gender));
         email.setText(String.valueOf(Emp.email));
         address.setText(String.valueOf(Emp.address));
         date_employed.setText(String.valueOf(Emp.date_employed));
         status.setText(String.valueOf(Emp.status));
         
         
         if(Emp.profile!=null){
            ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(Emp.profile).getImage().getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_DEFAULT));
            img1.setIcon(imageIcon1);
            img1.setText("");
        }else if(Emp.profile==null){
            img1.setIcon(null);
            img1.setText("No Image");
        }
    }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jp2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        edit_name = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        edit_emp_id = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        saveButton = new javax.swing.JToggleButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        edit_position = new javax.swing.JLabel();
        edit_email = new javax.swing.JTextField();
        edit_address = new javax.swing.JTextField();
        edit_phone = new javax.swing.JTextField();
        edit_gender = new javax.swing.JLabel();
        edit_birthday = new com.toedter.calendar.JDateChooser();
        num_only = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        img2 = new javax.swing.JLabel();
        btn_upload = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        jp1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emp_id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        birthday = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        date_employed = new javax.swing.JLabel();
        calculator = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_changePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Main Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp2.setBackground(new java.awt.Color(146, 155, 167));

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel14.setText("Name             : ");

        edit_name.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        edit_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel16.setText("Position         : ");

        edit_emp_id.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        edit_emp_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel18.setText("Phone No      : ");

        saveButton.setBackground(new java.awt.Color(153, 153, 255));
        saveButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel22.setText("Employee ID: ");

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel23.setText("Birthday        : ");

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel24.setText("Gender         : ");

        jLabel25.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel25.setText("Address        : ");

        jLabel26.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel26.setText("Email             : ");

        edit_position.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        edit_position.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        edit_email.setBackground(new java.awt.Color(204, 204, 255));
        edit_email.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        edit_email.setBorder(null);

        edit_address.setBackground(new java.awt.Color(204, 204, 255));
        edit_address.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        edit_address.setBorder(null);

        edit_phone.setBackground(new java.awt.Color(204, 204, 255));
        edit_phone.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        edit_phone.setBorder(null);
        edit_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edit_phoneKeyPressed(evt);
            }
        });

        edit_gender.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        edit_gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        edit_birthday.setDateFormatString("dd-MM-yyyy");
        edit_birthday.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        num_only.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        jDesktopPane2.setBackground(new java.awt.Color(240, 240, 240));

        img2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setText("No Image");
        jDesktopPane2.add(img2);
        img2.setBounds(10, 10, 170, 200);

        btn_upload.setBackground(new java.awt.Color(153, 153, 255));
        btn_upload.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_upload.setText("Upload");
        btn_upload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });

        btn_remove.setBackground(new java.awt.Color(153, 153, 255));
        btn_remove.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(255, 0, 51));
        btn_remove.setText("Remove");
        btn_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jp2Layout = new org.jdesktop.layout.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jp2Layout.createSequentialGroup()
                .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jp2Layout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 166, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jp2Layout.createSequentialGroup()
                                .add(1, 1, 1)
                                .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel16)
                                    .add(jLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel24)
                                    .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jLabel14)
                                        .add(jLabel22)))))
                        .add(10, 10, 10)
                        .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(edit_position, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 454, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(edit_birthday, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 454, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(edit_gender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 454, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(edit_email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 453, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jp2Layout.createSequentialGroup()
                                .add(1, 1, 1)
                                .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(edit_name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 454, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(edit_emp_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(69, 69, 69)
                        .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jDesktopPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jp2Layout.createSequentialGroup()
                                .add(btn_upload, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, 0)
                                .add(btn_remove, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jp2Layout.createSequentialGroup()
                        .add(355, 355, 355)
                        .add(saveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jp2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(edit_phone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 453, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(num_only, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 327, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jp2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(edit_address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 750, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(56, 134, Short.MAX_VALUE))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jp2Layout.createSequentialGroup()
                .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jp2Layout.createSequentialGroup()
                        .add(47, 47, 47)
                        .add(jDesktopPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btn_upload)
                            .add(btn_remove)))
                    .add(jp2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(edit_name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jp2Layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(edit_emp_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(edit_position, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(edit_birthday, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(11, 11, 11)
                                .add(edit_gender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(11, 11, 11)
                                .add(edit_email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jp2Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(jLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(11, 11, 11)
                                .add(jLabel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(11, 11, 11)
                                .add(jLabel26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(num_only, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(edit_phone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jp2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(edit_address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(82, 82, 82)
                .add(saveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jp1.setBackground(new java.awt.Color(146, 155, 167));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel4.setText("Name             : ");

        name.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel6.setText("Employee ID: ");

        emp_id.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        emp_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel8.setText("Email             :");

        phone.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel12.setText("Salary                     : ");

        salary.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        salary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel9.setText("Phone No      : ");

        email.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        address.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel11.setText("Address        :");

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel13.setText("Position         :");

        position.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        position.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel15.setText("Birthday        :");

        jLabel17.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel17.setText("Gender         :");

        birthday.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        birthday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        gender.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel19.setText("Date of Employed:");

        date_employed.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        date_employed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/calculator.png"))); // NOI18N
        calculator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculatorMouseClicked(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        img1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setText("No Image");
        jDesktopPane1.add(img1);
        img1.setBounds(10, 10, 170, 200);

        jLabel20.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel20.setText("Status                      : ");

        status.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout jp1Layout = new org.jdesktop.layout.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jp1Layout.createSequentialGroup()
                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jp1Layout.createSequentialGroup()
                                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jp1Layout.createSequentialGroup()
                                        .add(jLabel6)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jp1Layout.createSequentialGroup()
                                        .add(jLabel4)
                                        .add(2, 2, 2)))
                                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(emp_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jp1Layout.createSequentialGroup()
                                .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(position, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jp1Layout.createSequentialGroup()
                                .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(birthday, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jp1Layout.createSequentialGroup()
                                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 728, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jp1Layout.createSequentialGroup()
                                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(phone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(gender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 193, Short.MAX_VALUE)
                                        .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(134, 134, 134))
                    .add(jp1Layout.createSequentialGroup()
                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jp1Layout.createSequentialGroup()
                                .add(jLabel12)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(salary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jp1Layout.createSequentialGroup()
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jp1Layout.createSequentialGroup()
                                    .add(jLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 215, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(date_employed, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(calculator)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jp1Layout.createSequentialGroup()
                        .add(jLabel20)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(status, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 359, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jp1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jp1Layout.createSequentialGroup()
                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .add(emp_id, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .add(position, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel15, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .add(birthday, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(gender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(phone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 102, Short.MAX_VALUE)
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(date_employed, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(salary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(calculator))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jp1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(status, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(44, 44, 44))
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jp1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jp2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jp1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jp2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1050, 690));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        tab1.setBackground(new java.awt.Color(204, 204, 255));
        tab1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Employee Infomation");

        org.jdesktop.layout.GroupLayout tab1Layout = new org.jdesktop.layout.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab1Layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab2.setBackground(new java.awt.Color(204, 204, 255));
        tab2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Edit Employee Infomation");

        org.jdesktop.layout.GroupLayout tab2Layout = new org.jdesktop.layout.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab3.setBackground(new java.awt.Color(204, 204, 255));
        tab3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Logout");

        org.jdesktop.layout.GroupLayout tab3Layout = new org.jdesktop.layout.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab3Layout.createSequentialGroup()
                .add(93, 93, 93)
                .add(jLabel3)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_changePassword.setBackground(new java.awt.Color(204, 204, 255));
        btn_changePassword.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btn_changePassword.setText("Change Password");
        btn_changePassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_changePassword.setBorderPainted(false);
        btn_changePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_changePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_changePasswordMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(tab2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(tab3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(btn_changePassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(203, 203, 203)
                .add(tab1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(tab2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btn_changePassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(tab3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        jp1.setVisible(true);
        jp2.setVisible(false);
        tab1.setBackground(Color.white);
        tab2.setBackground(new Color(204,204,255));
        tab3.setBackground(new Color(204,204,255));
        btn_changePassword.setBackground(new Color(204,204,255));
        
        try{
         tab1.setBackground(Color.white);
         jp2.setVisible(false);
                  
         name.setText(String.valueOf(Emp.name));
         emp_id.setText(String.valueOf(Emp.empID).toString());
         phone.setText(String.valueOf(Emp.phone));
         salary.setText("RM " + String.valueOf(Emp.salary).toString());
         position.setText(String.valueOf(Emp.position));
         birthday.setText(String.valueOf(Emp.birthday));
         gender.setText(String.valueOf(Emp.gender));
         email.setText(String.valueOf(Emp.email));
         address.setText(String.valueOf(Emp.address));
         date_employed.setText(String.valueOf(Emp.date_employed));
         status.setText(String.valueOf(Emp.status));
         
        if(Emp.profile!=null){
            ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(Emp.profile).getImage().getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_DEFAULT));
            img1.setIcon(imageIcon1);
            img1.setText("");
        }else if(Emp.profile==null){
            img1.setIcon(null);
            img1.setText("No Image");
        }
         
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        jp1.setVisible(false);
        jp2.setVisible(true);
        tab1.setBackground(new Color(204,204,255));
        tab2.setBackground(Color.white);
        tab3.setBackground(new Color(204,204,255));
        btn_changePassword.setBackground(new Color(204,204,255));
        
        try{
         edit_name.setText(String.valueOf(Emp.name));
         edit_emp_id.setText(String.valueOf(Emp.empID).toString());
         edit_position.setText(String.valueOf(Emp.position));
         edit_gender.setText(String.valueOf(Emp.gender));
         edit_phone.setText(String.valueOf(Emp.phone));
         edit_email.setText(String.valueOf(Emp.email));
         edit_address.setText(String.valueOf(Emp.address));
         ((JTextField)edit_birthday.getDateEditor().getUiComponent()).setText(Emp.birthday);  
         
         if(Emp.profile!=null){
            ImageIcon imageIcon2 = new ImageIcon(new ImageIcon(Emp.profile).getImage().getScaledInstance(img2.getWidth(),img2.getHeight(),Image.SCALE_DEFAULT));
            img2.setIcon(imageIcon2);
            img2.setText("");
        }else if(Emp.profile==null){
            img2.setIcon(null);
            img2.setText("No Image");
        }
         
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tab2MouseClicked

    private JFrame frame;
    
    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
            tab1.setBackground(new Color(204,204,255));
            tab2.setBackground(new Color(204,204,255));
            btn_changePassword.setBackground(new Color(204,204,255));
            tab3.setBackground(Color.white);        
        
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to log out?", "Log out",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
        
            JOptionPane.showMessageDialog(null,"You have logout.");
            Employee_Login_Page login = new Employee_Login_Page();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_tab3MouseClicked

    private void edit_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edit_phoneKeyPressed
        String emp_phone = edit_phone.getText();
        int length = emp_phone.length();
        char c = evt.getKeyChar();
        
        if(c >= '0' && c <= '9'){
            if(length < 13){
                edit_phone.setEditable(true);
            }else{
                edit_phone.setEditable(false);
                num_only.setText("Enter an valid phone number");
            }                       
                                    
        }else{
            edit_phone.setEditable(false);
            num_only.setText("Enter number only");
            
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
                edit_phone.setEditable(true);
                num_only.setText("");
            }else{
                edit_phone.setEditable(false);
            }
        }       
        
    }//GEN-LAST:event_edit_phoneKeyPressed

    private void calculatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatorMouseClicked
        JCalculator calculator = new JCalculator();
        calculator.setVisible(true);
    }//GEN-LAST:event_calculatorMouseClicked

    private void btn_changePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_changePasswordMouseClicked
        
        btn_changePassword.setBackground(Color.white);
        tab1.setBackground(new Color(204,204,255));
        tab2.setBackground(new Color(204,204,255));
        tab3.setBackground(new Color(204,204,255));
        
        
        JPasswordField txt_oldpw = new JPasswordField();
        JPasswordField txt_newpw1 = new JPasswordField();
        JPasswordField txt_newpw2 = new JPasswordField();

        Object[] fields ={
            "Enter current password", txt_oldpw,
            "Enter new password", txt_newpw1,
            "Reenter new password", txt_newpw2
        };
        int result = JOptionPane.showConfirmDialog(null, fields, "Change password",JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            try{
                String sql ="Select password from employee where id=?";
                pst=conn.prepareStatement(sql);
                pst.setString(1,emp_id.getText());
                rs = pst.executeQuery();

                if(rs.next()){

                    if(!(txt_oldpw.getText().equals(rs.getString("password")))){
                        JOptionPane.showMessageDialog(null,"Your current password is wrong.");
                    }else if(!(txt_newpw1.getText().equals(txt_newpw2.getText()))){
                        JOptionPane.showMessageDialog(null,"New password is not the same.");
                    }else if(txt_newpw1.getText().equals(txt_oldpw.getText())){
                        JOptionPane.showMessageDialog(null,"New password cannot be the same as your old password");
                    }else{
                        int result1 = JOptionPane.showConfirmDialog(null,"Are you sure to change password?", "Change password",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);
                        if(result1 == JOptionPane.YES_OPTION){
                            try{
                                String sq ="update employee set password = '"+txt_newpw1.getText()+"' where id=?";
                                pst=conn.prepareStatement(sq);
                                pst.setString(1,emp_id.getText());
                                pst.execute();
                                JOptionPane.showMessageDialog(null,"Password changed.");
                            }catch(Exception e){
                                JOptionPane.showMessageDialog(null,e);
                            }
                        }
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }
    }//GEN-LAST:event_btn_changePasswordMouseClicked

    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_DEFAULT));
        img2.setText(null);
        img2.setIcon(imageIcon);

        try{
            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int number; (number = fix.read(buf))!=-1;){
                bos.write(buf,0,number);
            }
            person_image = bos.toByteArray();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_uploadActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{ 
                       
        String val = edit_emp_id.getText();
        String val1 = edit_phone.getText();
        String val2 = edit_email.getText();
        String val3 = edit_address.getText();
        String val4 = ((JTextField)edit_birthday.getDateEditor().getUiComponent()).getText();  
        
        if(val1.isEmpty() || val2.isEmpty() || val3.isEmpty() || val4.isEmpty()){
            JOptionPane.showMessageDialog(null,"Field should not be empty.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(!val2.contains("@") || !val2.contains(".com")){
            JOptionPane.showMessageDialog(null,"Enter an valid email.","Error", JOptionPane.ERROR_MESSAGE);
        }else{
                String sql = " update employee set phone = '"+val1+"', email = '"+val2+"', address = '"+val3+"', " 
                    + " birthday = '"+val4+"', profile = ? where id = '"+val+"' ";

                pst = conn.prepareStatement(sql);
                pst.setBytes(1, person_image);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Record Updated");
            }
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to remove?", "Remove Profile",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            img2.setIcon(null);
            img2.setText("No Image");
            person_image=null;
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private void intiDateEditor(){
         dEdit = (JTextFieldDateEditor) edit_birthday.getDateEditor();
         dEdit.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel birthday;
    private javax.swing.JButton btn_changePassword;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_upload;
    private javax.swing.JLabel calculator;
    private javax.swing.JLabel date_employed;
    private javax.swing.JTextField edit_address;
    private com.toedter.calendar.JDateChooser edit_birthday;
    private javax.swing.JTextField edit_email;
    private javax.swing.JLabel edit_emp_id;
    private javax.swing.JLabel edit_gender;
    private javax.swing.JLabel edit_name;
    private javax.swing.JTextField edit_phone;
    private javax.swing.JLabel edit_position;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emp_id;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel num_only;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel position;
    private javax.swing.JLabel salary;
    private javax.swing.JToggleButton saveButton;
    private javax.swing.JLabel status;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    // End of variables declaration//GEN-END:variables
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;
}
