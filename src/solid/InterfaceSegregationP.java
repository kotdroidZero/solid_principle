package solid;


// Clients should not be forced to depend upon interfaces that they do not use.
public class InterfaceSegregationP {

}

class CoffeeException extends Exception {
    String exception;

    CoffeeException(String exception) {
        this.exception = exception;
    }
}

/// Explain the problem, it's violating the Interface Segregation Principle
interface CoffeeMachine {

    void addGroundCoffee() throws CoffeeException;

    void brewFilterCoffee() throws CoffeeException;


    /// added later, as New Machine Came for Espresso Coffee
    void brewEspressoCoffee() throws CoffeeException;
}

class BasicCoffeeMachine implements CoffeeMachine {


    @Override
    public void addGroundCoffee() throws CoffeeException {
        System.out.println("Ground Coffee added ");
    }

    @Override
    public void brewFilterCoffee() throws CoffeeException {
        System.out.println("Filter Coffee is Ready for you.");
    }

    @Override
    public void brewEspressoCoffee() throws CoffeeException {
        throw new CoffeeException("Espresso Coffee is not served here.");
    }
}

class EspressoCoffeeMachine implements CoffeeMachine {

    @Override
    public void addGroundCoffee() throws CoffeeException {
        System.out.println("Ground Coffee added ");
    }

    @Override
    public void brewFilterCoffee() throws CoffeeException {
        throw new CoffeeException("Filter Coffee is not served here.");
    }

    @Override
    public void brewEspressoCoffee() throws CoffeeException {
        System.out.println("Espresso Coffee is Ready for you.");
    }
}


///
interface CoffeeMachineV2 {
    void addGroundCoffee() throws CoffeeException;
}

interface EspressoMachineV2 extends CoffeeMachineV2 {
    void brewEspressoCoffee() throws CoffeeException;
}

interface FilterMachineV2 extends CoffeeMachineV2 {
    void brewFilterCoffee() throws CoffeeException;
}

class EspressoCoffeeMachineV2 implements EspressoMachineV2 {
    @Override
    public void addGroundCoffee() throws CoffeeException {
        System.out.println("Ground Coffee added ");
    }

    @Override
    public void brewEspressoCoffee() throws CoffeeException {
        System.out.println("Espresso Coffee is Ready for you");
    }
}

class BasiCoffeeMachineV2 implements FilterMachineV2 {
    @Override
    public void addGroundCoffee() throws CoffeeException {
        System.out.println("Ground Coffee added ");
    }

    @Override
    public void brewFilterCoffee() throws CoffeeException {
        System.out.println("Filter Coffee is Ready for you");
    }
}





