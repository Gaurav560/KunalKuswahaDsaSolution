import java.util.Scanner;
import java.lang.Math;

public class Q4Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of equal sides: ");
        double equalSide= sc.nextDouble();
        System.out.println("enter the base of isosceles triangle: ");
        double base= sc.nextDouble();
        double area=(base/2)*Math.sqrt((equalSide*equalSide)-((base*base)/4));
        System.out.println("the area of triangle is :"+area);

    }
}
