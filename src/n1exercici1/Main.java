package n1exercici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods ngm1 = new NoGenericMethods("Eze", "Este", "Aquel");
        NoGenericMethods ngm2 = new NoGenericMethods("Aquel", "Eze", "Este");

        System.out.println(ngm1.getObj1() + ", " + ngm1.getObj2() + ", " +ngm1.getObj3());
        System.out.println(ngm2.getObj1() + ", " + ngm2.getObj2() + ", " +ngm2.getObj3());
    }
}
