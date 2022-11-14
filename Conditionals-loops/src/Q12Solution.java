import java.util.Scanner;

public class Q12Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of parallel side1: ");
        int side1=sc.nextInt();
        System.out.print("enter the length of second parallel side2: ");
        int side2=sc.nextInt();
        float perimeter=2*(side1+side2);
        System.out.println("the perimeter of parallelogram is :"+perimeter);
    }
}
