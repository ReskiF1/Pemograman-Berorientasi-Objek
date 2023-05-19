package IniPackage;

public class Inheritance extends Enkapsulasi{
    public void set_type(){
        System.out.println("Ini Inheritance");
    }
    public void tampilanID(){
        Inheritance get = new Inheritance();
        get.ID("Reski Firmansyah", 1217050119, "IFC");
        System.out.println("Nama: " + get.getNama());
        System.out.println("NIM: " + get.getNIM());
        System.out.println("Kelas: " + get.getKelas());
    }
}