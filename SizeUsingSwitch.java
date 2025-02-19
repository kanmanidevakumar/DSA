import java.util.Scanner;
public class SizeUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size like 29 for small,30 for medium ,38 for large and 42 for xlarge");
        int size=sc.nextInt();
        switch(size){
            case 29:System.out.println("small");
                    break;
            case 30:System.out.println("medium");
                    break;
            case 38:System.out.println("large");
                    break;
            case 42:System.out.println("xlarge");
                    break;
            default:System.out.println("Invalid");
        }
    }

    
}
