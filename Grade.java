import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mark");
        int mark=sc.nextInt();
        if(mark>=90){
            System.out.println("GRADE A");
        }
        else if(mark>=80 && mark<90){
            System.out.println("GRADE B");
        }
        else if(mark>=60 && mark<80){
            System.out.println("GRADE C");
        }
        else if(mark>=35 && mark<60){
            System.out.println("GRADE D");
        }
        else{
            System.out.println("FAIL");
        }
    }
    
}
