/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Entity;

/**
 *
 * @author Asus
 */
public class SanPham {
    private int maSP;
    private String tenSP;
    private boolean trangthai;
    private int MaNV;
    private String MoTa;
    private String Hinh;
    private String LoaiSP;
    private float Gia;

    public SanPham() {
    }

    public SanPham(String tenSP, boolean trangthai, int MaNV, String MoTa, String Hinh, String LoaiSP, float Gian) {
        this.tenSP = tenSP;
        this.trangthai = trangthai;
        this.MaNV = MaNV;
        this.MoTa = MoTa;
        this.Hinh = Hinh;
        this.LoaiSP = LoaiSP;
        this.Gia = Gia;

    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(String LoaiSP) {
        this.LoaiSP = LoaiSP;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }


    

   
    
}
