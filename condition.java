import java.util.Scanner;

public class condition {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE AGE");
        int age = in.nextInt();

        if(age<20)
            System.out.println("sorry no access");
        else
            System.out.println("access granted");
    }
}