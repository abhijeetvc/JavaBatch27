//Access Specifier: a) public, b) private, c) protected, d) default

import java.util.Scanner;

//Method: Method will have: a) Access modifier, b) return type, c) method name, d) parameters
public class JavaMethods {

    void display(int a){  //void means return nothing
        System.out.println("Value of a: "+a);
    }

    void display1(int x,int y){
        int total=x+y;
        System.out.println("Total is: "+total);
    }

    public static void main(String[] args) {
        JavaMethods jm=new JavaMethods();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a1=sc.nextInt();
        jm.display(a1);
        System.out.println("Enter value for x: ");
        int x=sc.nextInt();
        System.out.println("Enter value for y: ");
        int y=sc.nextInt();
        jm.display1(x,y);
    }
}
