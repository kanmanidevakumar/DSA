import java.util.Scanner;
public class P13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if(count<10){
            System.out.print("0"+count+" ");
            count++;}
            else{
                System.out.print(count+" ");
                count++;
            }
        }
        
        System.out.println();

    }
}
}