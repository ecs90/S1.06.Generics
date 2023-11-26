package n1exercici2;

public class Persona {
    private String nom;
    private String cognom;
    private int edad;

    public Persona(String nom, String cognom, int edad) {
        this.nom = nom;
        this.cognom = cognom;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdad() {
        return edad;
    }
}
