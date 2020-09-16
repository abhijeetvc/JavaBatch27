public class Car {

    void start(){
        System.out.println("All cars have start option");
    }

    void run(){
        System.out.println("All cars run at max speed of 100");
    }
}

class Audi extends Car{

    void variant(){
        System.out.println("Audi has different variants");
    }
}

class Bmw extends Car{

    void variant(){
        System.out.println("Bmw has different variants");
    }
}

class MainCheck{
    public static void main(String[] args) {
        Audi a=new Audi();
        a.variant();
        Bmw b=new Bmw();
        b.variant();
        a.run();
        a.start();
    }
}