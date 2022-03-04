package view;


import Service.qltv_Service;
import connection_JDBC.quanLyThuVienDao;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.quanLyThuVien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class add_Form extends javax.swing.JFrame {

    /**
     * Creates new form QLy_Form
     */
    int selectedIndex;
    qltv_Service qlService;
    DefaultTableModel defaultTableModel;
    private List<quanLyThuVien> ql;
    private DefaultTableModel model;
    public add_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel)table.getModel();
        showTable();
        
    }
    private void setTableData(List<quanLyThuVien> ql){
        for (quanLyThuVien qltv : ql){
            defaultTableModel.addRow(new Object[]{qltv.getId(), qltv.getLoaiTL() , qltv.getTenNXB() , qltv.getSoBanPH() , qltv.getTenTG() , qltv.getSoTrang() ,qltv.getSoPH() , qltv.getThangPH(), qltv.getNgayPH()});
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

        maTaiLieu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loaiTaiLieu = new javax.swing.JLabel();
        tenNXB = new javax.swing.JLabel();
        soBPH = new javax.swing.JLabel();
        tenTG = new javax.swing.JLabel();
        soTrang = new javax.swing.JLabel();
        soPH = new javax.swing.JLabel();
        thangPH = new javax.swing.JLabel();
        ngayPH = new javax.swing.JLabel();
        maTL_B = new javax.swing.JTextField();
        loaiTL_B = new javax.swing.JComboBox<>();
        soBPH_B = new javax.swing.JTextField();
        tenTG_B = new javax.swing.JTextField();
        soPH_B = new javax.swing.JTextField();
        tenNXB_B = new javax.swing.JTextField();
        soTrang_B = new javax.swing.JTextField();
        ngayPH_B = new javax.swing.JComboBox<>();
        thangPH_B = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        timKiem = new javax.swing.JButton();
        them = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        maTaiLieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maTaiLieu.setForeground(new java.awt.Color(153, 0, 0));
        maTaiLieu.setText("Mã tài liệu:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("QUẢN LÝ THƯ VIỆN");

        loaiTaiLieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loaiTaiLieu.setForeground(new java.awt.Color(153, 0, 0));
        loaiTaiLieu.setText("Loại tài liệu:");

        tenNXB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tenNXB.setForeground(new java.awt.Color(153, 0, 0));
        tenNXB.setText("Tên NXB:");

        soBPH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soBPH.setForeground(new java.awt.Color(153, 0, 0));
        soBPH.setText("Số bản phát hành:");

        tenTG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tenTG.setForeground(new java.awt.Color(153, 0, 0));
        tenTG.setText("Tên tác giả:");

        soTrang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soTrang.setForeground(new java.awt.Color(153, 0, 0));
        soTrang.setText("Số trang:");

        soPH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soPH.setForeground(new java.awt.Color(153, 0, 0));
        soPH.setText("Số phát hành:");

        thangPH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thangPH.setForeground(new java.awt.Color(153, 0, 0));
        thangPH.setText("Tháng phát hành:");

        ngayPH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ngayPH.setForeground(new java.awt.Color(153, 0, 0));
        ngayPH.setText("Ngày phát hành:");

        maTL_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maTL_BActionPerformed(evt);
            }
        });

        loaiTL_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loaiTL_B.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sách", "Báo", "Tạp chí" }));
        loaiTL_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaiTL_BActionPerformed(evt);
            }
        });

        soBPH_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soBPH_BActionPerformed(evt);
            }
        });

        tenTG_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenTG_BActionPerformed(evt);
            }
        });

        soPH_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soPH_BActionPerformed(evt);
            }
        });

        tenNXB_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenNXB_BActionPerformed(evt);
            }
        });

        soTrang_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soTrang_BActionPerformed(evt);
            }
        });

        ngayPH_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ngayPH_B.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        ngayPH_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayPH_BActionPerformed(evt);
            }
        });

        thangPH_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thangPH_B.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        thangPH_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thangPH_BActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã tài liệu", "Loại tài liệu", "Tên NXB", "Số bản PH", "Tên tác giả", "Số trang", "Số phát hành", "Tháng PH", "Ngày PH"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        timKiem.setBackground(new java.awt.Color(255, 255, 204));
        timKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timKiem.setForeground(new java.awt.Color(204, 0, 51));
        timKiem.setText("Tìm kiếm");
        timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemActionPerformed(evt);
            }
        });

        them.setBackground(new java.awt.Color(255, 255, 204));
        them.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        them.setForeground(new java.awt.Color(204, 0, 51));
        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(255, 255, 204));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(204, 0, 51));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        sua.setBackground(new java.awt.Color(255, 255, 204));
        sua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sua.setForeground(new java.awt.Color(204, 0, 51));
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        xoa.setBackground(new java.awt.Color(255, 255, 204));
        xoa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xoa.setForeground(new java.awt.Color(204, 0, 51));
        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Form Tài Liệu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(soTrang)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(maTaiLieu)
                                .addComponent(loaiTaiLieu)
                                .addComponent(tenNXB)
                                .addComponent(soBPH)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(tenTG)))
                    .addComponent(soPH)
                    .addComponent(thangPH)
                    .addComponent(ngayPH))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngayPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soTrang_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loaiTL_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maTL_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soBPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenTG_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenNXB_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thangPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                        .addComponent(sua)
                        .addGap(44, 44, 44)
                        .addComponent(timKiem)
                        .addGap(50, 50, 50)
                        .addComponent(xoa)
                        .addGap(43, 43, 43)
                        .addComponent(refresh)
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maTL_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maTaiLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loaiTL_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loaiTaiLieu))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenNXB_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenNXB))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soBPH)
                            .addComponent(soBPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenTG_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenTG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soTrang_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soTrang))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soPH))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thangPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thangPH))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ngayPH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngayPH_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maTL_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maTL_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maTL_BActionPerformed

    private void soBPH_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soBPH_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soBPH_BActionPerformed

    private void tenTG_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenTG_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenTG_BActionPerformed

    private void soPH_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soPH_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soPH_BActionPerformed

    private void tenNXB_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenNXB_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenNXB_BActionPerformed

    private void soTrang_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soTrang_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soTrang_BActionPerformed

    private void loaiTL_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaiTL_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loaiTL_BActionPerformed

    private void ngayPH_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayPH_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayPH_BActionPerformed

    private void thangPH_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thangPH_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thangPH_BActionPerformed

    private void timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemActionPerformed
        // TODO add your handling code here:
        String maTaiLieu = maTL_B.getText();
        if(maTaiLieu.length()>0){
            ql = new quanLyThuVienDao().findTaiLieu(maTaiLieu);
            model.setRowCount(0);
            for(quanLyThuVien qly : ql){
            model.addRow(new Object[]{
                qly.getId(), qly.getLoaiTL(), qly.getTenNXB(), qly.getSoBanPH(), qly.getTenTG(), qly.getSoTrang(), qly.getSoPH(), qly.getThangPH(), qly.getNgayPH()
            });
        }
        }
    }//GEN-LAST:event_timKiemActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        quanLyThuVien ql = new quanLyThuVien();
        ql.setId(maTL_B.getText());
        ql.setLoaiTL(loaiTL_B.getSelectedItem().toString());
        ql.setTenNXB(tenNXB_B.getText());
        ql.setSoBanPH(Integer.parseInt(soBPH_B.getText()));
        ql.setTenTG(tenTG_B.getText());
        ql.setSoTrang(Integer.parseInt(soTrang_B.getText()));
        ql.setSoPH(Integer.parseInt(soPH_B.getText()));
        ql.setThangPH(Integer.parseInt(thangPH_B.getSelectedItem().toString()));
        ql.setNgayPH(Integer.parseInt(ngayPH_B.getSelectedItem().toString()));
        
        boolean isOk=true;
        if(isOk){
            new quanLyThuVienDao().add(ql);
            showTable();
            JOptionPane.showMessageDialog(this, "Bạn đã thêm tài liệu thành công!");
        }
        
    }//GEN-LAST:event_themActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        maTL_B.setText("");
        loaiTL_B.setSelectedIndex(0);
        tenNXB_B.setText("");
        soBPH_B.setText("");
        tenTG_B.setText("");
        soTrang_B.setText("");
        soPH_B.setText("");
        thangPH_B.setSelectedIndex(0);
        ngayPH_B.setSelectedIndex(0);
        showTable();
        
    }//GEN-LAST:event_refreshActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        selectedIndex = table.getSelectedRow();
        quanLyThuVien qltv = ql.get(selectedIndex);
        new quanLyThuVienDao().delete(qltv.getId());
        if(ql.isEmpty()){
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để sửa!");
        }
        else if(selectedIndex==-1){
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng để sửa!");
        }
        else{
            quanLyThuVien ql = new quanLyThuVien();
            ql.setId(maTL_B.getText());
            ql.setLoaiTL(loaiTL_B.getSelectedItem().toString());
            ql.setTenNXB(tenNXB_B.getText());
            ql.setSoBanPH(Integer.parseInt(soBPH_B.getText()));
            ql.setTenTG(tenTG_B.getText());
            ql.setSoTrang(Integer.parseInt(soTrang_B.getText()));
            ql.setSoPH(Integer.parseInt(soPH_B.getText()));
            ql.setThangPH(Integer.parseInt(thangPH_B.getSelectedItem().toString()));
            ql.setNgayPH(Integer.parseInt(ngayPH_B.getSelectedItem().toString()));

            boolean isOk=true;
            if(isOk){
                new quanLyThuVienDao().add(ql);
                showTable();
                JOptionPane.showMessageDialog(this, "Bạn đã sửa thông tin thành công!");
            }
        }
    }//GEN-LAST:event_suaActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        selectedIndex = table.getSelectedRow();
        quanLyThuVien qltv = ql.get(selectedIndex);
        JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?");
        new quanLyThuVienDao().delete(qltv.getId());
        showTable();
    }//GEN-LAST:event_xoaActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        selectedIndex = table.getSelectedRow();
        quanLyThuVien qltv = ql.get(selectedIndex);
        maTL_B.setText(qltv.getId());
        loaiTL_B.setSelectedItem(qltv.getLoaiTL());
        tenNXB_B.setText(qltv.getTenNXB());
        soBPH_B.setText(String.valueOf(qltv.getSoBanPH()));
        tenTG_B.setText(qltv.getTenTG());
        soTrang_B.setText(String.valueOf(qltv.getSoTrang()));
        soPH_B.setText(String.valueOf(qltv.getSoPH()));
        thangPH_B.setSelectedItem(qltv.getThangPH());
        ngayPH_B.setSelectedItem(qltv.getNgayPH());
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(add_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> loaiTL_B;
    private javax.swing.JLabel loaiTaiLieu;
    private javax.swing.JTextField maTL_B;
    private javax.swing.JLabel maTaiLieu;
    private javax.swing.JLabel ngayPH;
    private javax.swing.JComboBox<String> ngayPH_B;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel soBPH;
    private javax.swing.JTextField soBPH_B;
    private javax.swing.JLabel soPH;
    private javax.swing.JTextField soPH_B;
    private javax.swing.JLabel soTrang;
    private javax.swing.JTextField soTrang_B;
    private javax.swing.JButton sua;
    private javax.swing.JTable table;
    private javax.swing.JLabel tenNXB;
    private javax.swing.JTextField tenNXB_B;
    private javax.swing.JLabel tenTG;
    private javax.swing.JTextField tenTG_B;
    private javax.swing.JLabel thangPH;
    private javax.swing.JComboBox<String> thangPH_B;
    private javax.swing.JButton them;
    private javax.swing.JButton timKiem;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        ql =new quanLyThuVienDao().getAllUsers();
        model.setRowCount(0);
        for(quanLyThuVien qly : ql){
            model.addRow(new Object[]{
                qly.getId(), qly.getLoaiTL(), qly.getTenNXB(), qly.getSoBanPH(), qly.getTenTG(), qly.getSoTrang(), qly.getSoPH(), qly.getThangPH(), qly.getNgayPH()
            });
        }
    }
}
