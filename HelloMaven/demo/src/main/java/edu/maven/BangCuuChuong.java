package edu.maven;

import java.util.Arrays;
import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        // Bảng cửu chương
        // int a = 7, b=1; 
        // while (b <= 10) {
        //     int c = a*b;
        //     System.out.printf("%d x %d = %d \n",a,b,c);
        //     b++;
            
        // }
        int[] mang = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.printf("Nhập mang[%d]", i);
            mang[i] = scanner.nextInt();
            i++;
        } while(i <10);
        System.out.println("mang: " + Arrays.toString(mang));

        for (int e = 0; e < mang.length-1; e++) {
            for (int j = e+1; j < mang.length; j++) {
                if (mang[e]< mang[j]) {
                    int temp = mang[j];
                    mang[j]= mang[e];
                    mang[e] = temp;
                    
                }
            }
            
        }
        System.out.println("mảng sau khi sắp xếp"+ Arrays.toString(mang));
    }
}
