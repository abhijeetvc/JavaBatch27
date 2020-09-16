import java.util.Scanner;

public class SwitchPrg {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1=sc.nextInt();
        System.out.println("enter number2: ");
        int num2=sc.nextInt();

        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        int result=0;
        switch (choice){
            case 1:
                result=num1+num2;
                System.out.println("Addition: "+result);
                break;

            case 2:
                result=num1-num2;
                System.out.println("Subtraction: "+result);
                break;

            case 3:
                result=num1*num2;
                System.out.println("Multiplication: "+result);
                break;

            case 4:
                result=num1/num2;
                System.out.println("Division: "+result);
                break;

            default:
                System.out.println("Incorrect choice");
                break;
        }
    }
}
