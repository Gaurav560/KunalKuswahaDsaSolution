import java.util.Scanner;

public class Q10Solution {
    public static void main(String[] args) {
        //perimeter of rectangle
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of rectangle: ");
        int length=sc.nextInt();
        System.out.print("enter the breadth of rectangle: ");
        int breadth= sc.nextInt();
        float perimeter=2*length+2*breadth;
        System.out.println("the perimeter of rectangle is :"+perimeter);
    }
}
