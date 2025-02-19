import java.util.Scanner;
public class NtimesName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the FirstName");
        String f_name=sc.nextLine();
        System.out.println("enter the LastName");
        String l_name=sc.nextLine();
        
        String full_name=f_name+l_name;
        System.out.println("how many times the name to be printed");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println(full_name);
        }
    }
    
}
