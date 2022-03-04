/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection_JDBC;

import static connection_JDBC.JDBCConnection.JDBCConnection;
import models.quanLyThuVien;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author dell
 */
public class quanLyThuVienDao {
     public List<quanLyThuVien> getAllUsers() {
        List<quanLyThuVien> ltl = new ArrayList<quanLyThuVien>();

        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from quanLyThuVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                quanLyThuVien tl = new quanLyThuVien();
                tl.setId(rs.getString("MaTaiLieu"));
                tl.setLoaiTL(rs.getString("LoaiTaiLieu"));
                tl.setTenNXB(rs.getString("TenNXB"));
                tl.setSoBanPH(rs.getInt("SoBanPhatHanh"));
                tl.setTenTG(rs.getString("TenTacGia"));
                tl.setSoTrang(rs.getInt("SoTrang"));
                tl.setSoPH(rs.getInt("SoPhatHanh"));
                tl.setThangPH(rs.getInt("ThangPhatHanh"));
                tl.setNgayPH(rs.getInt("NgayPhatHanh"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public void add(quanLyThuVien tl){
     Connection connection = JDBCConnection.JDBCConnection();          
            String sql = "INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh) "
                    + "values (?,?,?,?,?,?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getId());
                preparedStatement.setString(2, tl.getLoaiTL());
                preparedStatement.setString(3, tl.getTenNXB());
                preparedStatement.setInt(4, tl.getSoBanPH());
                preparedStatement.setString(5, tl.getTenTG());
                preparedStatement.setInt(6, tl.getSoTrang());
                preparedStatement.setInt(7, tl.getSoPH());
                preparedStatement.setInt(8, tl.getThangPH());
                preparedStatement.setInt(9, tl.getNgayPH());
                
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*public int updateUser(LoaiTaiLieu tl){
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update LoaiTaiLieu set LoaiTaiLieu = ? , TenTaiLieu = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tl.getId());
            preparedStatement.setString(2, tl.getName());
            if(preparedStatement.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }*/
    public void delete(String id){
       Connection connection = JDBCConnection.JDBCConnection();
        String sql = "delete from QuanLyThuVien where MaTaiLieu = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            
            int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<quanLyThuVien> findTaiLieu(String ID){
        ArrayList<quanLyThuVien> ql = new ArrayList<quanLyThuVien>();
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "select * from QuanLyThuVien where MaTaiLieu like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+ID+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                quanLyThuVien tl = new quanLyThuVien();
                tl.setId(rs.getString("MaTaiLieu"));
                tl.setLoaiTL(rs.getString("LoaiTaiLieu"));
                tl.setTenNXB(rs.getString("TenNXB"));
                tl.setSoBanPH(rs.getInt("SoBanPhatHanh"));
                tl.setTenTG(rs.getString("TenTacGia"));
                tl.setSoTrang(rs.getInt("SoTrang"));
                tl.setSoPH(rs.getInt("SoPhatHanh"));
                tl.setThangPH(rs.getInt("ThangPhatHanh"));
                tl.setNgayPH(rs.getInt("NgayPhatHanh"));
                ql.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
    
}    
