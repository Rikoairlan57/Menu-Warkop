
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rikoairlan
 */
public class MENU extends javax.swing.JFrame {

   
    public MENU() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jtxtPayMethod = new javax.swing.JComboBox<>();
        jtxtChange = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbnExit = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jtxtTax = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtSubTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtn9 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtnLeleGoreng = new javax.swing.JButton();
        jbtnMieRebus = new javax.swing.JButton();
        jbtnTahuGoreng = new javax.swing.JButton();
        jbtnTheHangat = new javax.swing.JButton();
        jbtnTempeGoreng = new javax.swing.JButton();
        jbtnCoffee = new javax.swing.JButton();
        jbtnMieGoreng = new javax.swing.JButton();
        jbtnBuburAyam = new javax.swing.JButton();
        jbtnKuePancong = new javax.swing.JButton();
        jbtnEsJeruk = new javax.swing.JButton();
        jbtnOtakOtak = new javax.swing.JButton();
        jbtnEsTeh = new javax.swing.JButton();
        jbtnAyamGoreng = new javax.swing.JButton();
        jbtnRotiBakar = new javax.swing.JButton();
        jbtnPisangBakar = new javax.swing.JButton();
        jbtnNasiPutih = new javax.swing.JButton();
        jbtnPisangGoreng = new javax.swing.JButton();
        jbtnKacangIjo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtBarCode = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel7.add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 200, 50));

        jtxtPayMethod.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtPayMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "GoPay", "ATM" }));
        jPanel7.add(jtxtPayMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 50));

        jtxtChange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel7.add(jtxtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kembalian");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Pembayaran");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Uang Bayar");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 450, 190));

        jPanel8.setBackground(new java.awt.Color(51, 51, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 50));

        jbtnPay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPay.setText("Bayar");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 50));

        jbnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbnExit.setText("Exit");
        jbnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnExitActionPerformed(evt);
            }
        });
        jPanel8.add(jbnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, 50));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 50));

        jbtnRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRemove.setText("Hapus");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 160, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 390, 190));

        jPanel9.setBackground(new java.awt.Color(51, 51, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel9.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 200, 50));

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel9.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Total Bayar");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Pembelian Total");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Pajak");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel9.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 50));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1340, 210));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 74, 100));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 74, 100));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 74, 100));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 74, 100));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 74, 100));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 74, 100));

        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 74, 100));

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 74, 100));

        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 74, 100));

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 74, 100));

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 74, 100));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 74, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 430));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnLeleGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kentanggoreng.jpeg"))); // NOI18N
        jbtnLeleGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLeleGorengActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnLeleGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, 130));

        jbtnMieRebus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mierebus.jpeg"))); // NOI18N
        jbtnMieRebus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMieRebusActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnMieRebus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 130));

        jbtnTahuGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tahugoreng.jpeg"))); // NOI18N
        jbtnTahuGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTahuGorengActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTahuGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 120, 130));

        jbtnTheHangat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tehhangat.jpeg"))); // NOI18N
        jbtnTheHangat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTheHangatActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTheHangat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 120, 130));

        jbtnTempeGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tempegoreng.jpeg"))); // NOI18N
        jbtnTempeGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTempeGorengActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTempeGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 120, 130));

        jbtnCoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kopi.jpeg"))); // NOI18N
        jbtnCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCoffeeActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 120, 130));

        jbtnMieGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/miegoreng.jpeg"))); // NOI18N
        jbtnMieGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMieGorengActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnMieGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 130));

        jbtnBuburAyam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buburayam.jpeg"))); // NOI18N
        jbtnBuburAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuburAyamActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnBuburAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 130));

        jbtnKuePancong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kuepancong.jpeg"))); // NOI18N
        jbtnKuePancong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKuePancongActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnKuePancong, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 120, 130));

        jbtnEsJeruk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/esjeruk.jpeg"))); // NOI18N
        jbtnEsJeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEsJerukActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEsJeruk, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 120, 130));

        jbtnOtakOtak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/otakotak.jpeg"))); // NOI18N
        jbtnOtakOtak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOtakOtakActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnOtakOtak, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 120, 130));

        jbtnEsTeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/esteh.jpeg"))); // NOI18N
        jbtnEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEsTehActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 120, 130));

        jbtnAyamGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayamgoreng.jpeg"))); // NOI18N
        jbtnAyamGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAyamGorengActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnAyamGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 130));

        jbtnRotiBakar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rotibakar.jpeg"))); // NOI18N
        jbtnRotiBakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRotiBakarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRotiBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 120, 130));

        jbtnPisangBakar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pisangbakar.jpeg"))); // NOI18N
        jbtnPisangBakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPisangBakarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnPisangBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 120, 130));

        jbtnNasiPutih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nasiputih.jpeg"))); // NOI18N
        jbtnNasiPutih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNasiPutihActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnNasiPutih, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 120, 130));

        jbtnPisangGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pisanggoreng.jpeg"))); // NOI18N
        jbtnPisangGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPisangGorengActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnPisangGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 120, 130));

        jbtnKacangIjo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kacangijo.jpeg"))); // NOI18N
        jbtnKacangIjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKacangIjoActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnKacangIjo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 130));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 790, 430));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 660, 240, 130));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 480, 40, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Jumlah", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 280, 380));

        jtxtBarCode.setFont(new java.awt.Font("c39hrp24dhtt", 0, 50));
        jtxtBarCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBarCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 280, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
       //=============================Function=================================================
       
    public void ItemCost()
    {
        
        double jumlah = 0;
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
           
            jumlah =  jumlah + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
          
        }
        ;
        jtxtSubTotal.setText(Double.toString(jumlah));
        double cTotal1 = Double.parseDouble(jtxtSubTotal.getText());
        
        double cPajak = (cTotal1 *5)/100;
        String iTaxTotal = String.format("Rp. %.2f", cPajak);
        jtxtTax.setText(iTaxTotal);
        
        String iSubTotal = String.format("Rp. %.2f", cTotal1);
        jtxtSubTotal.setText(iSubTotal);
        
        String iTotal = String.format("Rp. %.2f", cPajak + cTotal1);
        jtxtTotal.setText(iTotal); 
        
        String BarCode = String.format("Total %.2f", cPajak + cTotal1);
        jtxtBarCode.setText(BarCode);
       
    }
