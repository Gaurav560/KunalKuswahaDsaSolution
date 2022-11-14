import java.util.Scanner;

public class Q22Solution {
    public static void main(String[] args) {
        //subtract the product and sum of digits  of an integer
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number please:");
        int num=sc.nextInt();
        int sum=0;
        int mul=1;
        while (num>0){
            sum+=num%10;
                mul*=num%10;
            num=num/10;
        }if (sum>mul){
            System.out.print("the difference is:"+(sum-mul));
        }else {
            System.out.print("the difference is:"+(mul-sum));
        }

    }
}
