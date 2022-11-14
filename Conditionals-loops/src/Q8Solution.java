import java.util.Scanner;

public class Q8Solution {
    public static void main(String[] args) {
        //perimeter of circle
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of circle: ");
        int radius=sc.nextInt();
        float perimeter=2*3.14f*radius;
        System.out.println("the perimeter  of circle is :"+perimeter);

    }
}
