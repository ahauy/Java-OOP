package bai13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LaoDongPhoThong ldpt = new LaoDongPhoThong();
        ldpt.nhap();
        System.out.println(ldpt.toString());
        Kisu ks = new Kisu();
        ks.nhap();
        System.out.println(ks.toString());
    }
    
}
