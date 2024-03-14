import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
//        char c = 'x';
//        int x = c;
//        System.out.println(x);//ascii value of 'x'
        //for checking equal to condition in char we have to use == sign
        char ch ;
        System.out.println("Enter any character ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);//it will check character at 0 index as getting input in string format.
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
