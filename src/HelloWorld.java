//Variables : Storage area in memory
// Types of Variables: a) Instance variables, b) Local variables, c) Static/Class Variables, d) Parameters


import java.util.Scanner;
import java.util.function.BiFunction;

public class HelloWorld {

    int a=30;   // Instance variable

    public static void main(String[] args) {

        int x;  // 'x' is a variable holding value 10 //Local
        int y;  // Local

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x: ");
        x=sc.nextInt();
        System.out.println("Enter value of y:");
        y=sc.nextInt();

        int total=x+y;
        System.out.println(total);

//        HelloWorld h=new HelloWorld();   //Object creation
//        System.out.println("Value of a: "+h.a);

    }
}
