public class Animal {
    void eat(){
        System.out.println("All animals eat");
    }

    void run(){
        eat();
        System.out.println("All animals run");
    }
}

class Dog extends Animal{

    void bark(){

        System.out.println("All dogs bark");
    }
}

class Puppy extends Dog{

    void bark1(){
        System.out.println("All puppies do bark");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.bark();
        p.eat();
        p.run();
        p.bark1();
    }
}
