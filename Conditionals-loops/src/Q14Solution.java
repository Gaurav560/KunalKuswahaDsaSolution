import java.util.Scanner;

public class Q14Solution {
    public static void main(String[] args) {
        //volume of cone
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of base of cone: ");
        float radius=sc.nextFloat();
        System.out.print("enter the height  of the cone: ");
        float height=sc.nextFloat();
        float volume=(1.0f/3.0f)*3.14F*radius*radius*height;//always remember to use float wisely
        System.out.println("the volume of  cone is :"+volume);


    }
}
