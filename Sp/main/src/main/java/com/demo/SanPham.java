package com.demo;

import java.util.Scanner;

/**
 * SanPham
 */
public class SanPham {
    private String tenSanPham;
    private double giaSp;
    private double giamGia;

    public String getTenSP() {
        return tenSanPham;

    }

    public void setTenSP(String tenSanPham) {
        this.tenSanPham = tenSanPham;

    }

    public double getGiaSp() {
        return giaSp;

    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;

    }

    public SanPham(String tenSanPham, double giaSp, double giamGia) {
        this.tenSanPham = tenSanPham;
        this.giaSp = giaSp;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSanPham, double giaSp) {
        this.tenSanPham = tenSanPham;
        this.giaSp = giaSp;
        this.giamGia = 0;
    }

    private double getThueNhapKhau() {
        return giaSp * 0.1;
    }

    public void xuat() {
        System.out.printf(" Tên sp: %s | Giá sp: %f |Giảm giá: %f|Thuế: %f ", tenSanPham, giaSp, giamGia,
                getThueNhapKhau());

    }

    public void nhap() {

        Scanner s = new Scanner(System.in);
        System.out.print("nhập tên sp: ");
        tenSanPham = s.nextLine();

        System.out.print("nhập giá sp: ");
        giaSp = s.nextDouble();

        System.out.print("nhập giảm giá: ");
        giamGia = s.nextDouble();
    }

}