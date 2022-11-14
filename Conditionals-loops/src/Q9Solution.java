import java.util.Scanner;

public class Q9Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the side length of the equilateral triangle: ");
        int side=sc.nextInt();
        float perimeter=3*side;
        System.out.println("the perimeter is :"+perimeter);
    }
}
