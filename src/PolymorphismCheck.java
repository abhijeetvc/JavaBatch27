//Polymorphism: Same name having multiple forms
// Types: a) Runtime Polymorphism, 2) Compile time

// Runtime e.g: Method Overriding (Possible in inheritance)
// Compile Time e.g: Method Overloading (Same/single class)
class Vehicle2{
    void start(){
        System.out.println("All vehicles have start option");
    }
}

class Audi2 extends Vehicle2{

    void start(){
        System.out.println("Audi starts smoothly");
    }

}

class Bmw2 extends Vehicle2{

    void start(){
        System.out.println("Bmw starts very smoothly");
    }
}
public class PolymorphismCheck {

    public static void main(String[] args) {
        Audi2 a=new Audi2();
        a.start();
        Bmw2 b=new Bmw2();
        b.start();
    }
}
