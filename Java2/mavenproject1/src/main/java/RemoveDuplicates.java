import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            boolean nonrepeat=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    nonrepeat=true;
                    break;
                }
            }
            if(nonrepeat)
                continue;
            for(int k=0;k<n;k++){
                if(arr[i]==arr[k]){
                    count++;
                }
            }
            
            if(count==1||count==2)
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
