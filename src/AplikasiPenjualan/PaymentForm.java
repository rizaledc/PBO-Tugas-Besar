/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AplikasiPenjualan;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class PaymentForm extends javax.swing.JInternalFrame {

    public PaymentForm() {
        initComponents();
        saveButton.setEnabled(false);
        //menjadikan button jadi satu
        ButtonGroup tipeGroup = new ButtonGroup();
        tipeGroup.add(t36RadioButton);
        tipeGroup.add(t45RadioButton);
        tipeGroup.add(t54RadioButton);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        priceLandTxt = new javax.swing.JTextField();
        areaComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t36RadioButton = new javax.swing.JRadioButton();
        t45RadioButton = new javax.swing.JRadioButton();
        t54RadioButton = new javax.swing.JRadioButton();
        buildingPriceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        largeLaneTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        availableLaneTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalPriceTxt = new javax.swing.JTextField();
        DPTxt = new javax.swing.JTextField();
        instalmentTxt = new javax.swing.JTextField();
        PPnTXT = new javax.swing.JTextField();
        instalmentMonthTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agreementCb = new javax.swing.JCheckBox();
        processButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        MenuUtama = new javax.swing.JButton();

        setTitle("FORM PENJUALAN");

        jLabel1.setText("Nama Pemesan");

        jLabel2.setText("Harga Tanah");

        jLabel3.setText("Area");

        priceLandTxt.setEditable(false);
        priceLandTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceLandTxtActionPerformed(evt);
            }
        });

        areaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- PILIH ---", "TABANAN", "BANYUMAS", "KUNINGAN" }));
        areaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AplikasiPenjualan/Rumah1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 145));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 145));

        jLabel4.setText("Harga Bangunan");

        jLabel6.setText("Tipe Bangunan");

        radioButton.add(t36RadioButton);
        t36RadioButton.setText("Tipe 36");
        t36RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t36RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t45RadioButton);
        t45RadioButton.setText("Tipe 45");
        t45RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t45RadioButtonActionPerformed(evt);
            }
        });

        radioButton.add(t54RadioButton);
        t54RadioButton.setText("Tipe 54");
        t54RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t54RadioButtonActionPerformed(evt);
            }
        });

        buildingPriceTxt.setEditable(false);
        buildingPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("Luas Tanah Asli");

        largeLaneTxt.setEditable(false);
        largeLaneTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("Luas Tanah Tersedia");

        availableLaneTxt.setEditable(false);
        availableLaneTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("Harga");

        jLabel10.setText("DP");

        jLabel11.setText("Lama Cicilan");

        jLabel12.setText("PPn (10%)");

        jLabel13.setText("Cicilan/Bulan");

        totalPriceTxt.setEditable(false);
        totalPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        DPTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        DPTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPTxtActionPerformed(evt);
            }
        });

        instalmentTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        PPnTXT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        instalmentMonthTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        instalmentMonthTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instalmentMonthTxtActionPerformed(evt);
            }
        });

        jLabel14.setText("Bulan");

        agreementCb.setText("Setuju");
        agreementCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementCbActionPerformed(evt);
            }
        });

        processButton.setText("PROSES");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SIMPAN");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("HAPUS");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        MenuUtama.setText("Menu Utama");
        MenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUtamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(orderNameTxt)
                            .addComponent(priceLandTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(areaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(MenuUtama)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(t36RadioButton)
                                .addComponent(t45RadioButton)
                                .addComponent(t54RadioButton)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buildingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(largeLaneTxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(PPnTXT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instalmentTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DPTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPriceTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(availableLaneTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(agreementCb)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(buildingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t36RadioButton)
                        .addComponent(largeLaneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t54RadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t45RadioButton)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(availableLaneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totalPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(DPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(instalmentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(PPnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agreementCb))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processButton)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(MenuUtama))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceLandTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceLandTxtActionPerformed
    }//GEN-LAST:event_priceLandTxtActionPerformed

    private void t54RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t54RadioButtonActionPerformed
       if(areaComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulU!");
            radioButton.clearSelection();
        } else{
            largeLaneTxt.setText("140");
            availableLaneTxt.setText("86"); //ukuran tanah - luas bangunan ==> 90 - 36
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice= Long.parseLong(buildingPriceTxt.getText()),
                    availableLand= Long.parseLong(availableLaneTxt.getText()),
                    totalPrice; // dihitung dari luas tanah tersedia  x harga tanah + harga bangunan
            totalPrice = (availableLand * landPrice)+buildingPrice;
            totalPriceTxt.setText(""+totalPrice);
            
            DPTxt.setText("");
            PPnTXT.setText("");
            instalmentMonthTxt.setText("");
            instalmentTxt.setText("");
        }

    }//GEN-LAST:event_t54RadioButtonActionPerformed

    private void t36RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t36RadioButtonActionPerformed
        if(areaComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulU!");
            radioButton.clearSelection();
        } else{
            largeLaneTxt.setText("90");
            availableLaneTxt.setText("54"); //ukuran tanah - luas bangunan ==> 90 - 36
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice= Long.parseLong(buildingPriceTxt.getText()),
                    availableLand= Long.parseLong(availableLaneTxt.getText()),
                    totalPrice; // dihitung dari luas tanah tersedia  x harga tanah + harga bangunan
            totalPrice = (availableLand * landPrice)+buildingPrice;
            totalPriceTxt.setText(""+totalPrice);
            
            DPTxt.setText("");
            instalmentTxt.setText("");
            PPnTXT.setText("");
            instalmentMonthTxt.setText("");
        }
    }//GEN-LAST:event_t36RadioButtonActionPerformed

    private void DPTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPTxtActionPerformed
    }//GEN-LAST:event_DPTxtActionPerformed

    private void agreementCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementCbActionPerformed
        if(orderNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama pemesan belum di isi!");
            agreementCb.setSelected(false);
            saveButton.setEnabled(false);
        } else if (PPnTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tekan tombol 'PROSES' terlebih dahulu!");
            agreementCb.setSelected(false);
            saveButton.setEnabled(false);
        } else if (agreementCb.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Pesanan telah disetujui");
            saveButton.setEnabled(true);
        } else{
            JOptionPane.showMessageDialog(null, "Pesanan belum disetujui");
            saveButton.setEnabled(false);
        }
    }//GEN-LAST:event_agreementCbActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
        // Ambil nilai input dari form
        String name = orderNameTxt.getText();
        String area = (String) areaComboBox.getSelectedItem();
        float luas = (float) Double.parseDouble(largeLaneTxt.getText());
        String harga = totalPriceTxt.getText();
        String lamaCicilan = instalmentTxt.getText();
        String bayarBulanan = instalmentMonthTxt.getText();

        // Cek pilihan tipe rumah dari radio button
        String tipe;
        if (t36RadioButton.isSelected()) {
            tipe = "Tipe 36";
        } else if (t45RadioButton.isSelected()) {
            tipe = "Tipe 45";
        } else if (t54RadioButton.isSelected()) {
            tipe = "Tipe 54";
        } else {
            JOptionPane.showMessageDialog(null, "Silakan pilih tipe rumah!");
            return; // Stop proses jika belum pilih tipe
        }

        // Buat koneksi
        java.sql.Connection conn = ConnectionDb.connectDatabase();
        String sql = "INSERT INTO rumah (name, area, tipe, luas, harga_rumah, lama_cicilan, bayar_bulan) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, area);
        pst.setString(3, tipe);
        pst.setDouble(4, luas);
        pst.setString(5, harga);
        pst.setString(6, lamaCicilan);
        pst.setString(7, bayarBulanan);

        // Eksekusi query
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
           
        // reset fomnya
        orderNameTxt.setText("");
        priceLandTxt.setText("");
        buildingPriceTxt.setText("");
        largeLaneTxt.setText("");
        DPTxt.setText("");
        instalmentMonthTxt.setText("");
        instalmentTxt.setText("");
        PPnTXT.setText("");
        availableLaneTxt.setText("");
        totalPriceTxt.setText("");
        areaComboBox.setSelectedIndex(0);
        radioButton.clearSelection();
        agreementCb.setSelected(false);
        
    } catch (HeadlessException | NumberFormatException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan: " + e.getMessage());
    }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        if (totalPriceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilihan belum lengkap!");
        } else if(DPTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "DP harus di isi");
        } else if(instalmentTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi jumlah cicilan yang diinginkan");          
            JOptionPane.showMessageDialog(null, "Isi jumlah cicilan yang diinginkan");
        } else{
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice= Long.parseLong(buildingPriceTxt.getText()),
                    availableLand= Long.parseLong(availableLaneTxt.getText()),
                    instalmentAmount = Long.parseLong(instalmentTxt.getText()),
                    totalPrice, ppn, instalmentPerMonth;
            totalPrice = (availableLand * landPrice)+ buildingPrice;
            ppn = totalPrice* 10 / 100;
            instalmentPerMonth = (totalPrice + ppn)/ instalmentAmount;
            PPnTXT.setText(""+ppn);
            instalmentMonthTxt.setText(""+instalmentPerMonth);
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        orderNameTxt.setText("");
        priceLandTxt.setText("");
        buildingPriceTxt.setText("");
        largeLaneTxt.setText("");
        DPTxt.setText("");
        instalmentMonthTxt.setText("");
        instalmentTxt.setText("");
        PPnTXT.setText("");
        availableLaneTxt.setText("");
        totalPriceTxt.setText("");
        areaComboBox.setSelectedIndex(0);
        radioButton.clearSelection();
        agreementCb.setSelected(false);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void areaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboBoxActionPerformed
        switch(areaComboBox.getSelectedIndex()){
            case 0 -> {
                priceLandTxt.setText("");
                buildingPriceTxt.setText("");
                radioButton.clearSelection();
                largeLaneTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentMonthTxt.setText("");
                instalmentTxt.setText("");
                PPnTXT.setText("");
                availableLaneTxt.setText("");
                agreementCb.setSelected(false);
                break;
            }
            case 1 -> {
                priceLandTxt.setText("800000");
                buildingPriceTxt.setText("110000000");
                radioButton.clearSelection();
                largeLaneTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentMonthTxt.setText("");
                instalmentTxt.setText("");
                PPnTXT.setText("");
                availableLaneTxt.setText("");
                agreementCb.setSelected(false);
                break;
            }
            case 2 -> {
                priceLandTxt.setText("900000");
                buildingPriceTxt.setText("250000000");
                radioButton.clearSelection();
                largeLaneTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentMonthTxt.setText("");
                instalmentTxt.setText("");
                PPnTXT.setText("");
                availableLaneTxt.setText("");
                agreementCb.setSelected(false);
                break;
            }
            default -> {
                priceLandTxt.setText("700000");
                buildingPriceTxt.setText("110000");
                radioButton.clearSelection();
                largeLaneTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentMonthTxt.setText("");
                instalmentTxt.setText("");
                PPnTXT.setText("");
                availableLaneTxt.setText("");
                agreementCb.setSelected(false);
                break;
            }
        }
    }//GEN-LAST:event_areaComboBoxActionPerformed

    private void t45RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t45RadioButtonActionPerformed
        if(areaComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulU!");
            radioButton.clearSelection();
        } else{
            largeLaneTxt.setText("120");
            availableLaneTxt.setText("75"); //ukuran tanah - luas bangunan ==> 90 - 36
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice= Long.parseLong(buildingPriceTxt.getText()),
                    availableLand= Long.parseLong(availableLaneTxt.getText()),
                    totalPrice; // dihitung dari luas tanah tersedia  x harga tanah + harga bangunan
            totalPrice = (availableLand * landPrice)+buildingPrice;
            totalPriceTxt.setText(""+totalPrice);
            
            instalmentTxt.setText("");
            DPTxt.setText("");
            PPnTXT.setText("");
            instalmentMonthTxt.setText("");
        }
    }//GEN-LAST:event_t45RadioButtonActionPerformed

    private void MenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUtamaActionPerformed
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
    }//GEN-LAST:event_MenuUtamaActionPerformed

    private void instalmentMonthTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instalmentMonthTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instalmentMonthTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DPTxt;
    private javax.swing.JButton MenuUtama;
    private javax.swing.JTextField PPnTXT;
    private javax.swing.JCheckBox agreementCb;
    private javax.swing.JComboBox<String> areaComboBox;
    private javax.swing.JTextField availableLaneTxt;
    private javax.swing.JTextField buildingPriceTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField instalmentMonthTxt;
    private javax.swing.JTextField instalmentTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField largeLaneTxt;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JTextField priceLandTxt;
    private javax.swing.JButton processButton;
    private javax.swing.ButtonGroup radioButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JRadioButton t36RadioButton;
    private javax.swing.JRadioButton t45RadioButton;
    private javax.swing.JRadioButton t54RadioButton;
    private javax.swing.JTextField totalPriceTxt;
    // End of variables declaration//GEN-END:variables
}
