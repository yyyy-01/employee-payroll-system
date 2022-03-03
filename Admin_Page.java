package employee.payroll.system;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;
import javax.swing.JPasswordField;
import java.awt.event.KeyEvent;
import javax.swing.DefaultRowSorter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.PageSize;
import java.awt.Font;

public class Admin_Page extends javax.swing.JFrame implements ActionListener {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
String table_sql = "Select * from employee ";
    
    /** Creates new form Admin_Page */
    public Admin_Page() {
        conn = database.java_database();
        initComponents();
        intiDateEditor();
        initTable(table_sql);
        
        lbl_login.setText("  ID: "+Emp.empID+"  ");
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        btn_add.addActionListener(this);
        btn_clear.addActionListener(this);
        btn_update.addActionListener(this);
        btn_delete.addActionListener(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txt_birthday = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_dateEmployed = new com.toedter.calendar.JDateChooser();
        txt_salary = new javax.swing.JTextField();
        btn_calculator = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        btn_upload = new javax.swing.JButton();
        combo_position = new javax.swing.JComboBox<>();
        btn_remove = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        combo_status = new javax.swing.JComboBox<>();
        combo_search = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        lbl_login = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        selected_pdf = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        all_pdf = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        cln_name = new javax.swing.JCheckBoxMenuItem();
        cln_gender = new javax.swing.JCheckBoxMenuItem();
        cln_birthday = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        cln_phone = new javax.swing.JCheckBoxMenuItem();
        cln_email = new javax.swing.JCheckBoxMenuItem();
        cln_address = new javax.swing.JCheckBoxMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        cln_position = new javax.swing.JCheckBoxMenuItem();
        cln_salary = new javax.swing.JCheckBoxMenuItem();
        cln_dateOfEmployed = new javax.swing.JCheckBoxMenuItem();
        cln_status = new javax.swing.JCheckBoxMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        cln_password = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_refresh = new javax.swing.JMenuItem();
        menu_showall = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        chgpass_emp = new javax.swing.JMenuItem();
        resetpass_emp = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        chgpass_own = new javax.swing.JMenuItem();
        resetpass_own = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(146, 155, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Birthday", "Phone", "Email", "Address", "Position", "Salary", "Date of Employed", "Status", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 487, 1250, 180));

        txt_search.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 380, -1));

        jLabel28.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel28.setText("Search : ");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 30));

        jLabel29.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel29.setText("Employee ID         : ");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 30));

        txt_id.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idKeyPressed(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 270, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel5.setText("Name                     : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, -1));

        txt_name.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nameKeyPressed(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 270, -1));

        jLabel18.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel18.setText("Gender                  :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 210, -1));

        r_male.setBackground(new java.awt.Color(146, 155, 167));
        r_male.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        r_male.setText("Male");
        r_male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r_maleMouseClicked(evt);
            }
        });
        jPanel1.add(r_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 30));

        r_female.setBackground(new java.awt.Color(146, 155, 167));
        r_female.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        r_female.setText("Female");
        r_female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r_femaleMouseClicked(evt);
            }
        });
        jPanel1.add(r_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 140, 31));

        jLabel16.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel16.setText("Birthday                 :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 220, -1));

        txt_birthday.setDateFormatString("dd-MM-yyyy");
        txt_birthday.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jPanel1.add(txt_birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 270, 40));

        jLabel22.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel22.setText("Address        :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 170, -1));

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel21.setText("Email             :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 160, -1));

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel14.setText("Position                  :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 210, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel10.setText("Phone No      : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 170, -1));

        txt_phone.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneKeyPressed(evt);
            }
        });
        jPanel1.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 270, -1));

        txt_email.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 270, -1));

        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        txt_address.setLineWrap(true);
        txt_address.setRows(3);
        jScrollPane2.setViewportView(txt_address);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 270, -1));

        jLabel25.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel25.setText("Salary                     : ");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 230, -1));

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel23.setText("Date of Employed :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 220, -1));

        txt_dateEmployed.setDateFormatString("dd-MM-yyyy");
        txt_dateEmployed.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jPanel1.add(txt_dateEmployed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 270, 40));

        txt_salary.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        txt_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_salaryKeyPressed(evt);
            }
        });
        jPanel1.add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 220, -1));

        btn_calculator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/calculator.png"))); // NOI18N
        btn_calculator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_calculatorMouseClicked(evt);
            }
        });
        jPanel1.add(btn_calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 40, 40));

        btn_add.setBackground(new java.awt.Color(204, 204, 255));
        btn_add.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 204, 0));
        btn_add.setText("Add");
        btn_add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.setBorderPainted(false);
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 200, -1));

        btn_update.setBackground(new java.awt.Color(204, 204, 255));
        btn_update.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_update.setForeground(new java.awt.Color(204, 153, 0));
        btn_update.setText("Update");
        btn_update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.setBorderPainted(false);
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 200, -1));

        btn_delete.setBackground(new java.awt.Color(204, 204, 255));
        btn_delete.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 0, 0));
        btn_delete.setText("Delete");
        btn_delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.setBorderPainted(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 440, 200, -1));

        btn_clear.setBackground(new java.awt.Color(204, 204, 255));
        btn_clear.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(102, 102, 102));
        btn_clear.setText("Clear");
        btn_clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_clear.setBorderPainted(false);
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 200, -1));

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        img.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setText("No Image");
        jDesktopPane1.add(img);
        img.setBounds(10, 10, 180, 220);

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 200, 240));

        btn_upload.setBackground(new java.awt.Color(153, 153, 255));
        btn_upload.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_upload.setText("Upload");
        btn_upload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });
        jPanel1.add(btn_upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 310, 100, -1));

        combo_position.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        combo_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-None-", "Admin", "CEO", "COO", "CFO", "CMO", "CTO", "Executive Assistant", "Marketing manager", "Product manager", "Project manager", "Finance manager", "HR manager", "Marketing specialist", "Business analyst", "Human resource personnel", "Accountant", "Sales representative", "Customer service representative", "Administrative assistant", "IT technician", "Intern" }));
        combo_position.setToolTipText("");
        combo_position.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_positionMousePressed(evt);
            }
        });
        combo_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_positionActionPerformed(evt);
            }
        });
        jPanel1.add(combo_position, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 270, -1));

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
        jPanel1.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 310, 100, -1));

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel15.setText("Status             :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 170, -1));

        combo_status.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", "Absence", "Terminated", "Resigned", "Deceased" }));
        combo_status.setToolTipText("");
        combo_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_statusActionPerformed(evt);
            }
        });
        jPanel1.add(combo_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 180, -1));

        combo_search.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        combo_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Gender", "Phone", "Email", "Address", "Position", "Status" }));
        jPanel1.add(combo_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1300, 688));

        lbl_login.setText("ID: 0000000000");
        lbl_login.setEnabled(false);
        jMenuBar1.add(lbl_login);

        jMenu5.setText("  Export  ");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem3.setText("Selected Employee");
        jMenuItem3.setEnabled(false);
        jMenu5.add(jMenuItem3);

        selected_pdf.setText("PDF (.pdf)");
        selected_pdf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selected_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selected_pdfActionPerformed(evt);
            }
        });
        jMenu5.add(selected_pdf);
        jMenu5.add(jSeparator6);

        jMenuItem6.setText("All Employees");
        jMenuItem6.setEnabled(false);
        jMenu5.add(jMenuItem6);

        all_pdf.setText("PDF (.pdf)");
        all_pdf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        all_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_pdfActionPerformed(evt);
            }
        });
        jMenu5.add(all_pdf);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("  Table  ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu3.setText("Columns");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Employee ID");
        jCheckBoxMenuItem1.setEnabled(false);
        jMenu3.add(jCheckBoxMenuItem1);

        cln_name.setSelected(true);
        cln_name.setText("Name");
        jMenu3.add(cln_name);

        cln_gender.setSelected(true);
        cln_gender.setText("Gender");
        jMenu3.add(cln_gender);

        cln_birthday.setSelected(true);
        cln_birthday.setText("Birthday");
        jMenu3.add(cln_birthday);
        jMenu3.add(jSeparator3);

        cln_phone.setSelected(true);
        cln_phone.setText("Phone");
        jMenu3.add(cln_phone);

        cln_email.setSelected(true);
        cln_email.setText("Email");
        jMenu3.add(cln_email);

        cln_address.setSelected(true);
        cln_address.setText("Address");
        jMenu3.add(cln_address);
        jMenu3.add(jSeparator4);

        cln_position.setSelected(true);
        cln_position.setText("Position");
        jMenu3.add(cln_position);

        cln_salary.setSelected(true);
        cln_salary.setText("Salary");
        jMenu3.add(cln_salary);

        cln_dateOfEmployed.setSelected(true);
        cln_dateOfEmployed.setText("Date of Employed");
        jMenu3.add(cln_dateOfEmployed);

        cln_status.setSelected(true);
        cln_status.setText("Status");
        jMenu3.add(cln_status);
        jMenu3.add(jSeparator5);

        cln_password.setText("Password");
        jMenu3.add(cln_password);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator1);

        menu_refresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_refresh.setText("Refresh Table");
        menu_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_refreshActionPerformed(evt);
            }
        });
        jMenu1.add(menu_refresh);

        menu_showall.setText("Show All Employees");
        menu_showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_showallActionPerformed(evt);
            }
        });
        jMenu1.add(menu_showall);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("  Password  ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chgpass_emp.setText("Change Employee's Password");
        chgpass_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpass_empActionPerformed(evt);
            }
        });
        jMenu2.add(chgpass_emp);

        resetpass_emp.setText("Reset Employee's Password");
        resetpass_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetpass_empActionPerformed(evt);
            }
        });
        jMenu2.add(resetpass_emp);
        jMenu2.add(jSeparator2);

        chgpass_own.setText("Change Own's Password");
        chgpass_own.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpass_ownActionPerformed(evt);
            }
        });
        jMenu2.add(chgpass_own);

        resetpass_own.setText("Reset Own's Password");
        resetpass_own.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetpass_ownActionPerformed(evt);
            }
        });
        jMenu2.add(resetpass_own);

        jMenuBar1.add(jMenu2);

        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("  Log Out  ");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

