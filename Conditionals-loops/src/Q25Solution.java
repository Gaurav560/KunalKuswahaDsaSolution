import java.util.Scanner;

public class Q25Solution {
    public static void main(String[] args) {
        //take inputs un till 0 is not pressed and throws largest number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number please: ");
        int num= sc.nextInt();
        int temp=0;
        while (num!=0){
            if (num>temp){
                temp=num;
            }num= sc.nextInt();
        }
        System.out.println("the greatest of all the numbers u have entered is : "+temp);
    }
}
