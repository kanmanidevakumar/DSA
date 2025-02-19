import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the interger");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the string");
        String name=sc.nextLine();
        
        
        System.out.println("enter the character");
        char x=sc.next().charAt(0);
        System.out.println(num);
        System.out.println(name);
        System.out.println(x);

    }
    
}
