package edu.holy;

import java.util.Scanner;

public class SinhVien {
    String hoTen;
    double diemTB;
    // Constructor- Hàm tạo
    // public SinhVien(){
    // hoTen ="Xuan";
    // diemTB = 0;
    // }
    // public SinhVien (String hoTen, double diemTB){
    // this.hoTen = hoTen;
    // this.diemTB = diemTB;
    // }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Vui lòng nhập điểm: ");
        diemTB = scanner.nextDouble();

    }

    public void xuat() {
        System.out.println("\n---------------");
        System.out.printf("Họ tên: %s ----- Điểm TB: %f----- Học lực: %s", hoTen, diemTB, xepLoai());

    }

    public String xepLoai() {
        if (diemTB >= 9)
            return "Xuất sắc";
        else
            return "Giỏi";

    }

}
