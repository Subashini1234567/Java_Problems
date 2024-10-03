import java.util.Scanner;
public class Armstrong {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int result=0;
        int num=0;
        while(org!=0){
            org/=10;
            num++;
        }
        org=n;
        while(org!=0){
            int rem=org%10;
            result+=Math.pow(rem,num);
        
            org/=10;
        }
        if(result==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
     }
    
}
