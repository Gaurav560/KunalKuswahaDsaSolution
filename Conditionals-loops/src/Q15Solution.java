import java.util.Scanner;

public class Q15Solution {
    public static void main(String[] args) {
        //volume of prism=bh,where b=base area(u have to calculate that depending on the shape of your base) and h=height
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the base area please: ");
        float baseArea=sc.nextFloat();
        System.out.println("enter the height please: ");
        float height=sc.nextFloat();
        float volume=baseArea*height;
        System.out.println("the volume of prism is :"+volume);


    }
}
