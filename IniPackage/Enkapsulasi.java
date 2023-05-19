package IniPackage;

public class Enkapsulasi {
    private String nama, kelas;
    private int nim;

    public void ID(String namaObjek, int nimObjek, String kelasObjek){
        this.nama = namaObjek;
        this.nim = nimObjek;
        this.kelas = kelasObjek;
    }

    public String getNama(){
        return nama;
    }
    public int getNIM(){
        return nim;
    }
    public String getKelas(){
        return kelas;
    }
}
