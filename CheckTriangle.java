import java.util.Scanner;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the angle one");
        int x=sc.nextInt();
        System.out.println("enter the angle two");
        int y=sc.nextInt();
        System.out.println("enter the angle three");
        int z=sc.nextInt();
        if(x+y+z==180){
            System.out.println("Triangle can be formed");
        }
        else{
            System.out.println("Triangle can not be formed");
        }
    }
    
}
