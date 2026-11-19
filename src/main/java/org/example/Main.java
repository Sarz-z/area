package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius ");
        int r=sc.nextInt();

        double areaa=3.147*(r*r);

        System.out.println("AREA OF THE CIRCLE: "+areaa);
        sc.close();
    }
}