/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Library {
    
   public int getInt(String promt, int min, int max){
     Scanner sc =new Scanner(System.in);
      // check whether min > max. If it happens, swapping
     if(max < min){
        int temp = min;
        min = max;
        max =temp;
     }
     
     int a = -1;
     
     while(true){
         System.out.println(promt+" : " );
         try {
             String s = sc.nextLine();
             a = Integer.parseInt(s);
             if(a >= min && a <= max) break;
             else throw  new IllegalArgumentException();
         } catch (Exception e) {
             System.out.println("Please enter a number between "+min+" and "+ max);
         }
     }
     return a;     
   }
   
   public int[] createArray(int size_Arr){
       int arr[] = new int[size_Arr];
       Random rd = new Random();
       
       for(int i = 0; i < size_Arr; i++){
           arr[i] = rd.nextInt(100);
       }
       
       return arr;
   }
   
   public void displayArr(int arr[]){
      StringBuilder s = new StringBuilder();
      
      for(int i = 0; i < arr.length; i++){
         s.append(arr[i]);
         if(i != arr.length-1) s.append(", ");
      }
       System.out.println(s.toString());
   }
   
   
   public String getString(String promt){
      Scanner sc = new Scanner(System.in);
      String a;
      while(true){
          System.out.println(promt);
          a = sc.nextLine();
          if(a.trim().length() != 0){
             break;
          }else{
              System.out.println("Please enter any letter. Not Empty");
          }
      }
      return a;
   }
   
}
