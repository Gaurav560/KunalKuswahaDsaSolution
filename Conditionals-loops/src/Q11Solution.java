import java.util.Scanner;

public class Q11Solution {
    public static void main(String[] args) {
        //perimeter of square
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of any side: ");
        int sideLength=sc.nextInt();
        float perimeter=sideLength*4;
        System.out.println("the perimeter of square is :"+perimeter);
    }
}
