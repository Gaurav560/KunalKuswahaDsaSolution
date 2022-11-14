import java.util.Scanner;

public class Q18Solution {
    public static void main(String[] args) {

        //volume of pyramid
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base width: ");
         float baseWidth=sc.nextFloat();
        System.out.print("enter the base length: ");
        float baseLength=sc.nextFloat();
        System.out.print("enter the pyramid height: ");
        float heightOfPyramid=sc.nextFloat();
        float volumeOfPyramid=(baseWidth*baseLength*heightOfPyramid)/3.0f;
        System.out.println("the volume of pyramid is :"+volumeOfPyramid);
    }
}
