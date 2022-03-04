/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import connection_JDBC.quanLyThuVienDao;
import java.util.List;
import models.quanLyThuVien;

/**
 *
 * @author dell
 */
public class qltv_Service {
    private quanLyThuVienDao qltv;

    public qltv_Service() {
        qltv = new quanLyThuVienDao();
        
    }
    
    public List<quanLyThuVien> getAllUsers(){
        return qltv.getAllUsers();
    }
    
    public void add(quanLyThuVien tl){
        qltv.add(tl);
    }
    
    public void delete(String id){
        qltv.delete(id);
    }
    /*public users getUserByID(int id){
       return userLink.getUserByID(id);
    }*/
}
