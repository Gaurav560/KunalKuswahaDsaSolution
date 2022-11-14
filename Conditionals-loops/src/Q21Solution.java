import java.util.Scanner;

public class Q21Solution {
    public static void main(String[] args) {
        //fibonacci series
        Scanner sc=new Scanner(System.in);
        int firstNumber=0;
        int secondNumber=1;
        int sum=0;
        System.out.println("enter the number up to which u want to print the fibonacci series" +
                "number excluding initial 0 and 1: ");
        int num=sc.nextInt();
        System.out.print(firstNumber+" "+secondNumber+" ");
        for (int i = 1; i <=num; i++) {
            sum=firstNumber+secondNumber;
            System.out.print(sum+" ");
            firstNumber=secondNumber;
            secondNumber=sum;

        }
    }
}
