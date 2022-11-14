import java.util.Scanner;

public class Q7Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of side length: ");
        int sideLength= sc.nextInt();
        float area=(1.732f/4)*sideLength*sideLength;
        System.out.println("the area of equilateral triangle: " + area);
    }
}
