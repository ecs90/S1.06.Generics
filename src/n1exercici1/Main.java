package n1exercici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods ngm1 = new NoGenericMethods("Eze", "Este", "Aquel");
        NoGenericMethods ngm2 = new NoGenericMethods("Aquel", "Eze", "Este");

        System.out.println(ngm1.obj1 + ", " + ngm1.obj2 + ", " +ngm1.obj3);
        System.out.println(ngm2.obj1 + ", " + ngm2.obj2 + ", " +ngm2.obj3);
    }
}
