import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if(i<10){
            System.out.print("0"+i+" ");
            }
            else{
                System.out.print(i+" ");
                
            }
        }
        
        System.out.println();

    }
}
}