//==========================================Function================================================
     public void Change()
    {        
        double jumlah = 0;
        double pajak =5;        
        double cash = Double.parseDouble(jtxtDisplay.getText());
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
            jumlah =  jumlah + Double.parseDouble(jTable1.getValueAt(i, 2).toString());            
        }
        double cPajak = (jumlah * pajak)/100;
        double cChange = (cash - (jumlah + cPajak));      
        String ChangeGiven = String.format("Rp. %.2f", cChange);
        jtxtChange.setText(ChangeGiven);     
  
}
    
//=========================================================================== 
    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String Enternumber = jtxtDisplay.getText();   
        
               
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn1.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn1.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
         String Enternumber = jtxtDisplay.getText();   
        
               
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn2.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn2.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
         String Enternumber = jtxtDisplay.getText();  
              
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn4.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn4.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText();           
               
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn5.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn5.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
         String Enternumber = jtxtDisplay.getText();   
        
               
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn6.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn6.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
         String Enternumber = jtxtDisplay.getText();   
        
               
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn7.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn7.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
         String Enternumber = jtxtDisplay.getText();   
        
               
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn8.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn8.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String Enternumber = jtxtDisplay.getText();   
        
               
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn9.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn9.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
         String Enternumber = jtxtDisplay.getText();   
        
               
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn0.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn0.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
         if(! jtxtDisplay.getText().contains("."))
        {
        jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String Enternumber = jtxtDisplay.getText();   
        
               
        if ( Enternumber == "")
        {
            jtxtDisplay.setText(jbtn3.getText());
        }
        else
        {
            Enternumber = jtxtDisplay.getText() + jbtn3.getText();
             jtxtDisplay.setText(Enternumber);   
                }
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
         jtxtDisplay.setText("");
         jtxtChange.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed
private JFrame frame;
    private void jbnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Point of Sale",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbnExitActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
        if (jtxtPayMethod.getSelectedItem().equals("Cash"))
            {
                Change();               
            }
            else
            {
                jtxtChange.setText("");
                jtxtDisplay.setText("");
            }
        
        
    }//GEN-LAST:event_jbtnPayActionPerformed
// Reset Button //
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        RecordTable.setRowCount(0);
         jtxtChange.setText("");
                jtxtDisplay.setText("");
                jtxtTax.setText("");
                jtxtSubTotal.setText("");
                jtxtTotal.setText("");
                jtxtBarCode.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed
