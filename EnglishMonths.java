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
public class EnglishMonths {

    public static void main(String args[]){

        int month=1+(int)(Math.random()*12);
        System.out.println(month);

       switch(month){
        case 1: System.out.println("January"+" "+ month);
            break;
        case 2: System.out.println("February"+" "+ month);
            break;
        case 3: System.out.println("March"+" "+ month);
            break;
        case 4: System.out.println("April"+ " "+month);
            break;
        case 5: System.out.println("May"+" "+ month);
            break;
        case 6: System.out.println("June"+ " "+month);
            break;
        case 7: System.out.println("July"+" "+ month);
            break;  
        case 8: System.out.println("August"+" "+ month);
            break;  
        case 9: System.out.println("September"+ " "+month);
            break;  
        case 10: System.out.println("October"+ " "+month);
            break;  
        case 11: System.out.println("November"+ " "+month);
            break;  
        case 12: System.out.println("December"+" "+ month);
            break;  
      
        }
    }
}
