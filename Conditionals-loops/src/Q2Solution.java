import java.util.Scanner;

public class Q2Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base: ");
        int base=sc.nextInt();
        System.out.print("enter the height: ");
        int height= sc.nextInt();
        float area=(base*height)/2;
        System.out.println("the area of triangle is :"+area);

    }
}
