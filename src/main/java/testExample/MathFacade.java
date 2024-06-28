package testExample;

/*
This class can be given to students.
They can use their own methods to implement the facade
Within the test class only methods from this class will be used
 */
public class MathFacade {
    public int pow(int a, int b) {
        //throw new RuntimeException("Not implemented");
        return Maths.pow(a, b);
    }
    public int add(int a, int b) {
        throw new RuntimeException("Not implemented");
    }
    public int sub(int a, int b) {
        throw new RuntimeException("Not implemented");
    }
}
