import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter Year :-");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if((((x%4)==0) || ((x%100)==0) )|| ((x%400)==0)){
            System.out.println("leap year ");
        }
        else {
            System.out.println("Not leap year ..");
        }

    }
}
