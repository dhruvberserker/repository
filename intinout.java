// Java code to take 3 integer as an input and printing out the same integers

import java.io.*;
import java.util.*;

public class intinout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a= sc.nextInt();
        System.out.print("Enter value of b:");
        int b= sc.nextInt();
        System.out.print("Enter value of c:");
        int c= sc.nextInt();

        System.out.println("a is " +a);
        System.out.println("b is " +b);
        System.out.println("c is " +c);
    }
}
