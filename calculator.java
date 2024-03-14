import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter Two Number");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("What operation to do ?");
        System.out.println("1=add 2=sub 3=mul 4=div 5=modulo ");
        int z = sc.nextInt();
        switch (z){
            case 1:
                System.out.println("Add = "+(x+y));
                break;
            case 2:
                System.out.println(("Sub = "+(x-y)));
                break;
            case 3:
                System.out.println("mul = "+(x*y));
                break;
            case 4:
                System.out.println("div = "+(x/y));
                break;
            case 5:
                System.out.println("modulo = "+(x%y));
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
}
