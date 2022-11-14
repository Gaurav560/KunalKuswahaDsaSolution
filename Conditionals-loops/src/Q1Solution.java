import java.util.Scanner;

public class Q1Solution {
    public static void main(String[] args) {
        //area of circle
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius:");
        int radius=sc.nextInt();
        float area=3.14f*radius*radius;
        System.out.println("the area of circle is: " + area);

    }
}
