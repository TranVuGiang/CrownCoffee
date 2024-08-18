/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EntityDAOImpl;

import com.Entity.HoaDon;
import com.Entity.HoaDonChiTiet;
import com.Utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class HoaDonChiTietDAO {

    String selectAll = "select * from HoaDonChiTiet where MaHD = ?";
    String insert = "insert into HoaDonChiTiet (MaHD, MaSP, SoLuong, Gia, Size, PTKhuyenMai) "
            + "values (?,?,?,?,?,?)";


    public Integer create(HoaDonChiTiet hd) {
        try {
            JDBCHelper.executeUpdate(insert,
                    hd.getMaHD(),   
                    hd.getMaSP(),
                    hd.getSoluong(),
                    hd.getGia(),
                    hd.getSize(),
                    hd.getPTkhuyenmai()
            );
            return hd.getMaHDCT();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<HoaDonChiTiet> getByHD(int MaHD) {
        return select(selectAll, MaHD);
    }

    private List<HoaDonChiTiet> select(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonChiTiet model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    private HoaDonChiTiet readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonChiTiet model = new HoaDonChiTiet();
//        model.setMaHD(rs.getInt("MaHD"));
        model.setMaSP(rs.getInt("MaSP"));
        model.setSoluong(rs.getInt("SoLuong"));
        model.setGia(rs.getFloat("Gia"));
        model.setSize(rs.getString("Size"));
        model.setPTkhuyenmai(rs.getFloat("PTKhuyenMai"));
        return model;
    }
}
