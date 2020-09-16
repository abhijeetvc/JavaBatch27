public class MethodOverloadPrg {

    void display(){
        System.out.println("In display method");
    }

    void display(int a){
        System.out.println("Value of a: "+a);
    }
    public static void main(String[] args) {
        MethodOverloadPrg m=new MethodOverloadPrg();
        m.display();
        m.display(10);
    }
}
