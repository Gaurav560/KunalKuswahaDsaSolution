import java.util.Scanner;

public class Q3Solution {
    public static void main(String[] args) {
        //area of rectangle
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length: ");
        int length= sc.nextInt();
        System.out.print("enter the breadth: ");
        int breadth= sc.nextInt();
        float area=length*breadth;
        System.out.println("the area is "+area);
    }
}
