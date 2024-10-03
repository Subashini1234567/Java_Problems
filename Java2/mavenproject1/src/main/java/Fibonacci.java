
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SUBASHINI V
 */
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        for(int i=0;i<=n;i++){
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;
            
        }
    }
    
}
