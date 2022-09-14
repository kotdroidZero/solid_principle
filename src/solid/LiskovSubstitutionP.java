package solid;


//Specify in the parent class only the common properties and methods, leaving any specialization to the child classes

//the Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of its
// subclasses without breaking the application. In other words, what we want is to have the objects of our subclasses
// behaving the same way as the objects of our superclass.
public class LiskovSubstitutionP {
    public static void main(String[] args) {

        // Allowed, Child's Object(actual object created on Heap Memory) can be accessed by
        // Parent Reference (Remote Control, variable created on stack),as Child is type of Parent (IS-A relationship)
        // also in simple language, every Lion is a Animal , so Animal Remote control can access the Lion's actual object.
        Animal a = new Lion();
        a.display();

        Wild w = new Wild();




        // Not Allowed, Parent Object (actual object created on Heap Memory) can not be accessed by
        // Child's Reference as it's object is not created on heap yet.
        // also in simple language , every animal is not a Pet so Pet's Remote Control cannot access it.
        // Pet p = new  Animal();



        /// Need To Clear
        //“If for each object o1 of type S there is an object o2 of type T such that for all programs P
        // defined in terms of T, the behavior of P is unchanged when o1 is substituted for o2 then S is a subtype of T.”

        Dog o1 = new Dog(); /// S
        Pet o2 = new Pet(); /// T


        o1.display();
        o2.display();

        o2= o1;

        o2.display();

    }
}

class  Animal {
    void display(){
        System.out.println("I'm Animal");
    }
}

class  Pet extends  Animal{
    @Override
    void display() {
        System.out.println("I'm Pet");
    }
}

class  Wild extends  Animal{
    @Override
    void display() {
        System.out.println("I'm Wild");
    }
}

class  Dog extends  Pet{

}

class  Lion extends  Wild{
    @Override
    void display() {
        System.out.println("I'm Lion");
    }
}




