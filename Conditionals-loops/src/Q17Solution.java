import java.util.Scanner;

public class Q17Solution {
    public static void main(String[] args) {
        //volume of sphere
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of sphere:");
        float radius=sc.nextFloat();
        float volume=(4.0f/3.0f)*3.14f*radius*radius*radius;
        System.out.println("the volume of sphere is : "+volume);


    }
}
