/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;
import java.util.Scanner;

public class GradingMultipleChoice
{
     public static void main(String[] args) {

        char[][] array = new char[8][10];
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
        int[] score = {0,0,0,0,0,0,0,0};

        for(int i = 0;i<8;i++){
            System.out.print("Student "+i+"   ");
            for(int j = 0;j<10;j++){

                array[i][j]= (char)(Math.random()*5+65);
                System.out.print(array[i][j] + " ");

                if(array[i][j] == keys[j])
                    score[i]+=10;
            }
            System.out.println();
        }

        for(int i : score){
            System.out.println(i);
        }
    }

}