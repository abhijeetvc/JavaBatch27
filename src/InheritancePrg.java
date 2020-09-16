//Inheritance: Re-usability of code
// Types: a) Single , b) Multilevel, c) Hierarchical, d) Multiple, e) Hybrid
class Demo{

    void checkData(){
        System.out.println("In check data method");
    }
}

public class InheritancePrg extends Demo{

    void display(){
        System.out.println("in display method");
    }

    public static void main(String[] args) {
        InheritancePrg i=new InheritancePrg();
        i.display();
        i.checkData();
    }
}
