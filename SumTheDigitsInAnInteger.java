/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexcercises;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class SumTheDigitsInAnInteger {

   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   
        System.out.print(" Enter a number between 0 and 1000 : ");

        int num = input.nextInt();

        int ones_num = num % 10;

        int tens_num = (num / 10) % 10 ;

        int houndreds_num = (num / 100) % 10;

        int answer = ones_num + tens_num + houndreds_num;

        System.out.print(" The sum of the digit is " + answer);

}
}