// Menu Button//
    private void jbtnBuburAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuburAyamActionPerformed
  
        double PriceOfItem = 10000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Bubur Ayam","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnBuburAyamActionPerformed

    private void jbtnKacangIjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKacangIjoActionPerformed
        double PriceOfItem = 7000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Bubur Kacang Ijo","1",PriceOfItem});
        
        ItemCost();
    }//GEN-LAST:event_jbtnKacangIjoActionPerformed

    private void jbtnKuePancongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKuePancongActionPerformed
        double PriceOfItem = 10000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Kue Pancong","1",PriceOfItem});
        
        ItemCost();
    }//GEN-LAST:event_jbtnKuePancongActionPerformed

    private void jbtnTahuGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTahuGorengActionPerformed
       double PriceOfItem = 2500;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Tahu Goreng","1",PriceOfItem});
        
        ItemCost();
    }//GEN-LAST:event_jbtnTahuGorengActionPerformed

    private void jbtnCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCoffeeActionPerformed
        double PriceOfItem = 5000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Coffee","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnCoffeeActionPerformed

    private void jbtnEsJerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEsJerukActionPerformed
        double PriceOfItem = 6000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Es Jeruk","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnEsJerukActionPerformed
// Remove button //
    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();          
             
        int  RemoveItem =  jTable1.getSelectedRow();                      
        if (RemoveItem >= 0)
        {
        model.removeRow(RemoveItem);  
        }   
        
        ItemCost();
        
        if (jtxtPayMethod.getSelectedItem().equals("Cash"))
            {
                Change();               
            }
        
        String Enternumber = jtxtDisplay.getText();
                       
        if (Enternumber == "" && jtxtPayMethod.getSelectedItem().equals("Cash"))
        {      
            
                jtxtChange.setText("");
                jtxtDisplay.setText("");
            }
    }//GEN-LAST:event_jbtnRemoveActionPerformed

    private void jbtnMieGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMieGorengActionPerformed
        double PriceOfItem = 8000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Mie Goreng","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnMieGorengActionPerformed

    private void jbtnMieRebusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMieRebusActionPerformed
      double PriceOfItem = 8000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Mie Kuah","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnMieRebusActionPerformed

    private void jbtnRotiBakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRotiBakarActionPerformed
        double PriceOfItem = 10000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Roti Bakar","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnRotiBakarActionPerformed

    private void jbtnTempeGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTempeGorengActionPerformed
         double PriceOfItem = 2500;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Tempe Goreng","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnTempeGorengActionPerformed

    private void jbtnOtakOtakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOtakOtakActionPerformed
       double PriceOfItem = 8000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Otak-Otak","1",PriceOfItem});        
        ItemCost(); 
    }//GEN-LAST:event_jbtnOtakOtakActionPerformed

    private void jbtnEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEsTehActionPerformed
        double PriceOfItem = 5000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Es Teh","1",PriceOfItem});        
        ItemCost(); 
    }//GEN-LAST:event_jbtnEsTehActionPerformed

    private void jbtnAyamGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAyamGorengActionPerformed
        double PriceOfItem = 15000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Ayam Goreng","1",PriceOfItem});        
        ItemCost(); 
    }//GEN-LAST:event_jbtnAyamGorengActionPerformed

    private void jbtnLeleGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLeleGorengActionPerformed
         double PriceOfItem = 8000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Kentang Goreng","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnLeleGorengActionPerformed

    private void jbtnPisangBakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPisangBakarActionPerformed
        double PriceOfItem = 10000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Pisang Bakar","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnPisangBakarActionPerformed

    private void jbtnNasiPutihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNasiPutihActionPerformed
        double PriceOfItem = 5000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Nasi Putih","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnNasiPutihActionPerformed

    private void jbtnPisangGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPisangGorengActionPerformed
        double PriceOfItem = 2500;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Pisang Goreng","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnPisangGorengActionPerformed

    private void jbtnTheHangatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTheHangatActionPerformed
        double PriceOfItem = 4000;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Teh Hangat","1",PriceOfItem});        
        ItemCost();
    }//GEN-LAST:event_jbtnTheHangatActionPerformed
// Print Button //
    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
         MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        
        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

private void jtxtBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBarCodeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jtxtBarCodeActionPerformed

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbnExit;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAyamGoreng;
    private javax.swing.JButton jbtnBuburAyam;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCoffee;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEsJeruk;
    private javax.swing.JButton jbtnEsTeh;
    private javax.swing.JButton jbtnKacangIjo;
    private javax.swing.JButton jbtnKuePancong;
    private javax.swing.JButton jbtnLeleGoreng;
    private javax.swing.JButton jbtnMieGoreng;
    private javax.swing.JButton jbtnMieRebus;
    private javax.swing.JButton jbtnNasiPutih;
    private javax.swing.JButton jbtnOtakOtak;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPisangBakar;
    private javax.swing.JButton jbtnPisangGoreng;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnRotiBakar;
    private javax.swing.JButton jbtnTahuGoreng;
    private javax.swing.JButton jbtnTempeGoreng;
    private javax.swing.JButton jbtnTheHangat;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JComboBox<String> jtxtPayMethod;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
