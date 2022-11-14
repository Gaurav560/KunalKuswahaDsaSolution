import java.util.Scanner;

public class Q19Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of cylinder: ");
        float radius= sc.nextFloat();
        System.out.print("enter the height of cylinder: ");
        float height= sc.nextFloat();
        float curvedSurfaceArea=2*3.14f*radius*height;
        System.out.println("the curved surface area of cylinder is :"+curvedSurfaceArea);
    }
}
