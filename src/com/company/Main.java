package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println ("***Tinh tien taxi");
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Nhap so km da di: ");
        int a = sc.nextInt();
        if(a<=1) { System.out.print("+ Thanh tien: " +(a*15000) );}
        else if(a>1 && a<=5){ System.out.print("+ Thanh tien: "+(a*13500));}
        else if(a>5 && a<120){ System.out.print("+ Thanh tien: "+(a*11000)) ;}
        else if(a>120){ System.out.print("+ Thanh tien: "+(a*11000*9/10)  );}
    }
}
