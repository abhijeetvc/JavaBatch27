interface Vehicle{

    void start();  // by default all the method of interface are public and abstract
}

interface Vehicle1 {
    void run();
}

public class Audi1 implements Vehicle1,Vehicle{
    @Override
    public void start() {
        System.out.println("Inside start method...");
    }

    public static void main(String[] args) {
        Audi1 a1=new Audi1();
        a1.start();
        a1.run();
    }
    @Override
    public void run() {
        System.out.println("in run method...");
    }
}
