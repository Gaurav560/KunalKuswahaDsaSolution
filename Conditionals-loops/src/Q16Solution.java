import java.util.Scanner;

public class Q16Solution {
    public static void main(String[] args) {
        //volume of cylinder
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of base of cylinder: ");
        float radius=sc.nextFloat();
        System.out.print("enter the height  of the cylinder: ");
        float height=sc.nextFloat();
        float volume=3.14f*radius*radius*height;//always remember to use float wisely
        System.out.println("the volume of  cylinder is :"+volume);

    }
}
