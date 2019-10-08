
package boletin1_5;

import java.util.Scanner;


public class Boletin1_5 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("teclea las millas:");
    float millas = sc.nextFloat();
    float metros = millas*1852;
    System.out.println(millas+" millas son "+metros+" metros");
        
        
    }
    
}
