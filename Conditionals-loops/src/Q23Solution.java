import java.util.Scanner;

public class Q23Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number u want to find all the factors for: ");
        int num=sc.nextInt();
        System.out.println("the factors of " + num + " are as follows:");
        for (int i=1;i<=num;i++) {
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
