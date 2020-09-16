abstract class Demo1{

    abstract void display();

    void checkData(){
        System.out.println("In check data method");
    }
}
abstract class Demo2 extends Demo1{

    abstract void withdraw();
    abstract void deposit();
}

public class AbstractProgram extends Demo2{
    public static void main(String[] args) {
        AbstractProgram ap=new AbstractProgram();
        ap.display();
        ap.checkData();
        ap.deposit();
        ap.withdraw();
    }
    @Override  //annotation
    void display() {
        System.out.println("in display method");
    }

    @Override
    void withdraw() {
        System.out.println("in withdraw method");
    }

    @Override
    void deposit() {
        System.out.println("in deposit method");
    }
}
