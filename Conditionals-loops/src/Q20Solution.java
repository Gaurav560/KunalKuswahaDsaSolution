import java.util.Scanner;

public class Q20Solution {
    public static void main(String[] args) {
        //total surface area of cube
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the side length of cube: ");
        float side=sc.nextFloat();
        float totalSurfaceArea=6*side*side;
        System.out.println("total surface area of cube is :"+totalSurfaceArea);
    }
}
