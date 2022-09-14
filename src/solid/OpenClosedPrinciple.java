package solid;


// Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
public class OpenClosedPrinciple {
}



class  Calculator{


    double findResult(double num1, double num2, String operation){
        double result=0.0;
        switch (operation){
            case "+": {
                result = num1+num2;
                break;
            }
            case "-": {
                result = num1-num2;
                break;
            }
            default: {
                result = 0.0;
                break;
            }
        }

        return  result;
    }
}

// findResult() function needs modification in order to add new functionality like multiplication or any other operation
// so this is not following the OpenClosed Principle

/// Solution to that is

interface  BaseCalculator{
    double findResult(double num1, double num2);
}

class  AdditionOp implements  BaseCalculator{
    @Override
    public double findResult(double num1, double num2) {
        return num1+num2;
    }
}

class MultiplyOp implements  BaseCalculator{
    @Override
    public double findResult(double num1, double num2) {
        return num1*num2;
    }
}

/// so here we can see that we have implemented the BaseCalculator in such a way that there we don't have to do any
// modification if when new operation need to be applied, we just need to create new class and by implementing our
// interface we can perform new operations
