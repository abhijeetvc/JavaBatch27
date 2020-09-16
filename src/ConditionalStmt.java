import java.util.Scanner;

public class ConditionalStmt {

    public static void main(String[] args) {
     //   int age=21;

//        if(age>=21){
//            System.out.println("Adult");
//        }else{
//            System.out.println("Child");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks=sc.nextInt();

        if(marks>=80){
            System.out.println("Grade A");
        }else if(marks>=70){
            System.out.println("Grade B");
        }else if(marks>=50){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }

    }
}
