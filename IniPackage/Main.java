package IniPackage;

public class Main extends Polymorphism {
    public static void main(String[] args) {
        Inheritance turunan = new Inheritance();
        turunan.set_type();
        turunan.tampilanID();

        System.out.println();

        Polymorphism poly = new Polymorphism();
        poly.set_type();
    }
}