@Override
     public void actionPerformed(ActionEvent evt)
     {
         JButton actionSource = (JButton)evt.getSource();
        if(actionSource.equals(btn_add))
        {
            if(txt_id.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter ID to add employee.");
            }else if(isExist(txt_id.getText())){
                JOptionPane.showMessageDialog(null, "Employee with ID: "+txt_id.getText()+" exists. Please add the employee with a unique ID.");
            }else if(!(txt_email.getText().equals(""))&&!(txt_email.getText().contains("@")&&txt_email.getText().contains(".com"))){
                JOptionPane.showMessageDialog(null,"Please enter a valid email.");
             }else{
                int result = JOptionPane.showConfirmDialog(null,"Are you sure to add the record?", "Add record",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                try{
                    String sql = "insert into employee (ID, password, emp_name, phone, salary, address, email, gender, birthday, date_employed, position, profile, status)"
                        +" values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_id.getText());
                pst.setString(2, txt_phone.getText()); //default password = phone number
                pst.setString(3, txt_name.getText());
                pst.setString(4, txt_phone.getText());
                pst.setString(5, "0"+txt_salary.getText());
                pst.setString(6, txt_address.getText());
                pst.setString(7, txt_email.getText());
                pst.setString(8, gender);
                pst.setString(9, ((JTextField)txt_birthday.getDateEditor().getUiComponent()).getText());
                pst.setString(10, ((JTextField)txt_dateEmployed.getDateEditor().getUiComponent()).getText());
                pst.setString(11, position);
                pst.setBytes(12, person_image);
                pst.setString(13, status);
                
                pst.execute();
                JOptionPane.showMessageDialog(null,"Employee account added.\nID: "+txt_id.getText()+"\nPassword: "+txt_phone.getText());
                initTable(table_sql);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }finally{
                    try{
                        pst.close();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                   }
                }
            }
        }
        else if (actionSource.equals(btn_clear))
        {
            txt_id.setText("");
            txt_name.setText("");
            txt_phone.setText("");
            txt_salary.setText("");
            txt_address.setText("");
            txt_email.setText("");
            gender = " ";
            r_female.setSelected(false);
            r_male.setSelected(false);
            ((JTextField)txt_birthday.getDateEditor().getUiComponent()).setText("");
            ((JTextField)txt_dateEmployed.getDateEditor().getUiComponent()).setText("");
            position = " ";
            combo_position.setSelectedIndex(0);
            person_image=null;
            img.setIcon(null);
            img.setText("No Image");
            status = "Active";
            combo_status.setSelectedIndex(0);
        }
        else if (actionSource.equals(btn_update))
        {
           if(txt_id.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No Employee Selected");
            }else if(!isExist(txt_id.getText())){
                JOptionPane.showMessageDialog(null, "No Employee with ID: "+txt_id.getText());
            }else if(!(txt_email.getText().equals(""))&&!(txt_email.getText().contains("@")&&txt_email.getText().contains(".com"))){
                JOptionPane.showMessageDialog(null,"Please enter a valid email.");
            }else {
            int result = JOptionPane.showConfirmDialog(null,"Are you sure to update?", "Update record",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
            try{
                
                if (r_male.isSelected()==true){
                   gender ="Male";
                }else if(r_female.isSelected()==true){
                   gender ="Female";
                }
                
                String sql= "update employee "
                        + "set emp_name = '"+txt_name.getText()
                        +"', phone = '"+txt_phone.getText()
                        +"', salary = 0"+txt_salary.getText()
                        +", address = '"+txt_address.getText()
                        +"', email = '"+txt_email.getText()
                        +"', gender = ?"
                        +", birthday = '"+((JTextField)txt_birthday.getDateEditor().getUiComponent()).getText()
                        +"', date_employed = '"+((JTextField)txt_dateEmployed.getDateEditor().getUiComponent()).getText()
                        +"', position = '"+position
                        +"', status = '"+status
                        + "', profile = ?"
                        + "  where id="+txt_id.getText()+" ";
                
                pst=conn.prepareStatement(sql);
                pst.setString(1, gender);
                pst.setBytes(2, person_image);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Record Updated");
                initTable(table_sql);
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
            } 
        }
        else if(actionSource.equals(btn_delete))
        {
            if(txt_id.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No Employee Selected");
            }else if(!isExist(txt_id.getText())){
                JOptionPane.showMessageDialog(null, "No Employee with ID: "+txt_id.getText());
            }
            else{
            int result = JOptionPane.showConfirmDialog(null,"Are you sure to delete?", "Delete record",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                
                try{
                    String sql = "delete from employee where id=?";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txt_id.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Record Deleted");
                    initTable(table_sql);

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
        }
        }
     }
     
    private void btn_calculatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calculatorMouseClicked
        JCalculator calculator = new JCalculator();
        calculator.setVisible(true);
    }//GEN-LAST:event_btn_calculatorMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        int length = txt_salary.getText().length();
        char c = evt.getKeyChar();
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            if(combo_search.getSelectedItem().toString().equals("ID")){
                table_sql = "Select * from employee where id LIKE '"+txt_search.getText()+"%' OR id LIKE '%"+txt_search.getText()+"%' OR id LIKE '%"+txt_search.getText()+"'";
            }else if(combo_search.getSelectedItem().toString().equals("Name")){
                table_sql = "Select * from employee where emp_name LIKE '"+txt_search.getText()+"%' OR emp_name LIKE '%"+txt_search.getText()+"%' OR emp_name LIKE '%"+txt_search.getText()+"'";
            }
            else if(combo_search.getSelectedItem().toString().equals("Position")){
                table_sql = "Select * from employee where position LIKE '"+txt_search.getText()+"%' OR position LIKE '%"+txt_search.getText()+"%' OR position LIKE '%"+txt_search.getText()+"'";
            }
            else if(combo_search.getSelectedItem().toString().equals("Gender")){
                table_sql = "Select * from employee where gender LIKE '"+txt_search.getText()+"%'";
            }
            else if(combo_search.getSelectedItem().toString().equals("Phone")){
                table_sql = "Select * from employee where phone LIKE '"+txt_search.getText()+"%' OR phone LIKE '%"+txt_search.getText()+"%' OR phone LIKE '%"+txt_search.getText()+"'";
            }
            else if(combo_search.getSelectedItem().toString().equals("Email")){
                table_sql = "Select * from employee where email LIKE '"+txt_search.getText()+"%' OR email LIKE '%"+txt_search.getText()+"%' OR email LIKE '%"+txt_search.getText()+"'";
            }
            else if(combo_search.getSelectedItem().toString().equals("Status")){
                table_sql = "Select * from employee where status LIKE '"+txt_search.getText()+"%' ";
            }
            else if(combo_search.getSelectedItem().toString().equals("Address")){
                table_sql = "Select * from employee where address LIKE '"+txt_search.getText()+"%' OR address LIKE '%"+txt_search.getText()+"%' OR address LIKE '%"+txt_search.getText()+"'";
            }
        }
        initTable(table_sql);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
        String selected_id = (tbModel.getValueAt(jTable1.getSelectedRow(),0).toString());
        searchid(selected_id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txt_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyPressed
        int length = txt_id.getText().length();
        char c = evt.getKeyChar();
        
        if((evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) || (evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) || 
                evt.getExtendedKeyCode()==KeyEvent.VK_LEFT || evt.getExtendedKeyCode()==KeyEvent.VK_RIGHT){
            //do nothing
        }else if((c >= '0' && c <= '9')){
            if(length < 10){
                //do nothing
            }else{
                txt_id.setEditable(false);
                JOptionPane.showMessageDialog(null,"Enter an valid ID number");
                txt_id.setEditable(true);
            }                       
        }else{
            txt_id.setEditable(false);
            JOptionPane.showMessageDialog(null,"Enter number only");
            txt_id.setEditable(true);
        }      
    }//GEN-LAST:event_txt_idKeyPressed

    private void txt_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyPressed
        int length = txt_phone.getText().length();
        char c = evt.getKeyChar();
        
        if((evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) || (evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) || 
                evt.getExtendedKeyCode()==KeyEvent.VK_LEFT || evt.getExtendedKeyCode()==KeyEvent.VK_RIGHT){
            //do nothing
        }else if((c >= '0' && c <= '9')){
            if(length < 12){
                //do nothing
            }else{
                txt_phone.setEditable(false);
                JOptionPane.showMessageDialog(null,"Enter an valid ID number");
                txt_phone.setEditable(true);
            }                       
        }else{
            txt_phone.setEditable(false);
            JOptionPane.showMessageDialog(null,"Enter number only");
            txt_phone.setEditable(true);
        }
    }//GEN-LAST:event_txt_phoneKeyPressed

    private void txt_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyPressed
        int length = txt_name.getText().length();
        char c = evt.getKeyChar();
        
        if((evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) || (evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) || 
                evt.getExtendedKeyCode()==KeyEvent.VK_LEFT || evt.getExtendedKeyCode()==KeyEvent.VK_RIGHT){
            //do nothing
        }else if((c >= '0' && c <= '9')){
                txt_name.setEditable(false);
                JOptionPane.showMessageDialog(null,"Number is not allowed");
                txt_name.setEditable(true);                       
        }else{
            //do nothing
        } 
    }//GEN-LAST:event_txt_nameKeyPressed

    private void txt_salaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salaryKeyPressed
        int length = txt_salary.getText().length();
        char c = evt.getKeyChar();
        
        if((evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) || (evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) || 
                evt.getExtendedKeyCode()==KeyEvent.VK_LEFT || evt.getExtendedKeyCode()==KeyEvent.VK_RIGHT){
            //do nothing
        }else if((c >= '0' && c <= '9')){
            if(length < 6){
                //do nothing
            }else{
                txt_salary.setEditable(false);
                JOptionPane.showMessageDialog(null,"Enter an valid amount");
                txt_salary.setEditable(true);
            }                       
        }else{
            txt_salary.setEditable(false);
            JOptionPane.showMessageDialog(null,"Enter number only");
            txt_salary.setEditable(true);
        }
    }//GEN-LAST:event_txt_salaryKeyPressed

    private void chgpass_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpass_empActionPerformed
        if(txt_id.getText().equals("")||txt_id.getText().equals(null)){
            JOptionPane.showMessageDialog(null, "No Employee Selected");
        }else if(!isExist(txt_id.getText())){
            JOptionPane.showMessageDialog(null, "No Employee with ID: "+txt_id.getText());
        }else{
            JPasswordField txt_oldpw = new JPasswordField();
            JPasswordField txt_newpw1 = new JPasswordField();
            JPasswordField txt_newpw2 = new JPasswordField();

            Object[] fields ={
                "Employee ID : "+txt_id.getText(),
                "      ",
                "Enter current password", txt_oldpw,
                "Enter new password", txt_newpw1,
                "Reenter new password", txt_newpw2
            };
            int result = JOptionPane.showConfirmDialog(null, fields, "Change password",JOptionPane.OK_CANCEL_OPTION);
            if(result == JOptionPane.OK_OPTION){
                try{
                    String sql ="Select password from employee where id=?";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_id.getText());
                    rs = pst.executeQuery();

                    if(rs.next()){

                        if(!(txt_oldpw.getText().equals(rs.getString("password")))){
                            JOptionPane.showMessageDialog(null,"The current password of the employee is wrong.");
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
                                    pst.setString(1,txt_id.getText());
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
        }
    }//GEN-LAST:event_chgpass_empActionPerformed

    private void resetpass_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetpass_empActionPerformed
        if(txt_id.getText().equals("")||txt_id.getText().equals(null)){
            JOptionPane.showMessageDialog(null, "No Employee Selected");
        }else if(!isExist(txt_id.getText())){
            JOptionPane.showMessageDialog(null, "No Employee with ID: "+txt_id.getText());
        }else{
            int result = JOptionPane.showConfirmDialog(null,"Are you sure to reset password of employee with ID: "+txt_id.getText(), "Reset Password",
                   JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){

                try{
                    String sql= "update employee "
                            + "set password = '"+txt_phone.getText()
                            +"' where id="+txt_id.getText()+" ";

                    pst=conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Password has been reset for employee ID: "+txt_id.getText()+"\nNew password: "+txt_phone.getText());
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"No employee with ID: "+txt_id.getText()+"found.");
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
        }
    }//GEN-LAST:event_resetpass_empActionPerformed

    private void chgpass_ownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpass_ownActionPerformed
        JPasswordField txt_oldpw = new JPasswordField();
        JPasswordField txt_newpw1 = new JPasswordField();
        JPasswordField txt_newpw2 = new JPasswordField();
        
        Object[] fields ={
            "Your ID : "+Emp.empID,
            "      ",
            "Enter current password", txt_oldpw,
            "Enter new password", txt_newpw1,
            "Reenter new password", txt_newpw2
        };
        int result = JOptionPane.showConfirmDialog(null, fields, "Change password",JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            try{
                String sql2="Select phone from employee where id="+Emp.empID+" ";
                String pass;
                pst=conn.prepareStatement(sql2);
                rs = pst.executeQuery();
                pass=rs.getString("phone");
                rs.close();
                pst.close();
                
                String sql ="Select password from employee where id=?";
                pst=conn.prepareStatement(sql);
                pst.setString(1, Emp.empID);
                rs = pst.executeQuery();
                
                if(rs.next()){
                
                    if(!(txt_oldpw.getText().equals(rs.getString("password")))){
                        JOptionPane.showMessageDialog(null,"Your current password is wrong.");
                    }else if(!(txt_newpw1.getText().equals(txt_newpw2.getText()))){
                        JOptionPane.showMessageDialog(null,"New password is not the same.");
                    }else if(txt_newpw1.getText().equals(txt_oldpw.getText())){
                        JOptionPane.showMessageDialog(null,"New password cannot be the same as your old password");
                    }else{
                        int result1 = JOptionPane.showConfirmDialog(null,"Are you sure to change your password?", "Change password",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                        if(result1 == JOptionPane.YES_OPTION){
                            try{
                                String sq ="update employee set password = '"+txt_newpw1.getText()+"' where id=?";
                                pst=conn.prepareStatement(sq);
                                pst.setString(1, Emp.empID);
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
    }//GEN-LAST:event_chgpass_ownActionPerformed

    private void resetpass_ownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetpass_ownActionPerformed
         int result = JOptionPane.showConfirmDialog(null,"Are you sure to reset your password.\nID: "+Emp.empID, "Reset Password",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
                   
            try{
                String sq="Select phone from employee where id="+Emp.empID+" ";
                String pass;
                pst=conn.prepareStatement(sq);
                rs = pst.executeQuery();
                pass=rs.getString("phone");
                rs.close();
                pst.close();
                
                String sql= "update employee "
                        + "set password = '"+pass
                        +"' where id="+Emp.empID+" ";

                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Password has been reset for employee ID: "+Emp.empID+"\nNew password: "+pass);
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
    }//GEN-LAST:event_resetpass_ownActionPerformed

    private void r_maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_maleMouseClicked
        gender = "Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }//GEN-LAST:event_r_maleMouseClicked

    private void r_femaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_femaleMouseClicked
        gender = "Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
    }//GEN-LAST:event_r_femaleMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to log out?", "Log out",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            Employee_Login_Page login = new Employee_Login_Page();
            login.setVisible(true);
            this.dispose();
        }
            
    }//GEN-LAST:event_logoutMouseClicked

    private void menu_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_refreshActionPerformed
        initTable(table_sql);        
    }//GEN-LAST:event_menu_refreshActionPerformed

    private void combo_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_positionActionPerformed
        if(combo_position.getSelectedIndex()==0){
            position = " ";
        }
        else {
            position = combo_position.getSelectedItem().toString();
        }
    }//GEN-LAST:event_combo_positionActionPerformed

    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setText(null);
        img.setIcon(imageIcon);
        
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

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to remove?", "Remove Profile",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            img.setIcon(null);
            img.setText("No Image");
            person_image=null;
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void combo_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_statusActionPerformed
           status = combo_status.getSelectedItem().toString();
    }//GEN-LAST:event_combo_statusActionPerformed

    private void menu_showallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_showallActionPerformed
        table_sql = "select * from employee ";
        initTable(table_sql);
    }//GEN-LAST:event_menu_showallActionPerformed

    private void all_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_pdfActionPerformed
        Calendar calendar = new GregorianCalendar();
        int d = calendar.get(Calendar.DAY_OF_MONTH);
        int m = calendar.get(Calendar.MONTH) + 1;
        int y = calendar.get(Calendar.YEAR);
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employees("+d+"-"+m+"-"+y+").pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            
            try{
                pst=conn.prepareStatement(table_sql);
                rs=pst.executeQuery();
                
                Document myDocument = new Document(PageSize.A4.rotate());
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                int i=1;
                if(cln_name.isSelected()==true){i++;}
                if(cln_gender.isSelected()==true){i++;}
                if(cln_birthday.isSelected()==true){i++;}
                if(cln_phone.isSelected()==true){i++;}
                if(cln_email.isSelected()==true){i++;}
                if(cln_address.isSelected()==true){i++;}
                if(cln_position.isSelected()==true){i++;}
                if(cln_salary.isSelected()==true){i++;}
                if(cln_dateOfEmployed.isSelected()==true){i++;}
                if(cln_status.isSelected()==true){i++;}
                if(cln_password.isSelected()==true){i++;}
                PdfPTable table = new PdfPTable(i);
                myDocument.open();
                
                table.setWidthPercentage(100);
                
                myDocument.add(new Paragraph("Employee List", FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("  "));
                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                if(cln_name.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_gender.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_birthday.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Birthday",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_phone.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Phone",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_email.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_address.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_position.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Position",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_salary.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_dateOfEmployed.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Date of Employed",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_status.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                if(cln_password.isSelected()==true){
                    table.addCell(new PdfPCell(new Paragraph("Password",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                }
                
                while (rs.next()){
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    if(cln_name.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("emp_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_gender.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("gender"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    } 
                    if(cln_birthday.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("birthday"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_phone.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("phone"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_email.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("email"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_address.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("address"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_position.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("position"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_salary.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("salary"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_dateOfEmployed.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("date_employed"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_status.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("status"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                    if(cln_password.isSelected()==true){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString("password"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    }
                }
                myDocument.add(table);
                myDocument.add(new Paragraph(" "));
                myDocument.close();
                JOptionPane.showMessageDialog(null,"Exported Successfully.\nFile Path: "+filePath);
                
                
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
    }//GEN-LAST:event_all_pdfActionPerformed

    private void selected_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selected_pdfActionPerformed
        if(txt_id.getText().equals("")||txt_id.getText().equals(null)){
            JOptionPane.showMessageDialog(null, "No Employee Selected");
        }else if(!isExist(txt_id.getText())){
            JOptionPane.showMessageDialog(null, "No Employee with ID: "+txt_id.getText());
        }else{
            
            Calendar calendar = new GregorianCalendar();
            int d = calendar.get(Calendar.DAY_OF_MONTH);
            int m = calendar.get(Calendar.MONTH) + 1;
            int y = calendar.get(Calendar.YEAR);
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("Employee_"+txt_id.getText()+"("+d+"-"+m+"-"+y+").pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            
            try{
                String sql = "Select * from employee where id="+txt_id.getText()+" ";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();

                Document myDocument = new Document(PageSize.A4);
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(2);
                table.setWidths(new int[]{3,7});
                table.setWidthPercentage(100);
                if(rs.next()){
                    myDocument.open();
                    myDocument.add(new Paragraph("Employee Information ("+txt_id.getText()+")", FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph("  "));
                    
                    table.addCell(new PdfPCell(new Paragraph("Employee ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("emp_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("gender"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Birthday",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("birthday"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Phone Number",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("phone"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("email"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("address"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Position",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("position"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("salary"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Date of Employed",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("date_employed"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString("status"),FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.PLAIN))));
                    myDocument.add(table);
                    myDocument.close();
                    JOptionPane.showMessageDialog(null,"Exported Successfully.\nFile Path: "+filePath);
                }else{
                    JOptionPane.showMessageDialog(null, "Employee with ID: "+txt_id.getText()+" not found");
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
        }
    }//GEN-LAST:event_selected_pdfActionPerformed

    private void combo_positionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_positionMousePressed
        if(combo_position.getSelectedIndex()==0){
            txt_salary.setText("");
        }else if (position.equals("Admin")){
            txt_salary.setText("8000");
        }else if (combo_position.getSelectedIndex()<=6){
            txt_salary.setText("20000");
        }else if (combo_position.getSelectedIndex()<=12){
            txt_salary.setText("10000");
        }else if (combo_position.getSelectedIndex()<=20){
            txt_salary.setText("5000");
        }else{
            txt_salary.setText("1200");
        }
    }//GEN-LAST:event_combo_positionMousePressed

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
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Page().setVisible(true);
            }
        });
    }
        
    private void intiDateEditor(){
        JTextFieldDateEditor dEdit;
        dEdit = (JTextFieldDateEditor) txt_birthday.getDateEditor();
        dEdit.setEditable(false);
        JTextFieldDateEditor dEdit2;
        dEdit2 = (JTextFieldDateEditor) txt_dateEmployed.getDateEditor();
        dEdit2.setEditable(false);
    }
    
    private void initTable(String sql){
        DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
        DefaultTableModel backupModel = new DefaultTableModel();
        tbModel.setRowCount(0);
        
        try{
            
        jTable1.setModel(tbModel);
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                String id = rs.getString("id");
                String password = rs.getString("password");
                String name = rs.getString("emp_name");
                String phone = rs.getString("phone");
                String salary = rs.getString("salary");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String birthday = rs.getString("birthday");
                String date_employed = rs.getString("date_employed");
                String position = rs.getString("position");
                String status = rs.getString("status");
                
                String tbData[] = {id, name, gender, birthday, phone, email, address, position, salary, date_employed, status, password};
                
                tbModel.addRow(tbData);
                
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
        
        
        //check selected column
        jTable1.getColumnModel().getColumn(0).setMinWidth(100);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        try{
            if(cln_name.isSelected()==false){
                jTable1.getColumnModel().getColumn(1).setMinWidth(0);
                jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(1).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(1).setMinWidth(17);
                jTable1.getColumnModel().getColumn(1).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            }
            if(cln_gender.isSelected()==false){
                jTable1.getColumnModel().getColumn(2).setMinWidth(0);
                jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(2).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(2).setMinWidth(17);
                jTable1.getColumnModel().getColumn(2).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            }
            if(cln_gender.isSelected()==false){
                jTable1.getColumnModel().getColumn(2).setMinWidth(0);
                jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(2).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(2).setMinWidth(17);
                jTable1.getColumnModel().getColumn(2).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            }
            if(cln_birthday.isSelected()==false){
                jTable1.getColumnModel().getColumn(3).setMinWidth(0);
                jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(3).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(3).setMinWidth(17);
                jTable1.getColumnModel().getColumn(3).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            }
            if(cln_phone.isSelected()==false){
                jTable1.getColumnModel().getColumn(4).setMinWidth(0);
                jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(4).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(4).setMinWidth(17);
                jTable1.getColumnModel().getColumn(4).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
            }
            if(cln_email.isSelected()==false){
                jTable1.getColumnModel().getColumn(5).setMinWidth(0);
                jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(5).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(5).setMinWidth(17);
                jTable1.getColumnModel().getColumn(5).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
            }
            if(cln_address.isSelected()==false){
                jTable1.getColumnModel().getColumn(6).setMinWidth(0);
                jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(6).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(6).setMinWidth(17);
                jTable1.getColumnModel().getColumn(6).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
            }
            if(cln_position.isSelected()==false){
                jTable1.getColumnModel().getColumn(7).setMinWidth(0);
                jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(7).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(7).setMinWidth(17);
                jTable1.getColumnModel().getColumn(7).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(7).setPreferredWidth(200);
            }
            if(cln_salary.isSelected()==false){
                jTable1.getColumnModel().getColumn(8).setMinWidth(0);
                jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(8).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(8).setMinWidth(17);
                jTable1.getColumnModel().getColumn(8).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
            }
            if(cln_dateOfEmployed.isSelected()==false){
                jTable1.getColumnModel().getColumn(9).setMinWidth(0);
                jTable1.getColumnModel().getColumn(9).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(9).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(9).setMinWidth(17);
                jTable1.getColumnModel().getColumn(9).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(9).setPreferredWidth(200);
            }
            if(cln_status.isSelected()==false){
                jTable1.getColumnModel().getColumn(10).setMinWidth(0);
                jTable1.getColumnModel().getColumn(10).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(10).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(10).setMinWidth(17);
                jTable1.getColumnModel().getColumn(10).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
            }
            if(cln_password.isSelected()==false){
                jTable1.getColumnModel().getColumn(11).setMinWidth(0);
                jTable1.getColumnModel().getColumn(11).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(11).setWidth(0);
            }else{
                jTable1.getColumnModel().getColumn(11).setMinWidth(17);
                jTable1.getColumnModel().getColumn(11).setMaxWidth(500);
                jTable1.getColumnModel().getColumn(11).setPreferredWidth(200);
            }
            
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        jTable1.setAutoCreateRowSorter(true);

    }
    
    private void searchid(String id){
        try{
            String sql ="Select * from employee where id = "+id+" ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
                txt_id.setText(rs.getString("ID"));
                txt_name.setText(rs.getString("EMP_NAME"));
                txt_phone.setText(rs.getString("phone"));
                txt_salary.setText(rs.getString("salary"));
                txt_address.setText(rs.getString("address"));
                txt_email.setText(rs.getString("email"));
                ((JTextField)txt_birthday.getDateEditor().getUiComponent()).setText(rs.getString("birthday"));
                ((JTextField)txt_dateEmployed.getDateEditor().getUiComponent()).setText(rs.getString("date_employed"));
                
                if(!rs.getString("position").equals(" ")){
                    position = rs.getString("position");
                    combo_position.setSelectedItem(position);
                }else{
                    combo_position.setSelectedItem("-None-");
                    position = " ";
                }
                    
                if(!rs.getString("gender").equals(" ")){
                    if (rs.getString("gender").equals("Male")){
                        r_male.setSelected(true);
                        r_female.setSelected(false);
                        gender = "Male";
                    }else if(rs.getString("gender").equals("Female")){
                        r_female.setSelected(true);
                        r_male.setSelected(false);
                        gender = "Female";
                    }
                }else{
                    gender=" ";
                    r_male.setSelected(false);
                    r_female.setSelected(false);
                }
                
                if(!rs.getString("status").equals(null)){
                    status = rs.getString("status");
                    combo_status.setSelectedItem(status);
                }else{
                    combo_status.setSelectedIndex(0);
                    status = "Active";
                }
                
                if(rs.getBytes("profile")!=null){
                    person_image = rs.getBytes("profile");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(person_image).getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_DEFAULT));
                    img.setIcon(imageIcon);
                    img.setText("");
                }else{
                    person_image =null;
                    img.setIcon(null);
                    img.setText("No Image");
                }
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }
    
    private boolean isExist(String id){
        try{
            String sql ="Select * from employee where id = "+id+" ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(!rs.next()){
                return false;
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem all_pdf;
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel btn_calculator;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_upload;
    private javax.swing.JMenuItem chgpass_emp;
    private javax.swing.JMenuItem chgpass_own;
    private javax.swing.JCheckBoxMenuItem cln_address;
    private javax.swing.JCheckBoxMenuItem cln_birthday;
    private javax.swing.JCheckBoxMenuItem cln_dateOfEmployed;
    private javax.swing.JCheckBoxMenuItem cln_email;
    private javax.swing.JCheckBoxMenuItem cln_gender;
    private javax.swing.JCheckBoxMenuItem cln_name;
    private javax.swing.JCheckBoxMenuItem cln_password;
    private javax.swing.JCheckBoxMenuItem cln_phone;
    private javax.swing.JCheckBoxMenuItem cln_position;
    private javax.swing.JCheckBoxMenuItem cln_salary;
    private javax.swing.JCheckBoxMenuItem cln_status;
    private javax.swing.JComboBox<String> combo_position;
    private javax.swing.JComboBox<String> combo_search;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JLabel img;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu lbl_login;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuItem menu_refresh;
    private javax.swing.JMenuItem menu_showall;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JMenuItem resetpass_emp;
    private javax.swing.JMenuItem resetpass_own;
    private javax.swing.JMenuItem selected_pdf;
    private javax.swing.JTextArea txt_address;
    private com.toedter.calendar.JDateChooser txt_birthday;
    private com.toedter.calendar.JDateChooser txt_dateEmployed;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    
    private String gender=" ";
    private String position=" ";
    private String status="Active";
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;
}
