import java.util.Scanner;

public class Q6Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the diagonal 1: ");
        int diagonal1=sc.nextInt();
        System.out.print("enter the diagonal 2: ");
        int diagonal2=sc.nextInt();
        float area=(diagonal1*diagonal2)/2;
        System.out.println("the area of rhombus is:"+area);
    }
}
