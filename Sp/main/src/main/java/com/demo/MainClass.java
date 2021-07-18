package com.demo;

public class MainClass {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("sp1", 400, 200);
        SanPham sp2 = new SanPham("sp2", 500);

        // sp1.nhap();

        sp1.xuat();
        String ten = sp1.getTenSP();
        System.out.println("\nTen Sp: " + ten);
        sp1.setTenSP("New sp");
        sp1.xuat();

        System.out.println("\n--------------");

        // sp2.nhap();
        sp2.xuat();
    }
}
