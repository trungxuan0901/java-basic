package edu.maven;

import java.util.Arrays;
import java.util.Scanner;

public class Mangso {
    public static void main(String[] args) {
        int mang[]= new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
        System.out.printf("nhập vào phần tử thứ  %d:", (i+1));
            mang[i] = s.nextInt();
        }
        System.out.println("Phần tử của mảng: "+ Arrays.toString(mang));
        
        Arrays.sort(mang);

        System.out.println("Phần tử của mảng sau khi sắp xếp: " + Arrays.toString(mang));

        int min = mang[0];
        for (int i = 1; i < mang.length; i++) {
            min = Math.min(min, mang[i]);
            
        }
        System.out.println("Phần tử nhỏ nhất: "+ min);
        
        int sum = 0;
        int count = 0;
        for (int i = 0; i < mang.length; i++) {
            if(mang[i]% 3 == 0){
                sum += mang[i];
                count ++;
            }
        }
        float avg = (float)sum/count;
            System.out.println("Trung bình cộng chia hết cho 3: " + avg);
    }   
}
