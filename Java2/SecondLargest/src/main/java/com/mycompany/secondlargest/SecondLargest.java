/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondlargest;

import java.util.Scanner;

/**
 *
 * @author SUBASHINI V
 */
public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<n-1;i++){

        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            }
        }
    }
       for(int i=0;i<n;i++){
           System.out.print(arr[1]+" ");
          break;
       }
       
    }
}
//same as bubble sort

    
