/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smallestpalindrome;

import java.util.Scanner;

/**
 *
 * @author SUBASHINI V
 */
public class SmallestPalindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           
       }
       int maxLength=0;
       int LongestPalin=-1;
       for(int i=0;i<n;i++){
           int num=arr[i];
           int org=num;
           int rev=0;
           while(num!=0){
               int digit=num%10;
               rev=rev*10+digit;
               num/=10;
           }
           if(org==rev){
               int count=0;
               num=org;
               while(num!=0){
                   num/=10;
                   count++;
               }
               if(count<maxLength||LongestPalin==-1){
                   maxLength=count;
                   LongestPalin=org;
                   
               }
           }
       }
       System.out.print(LongestPalin);
    }
}
