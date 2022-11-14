import java.util.Scanner;

public class Q24Solution {
    public static void main(String[] args) {
        //sum of all numbers till number entered 0
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number please: ");
        int num=sc.nextInt();//ye to sirf ek baar hi value input karwane ke liye thi
        int sum=0;
        while (num!=0){
              sum += num;
              num= sc.nextInt();//baar  baar to value ye update karwayegi num ki
        }
        System.out.println("the addition of all numbers is : " + sum);
    }

}
