import java.util.Scanner;
public class MultiplesOfX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        System.out.println("enter the end range");
        int y=sc.nextInt();
        for(int i=1;i<=10;i++){
            
            System.out.println(x*i);
        }
    }
    
}
