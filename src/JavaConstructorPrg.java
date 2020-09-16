import java.util.Scanner;

public class JavaConstructorPrg {

    int a;  // instance variables
    int b;
    int result;
    // Constructors are used for initialization
    public JavaConstructorPrg(int a,int b){
        this.a=a;     // this is a keyword in java. It is used to refer to current object
        this.b=b;
       // System.out.println("Value of a: "+a);
    }

    void add(){
        result=a+b;
        System.out.println("Addition is: "+result);
    }

    void multiply(){
        result=a*b;
        System.out.println("Multiplication is: "+result);
    }

    void sub(){
        result=a-b;
        System.out.println("SUbtraction is: "+result);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number2: ");
        int num2=sc.nextInt();
        JavaConstructorPrg j=new JavaConstructorPrg(num1,num2);
        j.add();
        j.multiply();
        j.sub();
    }
}
