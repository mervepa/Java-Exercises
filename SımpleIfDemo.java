/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexcercises;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class SımpleIfDemo {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.print("Enter an integer:");
       int number=input.nextInt();
       
       if(number % 5 == 0)
          System.out.print("Hi five");
     
        if(number % 2 == 0)
          System.out.print("Hi even");
  }
}
