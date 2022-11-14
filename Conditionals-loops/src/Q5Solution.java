import java.util.Scanner;

public class Q5Solution {
    public static void main(String[] args) {
        //area of parallelogram
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base: ");
        int base=sc.nextInt();
        System.out.print("enter the height : ");
        int height=sc.nextInt();
        float area=height*base;
        System.out.println("the area of parallelogram: " + area);
    }
}
