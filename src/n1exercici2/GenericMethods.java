package n1exercici2;

public class GenericMethods {
    public GenericMethods() {
    }

    public <A, B, C> void printArgument(A arg1, B arg2, C arg3)
    {
        System.out.println("El argumento 1 es " + arg1 + ", el argumento 2 es " + arg2 + " y el argumento 3 es " + arg3);
    }
}
