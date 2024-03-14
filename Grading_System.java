import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        System.out.println("Enter u r marks");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x>=35 && x<=59){
            System.out.println("Grade C ");
        } else if (x>=60 && x<=75) {
            System.out.println("Grade B");

        } else if (x>=76 && x<=100) {
            System.out.println("Grade A");

        }
        else {
            System.out.println("You Fail In Exam ......");
        }
    }
}
