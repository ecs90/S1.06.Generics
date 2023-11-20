package n1exercici2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Ezequiel", "Salas", 32);
        String string = "Esto es un string";
        Integer integer = 5;

        GenericMethods gm = new GenericMethods();
        gm.printArgument(persona, string, integer);
    }
}
