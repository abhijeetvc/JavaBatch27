import java.util.Scanner;

public class DoWhilePrg {

    public static void main(String[] args) {
        int total=0;
        int num;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter number: ");
            num=sc.nextInt();
            total+=num;
        }while(num!=0);
        System.out.println("Result is: "+total);
    }
}
